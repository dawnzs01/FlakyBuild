/*
 * This file is part of packetevents - https://github.com/retrooper/packetevents
 * Copyright (C) 2022 retrooper and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.github.retrooper.packetevents.velocity.factory;

import java.util.logging.Level;

import org.jetbrains.annotations.Nullable;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.PacketEventsAPI;
import com.github.retrooper.packetevents.event.UserLoginEvent;
import com.github.retrooper.packetevents.injector.ChannelInjector;
import com.github.retrooper.packetevents.manager.InternalPacketListener;
import com.github.retrooper.packetevents.manager.player.PlayerManager;
import com.github.retrooper.packetevents.manager.protocol.ProtocolManager;
import com.github.retrooper.packetevents.manager.server.ServerManager;
import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.netty.NettyManager;
import com.github.retrooper.packetevents.protocol.ProtocolVersion;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.protocol.player.User;
import com.github.retrooper.packetevents.settings.PacketEventsSettings;
import com.github.retrooper.packetevents.util.LogManager;
import com.velocitypowered.api.event.connection.PostLoginEvent;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;

import io.github.retrooper.packetevents.impl.netty.NettyManagerImpl;
import io.github.retrooper.packetevents.impl.netty.manager.player.PlayerManagerAbstract;
import io.github.retrooper.packetevents.impl.netty.manager.protocol.ProtocolManagerAbstract;
import io.github.retrooper.packetevents.impl.netty.manager.server.ServerManagerAbstract;
import io.github.retrooper.packetevents.injector.VelocityPipelineInjector;
import io.github.retrooper.packetevents.manager.PlayerManagerImpl;
import net.kyori.adventure.text.format.NamedTextColor;

public class VelocityPacketEventsBuilder {
    private static PacketEventsAPI<PluginContainer> INSTANCE;

    public static void clearBuildCache() {
        INSTANCE = null;
    }

    public static PacketEventsAPI<PluginContainer> build(ProxyServer server, PluginContainer plugin) {
        if (INSTANCE == null) {
            INSTANCE = buildNoCache(server, plugin);
        }
        return INSTANCE;
    }

    public static PacketEventsAPI<PluginContainer> build(ProxyServer server, PluginContainer plugin,
            PacketEventsSettings settings) {
        if (INSTANCE == null) {
            INSTANCE = buildNoCache(server, plugin, settings);
        }
        return INSTANCE;
    }

    public static PacketEventsAPI<PluginContainer> buildNoCache(ProxyServer server, PluginContainer plugin) {
        return buildNoCache(server, plugin, new PacketEventsSettings());
    }

    public static PacketEventsAPI<PluginContainer> buildNoCache(ProxyServer server, PluginContainer plugin,
            PacketEventsSettings inSettings) {
        return new PacketEventsAPI<PluginContainer>() {
            private final PacketEventsSettings settings = inSettings;
            // TODO Implement platform version
            private final ProtocolManager protocolManager = new ProtocolManagerAbstract() {
                @Override
                public ProtocolVersion getPlatformVersion() {
                    return ProtocolVersion.UNKNOWN;
                }
            };
            private final ServerManager serverManager = new ServerManagerAbstract() {
                private ServerVersion version;

                @Override
                public ServerVersion getVersion() {
                    if (version == null) {
                        String velocityVersion = com.velocitypowered.api.network.ProtocolVersion.MAXIMUM_VERSION
                                .getName();

                        for (final ServerVersion val : ServerVersion.values()) {
                            if (val.getReleaseName().contains(velocityVersion)) {
                                return version = val;
                            }
                        }
                        return null;
                    }
                    return version;
                }
            };

            private final PlayerManagerAbstract playerManager = new PlayerManagerImpl();

            private final ChannelInjector injector = new VelocityPipelineInjector(server);
            private final NettyManager nettyManager = new NettyManagerImpl();
            private final LogManager logManager = new LogManager() {
                @Override
                protected void log(Level level, @Nullable NamedTextColor color, String message) {
                    System.out.println(message);
                }
            };
            private boolean loaded;
            private boolean initialized;

            @Override
            public void load() {
                if (!loaded) {
                    String id = plugin.getDescription().getId();
                    // Resolve server version and cache
                    PacketEvents.IDENTIFIER = "pe-" + id;
                    PacketEvents.ENCODER_NAME = "pe-encoder-" + id;
                    PacketEvents.DECODER_NAME = "pe-decoder-" + id;
                    PacketEvents.CONNECTION_HANDLER_NAME = "pe-connection-handler-" + id;
                    PacketEvents.SERVER_CHANNEL_HANDLER_NAME = "pe-connection-initializer-" + id;
                    PacketEvents.TIMEOUT_HANDLER_NAME = "pe-timeout-handler-" + id;
                    injector.inject();

                    loaded = true;

                    // Register internal packet listener (should be the first listener)
                    // This listener doesn't do any modifications to the packets, just reads data
                    getEventManager().registerListener(new InternalPacketListener());
                }
            }

            @Override
            public boolean isLoaded() {
                return loaded;
            }

            @Override
            public void init() {
                // Load if we haven't loaded already
                load();
                if (!initialized) {
                    server.getEventManager().register(plugin.getInstance().orElse(null), PostLoginEvent.class,
                            (event) -> {
                                Player player = event.getPlayer();
                                Object channel = PacketEvents.getAPI().getPlayerManager().getChannel(player);
                                PacketEvents.getAPI().getInjector().setPlayer(channel, player);

                                User user = PacketEvents.getAPI().getPlayerManager().getUser(player);
                                if (user == null)
                                    return;

                                UserLoginEvent loginEvent = new UserLoginEvent(user, player);
                                PacketEvents.getAPI().getEventManager().callEvent(loginEvent);
                            });
                    if (settings.shouldCheckForUpdates()) {
                        getUpdateChecker().handleUpdateCheck();
                    }

                    if (settings.isbStatsEnabled()) {
                        // TODO Cross-platform metrics?
                    }

                    PacketType.Play.Client.load();
                    PacketType.Play.Server.load();
                    initialized = true;
                }
            }

            @Override
            public boolean isInitialized() {
                return initialized;
            }

            @Override
            public void terminate() {
                if (initialized) {
                    // Eject the injector if needed(depends on the injector implementation)
                    injector.uninject();
                    // Unregister all our listeners
                    getEventManager().unregisterAllListeners();
                    initialized = false;
                }
            }

            @Override
            public LogManager getLogManager() {
                return logManager;
            }

            @Override
            public PluginContainer getPlugin() {
                return plugin;
            }

            @Override
            public ProtocolManager getProtocolManager() {
                return protocolManager;
            }

            @Override
            public ServerManager getServerManager() {
                return serverManager;
            }

            @Override
            public PlayerManager getPlayerManager() {
                return playerManager;
            }

            @Override
            public ChannelInjector getInjector() {
                return injector;
            }

            @Override
            public PacketEventsSettings getSettings() {
                return settings;
            }

            @Override
            public NettyManager getNettyManager() {
                return nettyManager;
            }
        };
    }
}

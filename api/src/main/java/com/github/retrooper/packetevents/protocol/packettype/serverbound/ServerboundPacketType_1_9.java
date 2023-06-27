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

package com.github.retrooper.packetevents.protocol.packettype.serverbound;

public enum ServerboundPacketType_1_9 {
    TELEPORT_CONFIRM,
    TAB_COMPLETE,
    CHAT_MESSAGE,
    CLIENT_STATUS,
    CLIENT_SETTINGS,
    WINDOW_CONFIRMATION,
    CLICK_WINDOW_BUTTON,
    CLICK_WINDOW,
    CLOSE_WINDOW,
    PLUGIN_MESSAGE,
    INTERACT_ENTITY,
    KEEP_ALIVE,
    PLAYER_POSITION,
    PLAYER_POSITION_AND_ROTATION,
    PLAYER_ROTATION,
    PLAYER_FLYING,
    VEHICLE_MOVE,
    STEER_BOAT,
    PLAYER_ABILITIES,
    PLAYER_DIGGING,
    ENTITY_ACTION,
    STEER_VEHICLE,
    RESOURCE_PACK_STATUS,
    HELD_ITEM_CHANGE,
    CREATIVE_INVENTORY_ACTION,
    UPDATE_SIGN,
    ANIMATION,
    SPECTATE,
    PLAYER_BLOCK_PLACEMENT,
    USE_ITEM
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerLuaShellNotify.proto

package emu.grasscutter.net.proto;

public final class PlayerLuaShellNotifyOuterClass {
  private PlayerLuaShellNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerLuaShellNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerLuaShellNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes lua_shell = 7;</code>
     * @return The luaShell.
     */
    com.google.protobuf.ByteString getLuaShell();

    /**
     * <code>.LuaShellType shell_type = 13;</code>
     * @return The enum numeric value on the wire for shellType.
     */
    int getShellTypeValue();
    /**
     * <code>.LuaShellType shell_type = 13;</code>
     * @return The shellType.
     */
    emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType getShellType();

    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 use_type = 10;</code>
     * @return The useType.
     */
    int getUseType();
  }
  /**
   * <pre>
   * CmdId: 115
   * Obf: LPFCBHBJBLP
   * </pre>
   *
   * Protobuf type {@code PlayerLuaShellNotify}
   */
  public static final class PlayerLuaShellNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerLuaShellNotify)
      PlayerLuaShellNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerLuaShellNotify.newBuilder() to construct.
    private PlayerLuaShellNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerLuaShellNotify() {
      luaShell_ = com.google.protobuf.ByteString.EMPTY;
      shellType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerLuaShellNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerLuaShellNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              id_ = input.readUInt32();
              break;
            }
            case 58: {

              luaShell_ = input.readBytes();
              break;
            }
            case 80: {

              useType_ = input.readUInt32();
              break;
            }
            case 104: {
              int rawValue = input.readEnum();

              shellType_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.internal_static_PlayerLuaShellNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.internal_static_PlayerLuaShellNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.class, emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.Builder.class);
    }

    public static final int LUA_SHELL_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString luaShell_;
    /**
     * <code>bytes lua_shell = 7;</code>
     * @return The luaShell.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getLuaShell() {
      return luaShell_;
    }

    public static final int SHELL_TYPE_FIELD_NUMBER = 13;
    private int shellType_;
    /**
     * <code>.LuaShellType shell_type = 13;</code>
     * @return The enum numeric value on the wire for shellType.
     */
    @java.lang.Override public int getShellTypeValue() {
      return shellType_;
    }
    /**
     * <code>.LuaShellType shell_type = 13;</code>
     * @return The shellType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType getShellType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType result = emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.valueOf(shellType_);
      return result == null ? emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.UNRECOGNIZED : result;
    }

    public static final int ID_FIELD_NUMBER = 4;
    private int id_;
    /**
     * <code>uint32 id = 4;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int USE_TYPE_FIELD_NUMBER = 10;
    private int useType_;
    /**
     * <code>uint32 use_type = 10;</code>
     * @return The useType.
     */
    @java.lang.Override
    public int getUseType() {
      return useType_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeUInt32(4, id_);
      }
      if (!luaShell_.isEmpty()) {
        output.writeBytes(7, luaShell_);
      }
      if (useType_ != 0) {
        output.writeUInt32(10, useType_);
      }
      if (shellType_ != emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.LUASHELL_NONE.getNumber()) {
        output.writeEnum(13, shellType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, id_);
      }
      if (!luaShell_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, luaShell_);
      }
      if (useType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, useType_);
      }
      if (shellType_ != emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.LUASHELL_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(13, shellType_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify other = (emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify) obj;

      if (!getLuaShell()
          .equals(other.getLuaShell())) return false;
      if (shellType_ != other.shellType_) return false;
      if (getId()
          != other.getId()) return false;
      if (getUseType()
          != other.getUseType()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LUA_SHELL_FIELD_NUMBER;
      hash = (53 * hash) + getLuaShell().hashCode();
      hash = (37 * hash) + SHELL_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + shellType_;
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + USE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getUseType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 115
     * Obf: LPFCBHBJBLP
     * </pre>
     *
     * Protobuf type {@code PlayerLuaShellNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerLuaShellNotify)
        emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.internal_static_PlayerLuaShellNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.internal_static_PlayerLuaShellNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.class, emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        luaShell_ = com.google.protobuf.ByteString.EMPTY;

        shellType_ = 0;

        id_ = 0;

        useType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.internal_static_PlayerLuaShellNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify build() {
        emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify buildPartial() {
        emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify result = new emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify(this);
        result.luaShell_ = luaShell_;
        result.shellType_ = shellType_;
        result.id_ = id_;
        result.useType_ = useType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify other) {
        if (other == emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify.getDefaultInstance()) return this;
        if (other.getLuaShell() != com.google.protobuf.ByteString.EMPTY) {
          setLuaShell(other.getLuaShell());
        }
        if (other.shellType_ != 0) {
          setShellTypeValue(other.getShellTypeValue());
        }
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.getUseType() != 0) {
          setUseType(other.getUseType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString luaShell_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes lua_shell = 7;</code>
       * @return The luaShell.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getLuaShell() {
        return luaShell_;
      }
      /**
       * <code>bytes lua_shell = 7;</code>
       * @param value The luaShell to set.
       * @return This builder for chaining.
       */
      public Builder setLuaShell(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        luaShell_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes lua_shell = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLuaShell() {
        
        luaShell_ = getDefaultInstance().getLuaShell();
        onChanged();
        return this;
      }

      private int shellType_ = 0;
      /**
       * <code>.LuaShellType shell_type = 13;</code>
       * @return The enum numeric value on the wire for shellType.
       */
      @java.lang.Override public int getShellTypeValue() {
        return shellType_;
      }
      /**
       * <code>.LuaShellType shell_type = 13;</code>
       * @param value The enum numeric value on the wire for shellType to set.
       * @return This builder for chaining.
       */
      public Builder setShellTypeValue(int value) {
        
        shellType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.LuaShellType shell_type = 13;</code>
       * @return The shellType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType getShellType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType result = emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.valueOf(shellType_);
        return result == null ? emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType.UNRECOGNIZED : result;
      }
      /**
       * <code>.LuaShellType shell_type = 13;</code>
       * @param value The shellType to set.
       * @return This builder for chaining.
       */
      public Builder setShellType(emu.grasscutter.net.proto.LuaShellTypeOuterClass.LuaShellType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        shellType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.LuaShellType shell_type = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearShellType() {
        
        shellType_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 4;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int useType_ ;
      /**
       * <code>uint32 use_type = 10;</code>
       * @return The useType.
       */
      @java.lang.Override
      public int getUseType() {
        return useType_;
      }
      /**
       * <code>uint32 use_type = 10;</code>
       * @param value The useType to set.
       * @return This builder for chaining.
       */
      public Builder setUseType(int value) {
        
        useType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 use_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseType() {
        
        useType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PlayerLuaShellNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerLuaShellNotify)
    private static final emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify();
    }

    public static emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerLuaShellNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerLuaShellNotify>() {
      @java.lang.Override
      public PlayerLuaShellNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerLuaShellNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerLuaShellNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerLuaShellNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerLuaShellNotifyOuterClass.PlayerLuaShellNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerLuaShellNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerLuaShellNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032PlayerLuaShellNotify.proto\032\022LuaShellTy" +
      "pe.proto\"j\n\024PlayerLuaShellNotify\022\021\n\tlua_" +
      "shell\030\007 \001(\014\022!\n\nshell_type\030\r \001(\0162\r.LuaShe" +
      "llType\022\n\n\002id\030\004 \001(\r\022\020\n\010use_type\030\n \001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LuaShellTypeOuterClass.getDescriptor(),
        });
    internal_static_PlayerLuaShellNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerLuaShellNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerLuaShellNotify_descriptor,
        new java.lang.String[] { "LuaShell", "ShellType", "Id", "UseType", });
    emu.grasscutter.net.proto.LuaShellTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

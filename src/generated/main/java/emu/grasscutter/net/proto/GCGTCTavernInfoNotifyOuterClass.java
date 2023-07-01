// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGTCTavernInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GCGTCTavernInfoNotifyOuterClass {
  private GCGTCTavernInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGTCTavernInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGTCTavernInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
     * <code>bool GDNNFNKDFIP = 7;</code>
     * @return The gDNNFNKDFIP.
     */
    boolean getGDNNFNKDFIP();

    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 character_id = 2;</code>
     * @return The characterId.
     */
    int getCharacterId();

    /**
     * <code>uint32 element_type = 5;</code>
     * @return The elementType.
     */
    int getElementType();

    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    int getAvatarId();

    /**
     * <code>bool OAIBMHHIOFA = 11;</code>
     * @return The oAIBMHHIOFA.
     */
    boolean getOAIBMHHIOFA();
  }
  /**
   * <pre>
   * CmdId: 7194
   * Obf: LGEBINHGCCF
   * </pre>
   *
   * Protobuf type {@code GCGTCTavernInfoNotify}
   */
  public static final class GCGTCTavernInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGTCTavernInfoNotify)
      GCGTCTavernInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGTCTavernInfoNotify.newBuilder() to construct.
    private GCGTCTavernInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGTCTavernInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGTCTavernInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGTCTavernInfoNotify(
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
            case 16: {

              characterId_ = input.readUInt32();
              break;
            }
            case 40: {

              elementType_ = input.readUInt32();
              break;
            }
            case 56: {

              gDNNFNKDFIP_ = input.readBool();
              break;
            }
            case 64: {

              pointId_ = input.readUInt32();
              break;
            }
            case 88: {

              oAIBMHHIOFA_ = input.readBool();
              break;
            }
            case 96: {

              avatarId_ = input.readUInt32();
              break;
            }
            case 112: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 14;
    private int levelId_;
    /**
     * <code>uint32 level_id = 14;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int GDNNFNKDFIP_FIELD_NUMBER = 7;
    private boolean gDNNFNKDFIP_;
    /**
     * <code>bool GDNNFNKDFIP = 7;</code>
     * @return The gDNNFNKDFIP.
     */
    @java.lang.Override
    public boolean getGDNNFNKDFIP() {
      return gDNNFNKDFIP_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 8;
    private int pointId_;
    /**
     * <code>uint32 point_id = 8;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int CHARACTER_ID_FIELD_NUMBER = 2;
    private int characterId_;
    /**
     * <code>uint32 character_id = 2;</code>
     * @return The characterId.
     */
    @java.lang.Override
    public int getCharacterId() {
      return characterId_;
    }

    public static final int ELEMENT_TYPE_FIELD_NUMBER = 5;
    private int elementType_;
    /**
     * <code>uint32 element_type = 5;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }

    public static final int AVATAR_ID_FIELD_NUMBER = 12;
    private int avatarId_;
    /**
     * <code>uint32 avatar_id = 12;</code>
     * @return The avatarId.
     */
    @java.lang.Override
    public int getAvatarId() {
      return avatarId_;
    }

    public static final int OAIBMHHIOFA_FIELD_NUMBER = 11;
    private boolean oAIBMHHIOFA_;
    /**
     * <code>bool OAIBMHHIOFA = 11;</code>
     * @return The oAIBMHHIOFA.
     */
    @java.lang.Override
    public boolean getOAIBMHHIOFA() {
      return oAIBMHHIOFA_;
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
      if (characterId_ != 0) {
        output.writeUInt32(2, characterId_);
      }
      if (elementType_ != 0) {
        output.writeUInt32(5, elementType_);
      }
      if (gDNNFNKDFIP_ != false) {
        output.writeBool(7, gDNNFNKDFIP_);
      }
      if (pointId_ != 0) {
        output.writeUInt32(8, pointId_);
      }
      if (oAIBMHHIOFA_ != false) {
        output.writeBool(11, oAIBMHHIOFA_);
      }
      if (avatarId_ != 0) {
        output.writeUInt32(12, avatarId_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(14, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (characterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, characterId_);
      }
      if (elementType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, elementType_);
      }
      if (gDNNFNKDFIP_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, gDNNFNKDFIP_);
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, pointId_);
      }
      if (oAIBMHHIOFA_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, oAIBMHHIOFA_);
      }
      if (avatarId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, avatarId_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other = (emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) obj;

      if (getLevelId()
          != other.getLevelId()) return false;
      if (getGDNNFNKDFIP()
          != other.getGDNNFNKDFIP()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getCharacterId()
          != other.getCharacterId()) return false;
      if (getElementType()
          != other.getElementType()) return false;
      if (getAvatarId()
          != other.getAvatarId()) return false;
      if (getOAIBMHHIOFA()
          != other.getOAIBMHHIOFA()) return false;
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
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + GDNNFNKDFIP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGDNNFNKDFIP());
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + CHARACTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCharacterId();
      hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getElementType();
      hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarId();
      hash = (37 * hash) + OAIBMHHIOFA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getOAIBMHHIOFA());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify prototype) {
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
     * CmdId: 7194
     * Obf: LGEBINHGCCF
     * </pre>
     *
     * Protobuf type {@code GCGTCTavernInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGTCTavernInfoNotify)
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.class, emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.newBuilder()
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
        levelId_ = 0;

        gDNNFNKDFIP_ = false;

        pointId_ = 0;

        characterId_ = 0;

        elementType_ = 0;

        avatarId_ = 0;

        oAIBMHHIOFA_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.internal_static_GCGTCTavernInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify build() {
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify buildPartial() {
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify result = new emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify(this);
        result.levelId_ = levelId_;
        result.gDNNFNKDFIP_ = gDNNFNKDFIP_;
        result.pointId_ = pointId_;
        result.characterId_ = characterId_;
        result.elementType_ = elementType_;
        result.avatarId_ = avatarId_;
        result.oAIBMHHIOFA_ = oAIBMHHIOFA_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify other) {
        if (other == emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify.getDefaultInstance()) return this;
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (other.getGDNNFNKDFIP() != false) {
          setGDNNFNKDFIP(other.getGDNNFNKDFIP());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getCharacterId() != 0) {
          setCharacterId(other.getCharacterId());
        }
        if (other.getElementType() != 0) {
          setElementType(other.getElementType());
        }
        if (other.getAvatarId() != 0) {
          setAvatarId(other.getAvatarId());
        }
        if (other.getOAIBMHHIOFA() != false) {
          setOAIBMHHIOFA(other.getOAIBMHHIOFA());
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
        emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 14;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
        onChanged();
        return this;
      }

      private boolean gDNNFNKDFIP_ ;
      /**
       * <code>bool GDNNFNKDFIP = 7;</code>
       * @return The gDNNFNKDFIP.
       */
      @java.lang.Override
      public boolean getGDNNFNKDFIP() {
        return gDNNFNKDFIP_;
      }
      /**
       * <code>bool GDNNFNKDFIP = 7;</code>
       * @param value The gDNNFNKDFIP to set.
       * @return This builder for chaining.
       */
      public Builder setGDNNFNKDFIP(boolean value) {
        
        gDNNFNKDFIP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool GDNNFNKDFIP = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGDNNFNKDFIP() {
        
        gDNNFNKDFIP_ = false;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 8;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int characterId_ ;
      /**
       * <code>uint32 character_id = 2;</code>
       * @return The characterId.
       */
      @java.lang.Override
      public int getCharacterId() {
        return characterId_;
      }
      /**
       * <code>uint32 character_id = 2;</code>
       * @param value The characterId to set.
       * @return This builder for chaining.
       */
      public Builder setCharacterId(int value) {
        
        characterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 character_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCharacterId() {
        
        characterId_ = 0;
        onChanged();
        return this;
      }

      private int elementType_ ;
      /**
       * <code>uint32 element_type = 5;</code>
       * @return The elementType.
       */
      @java.lang.Override
      public int getElementType() {
        return elementType_;
      }
      /**
       * <code>uint32 element_type = 5;</code>
       * @param value The elementType to set.
       * @return This builder for chaining.
       */
      public Builder setElementType(int value) {
        
        elementType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 element_type = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearElementType() {
        
        elementType_ = 0;
        onChanged();
        return this;
      }

      private int avatarId_ ;
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return The avatarId.
       */
      @java.lang.Override
      public int getAvatarId() {
        return avatarId_;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @param value The avatarId to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarId(int value) {
        
        avatarId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 avatar_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarId() {
        
        avatarId_ = 0;
        onChanged();
        return this;
      }

      private boolean oAIBMHHIOFA_ ;
      /**
       * <code>bool OAIBMHHIOFA = 11;</code>
       * @return The oAIBMHHIOFA.
       */
      @java.lang.Override
      public boolean getOAIBMHHIOFA() {
        return oAIBMHHIOFA_;
      }
      /**
       * <code>bool OAIBMHHIOFA = 11;</code>
       * @param value The oAIBMHHIOFA to set.
       * @return This builder for chaining.
       */
      public Builder setOAIBMHHIOFA(boolean value) {
        
        oAIBMHHIOFA_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool OAIBMHHIOFA = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearOAIBMHHIOFA() {
        
        oAIBMHHIOFA_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGTCTavernInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGTCTavernInfoNotify)
    private static final emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify();
    }

    public static emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGTCTavernInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGTCTavernInfoNotify>() {
      @java.lang.Override
      public GCGTCTavernInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGTCTavernInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGTCTavernInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGTCTavernInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGTCTavernInfoNotifyOuterClass.GCGTCTavernInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGTCTavernInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGTCTavernInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033GCGTCTavernInfoNotify.proto\"\244\001\n\025GCGTCT" +
      "avernInfoNotify\022\020\n\010level_id\030\016 \001(\r\022\023\n\013GDN" +
      "NFNKDFIP\030\007 \001(\010\022\020\n\010point_id\030\010 \001(\r\022\024\n\014char" +
      "acter_id\030\002 \001(\r\022\024\n\014element_type\030\005 \001(\r\022\021\n\t" +
      "avatar_id\030\014 \001(\r\022\023\n\013OAIBMHHIOFA\030\013 \001(\010B\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGTCTavernInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGTCTavernInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGTCTavernInfoNotify_descriptor,
        new java.lang.String[] { "LevelId", "GDNNFNKDFIP", "PointId", "CharacterId", "ElementType", "AvatarId", "OAIBMHHIOFA", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtCompensatePosDiffInfo.proto

package emu.grasscutter.net.proto;

public final class EvtCompensatePosDiffInfoOuterClass {
  private EvtCompensatePosDiffInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtCompensatePosDiffInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtCompensatePosDiffInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector cur_pos = 13;</code>
     * @return Whether the curPos field is set.
     */
    boolean hasCurPos();
    /**
     * <code>.Vector cur_pos = 13;</code>
     * @return The curPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos();
    /**
     * <code>.Vector cur_pos = 13;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder();

    /**
     * <code>uint32 JKFEIKAKLME = 9;</code>
     * @return The jKFEIKAKLME.
     */
    int getJKFEIKAKLME();

    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>int32 face_angle_compact = 7;</code>
     * @return The faceAngleCompact.
     */
    int getFaceAngleCompact();

    /**
     * <code>uint32 NLMICFIEANI = 2;</code>
     * @return The nLMICFIEANI.
     */
    int getNLMICFIEANI();
  }
  /**
   * <pre>
   * Obf: ACLNMEGDNGL
   * </pre>
   *
   * Protobuf type {@code EvtCompensatePosDiffInfo}
   */
  public static final class EvtCompensatePosDiffInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtCompensatePosDiffInfo)
      EvtCompensatePosDiffInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtCompensatePosDiffInfo.newBuilder() to construct.
    private EvtCompensatePosDiffInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtCompensatePosDiffInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtCompensatePosDiffInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtCompensatePosDiffInfo(
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

              nLMICFIEANI_ = input.readUInt32();
              break;
            }
            case 40: {

              entityId_ = input.readUInt32();
              break;
            }
            case 56: {

              faceAngleCompact_ = input.readInt32();
              break;
            }
            case 72: {

              jKFEIKAKLME_ = input.readUInt32();
              break;
            }
            case 106: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (curPos_ != null) {
                subBuilder = curPos_.toBuilder();
              }
              curPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(curPos_);
                curPos_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.class, emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.Builder.class);
    }

    public static final int CUR_POS_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector curPos_;
    /**
     * <code>.Vector cur_pos = 13;</code>
     * @return Whether the curPos field is set.
     */
    @java.lang.Override
    public boolean hasCurPos() {
      return curPos_ != null;
    }
    /**
     * <code>.Vector cur_pos = 13;</code>
     * @return The curPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos() {
      return curPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
    }
    /**
     * <code>.Vector cur_pos = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
      return getCurPos();
    }

    public static final int JKFEIKAKLME_FIELD_NUMBER = 9;
    private int jKFEIKAKLME_;
    /**
     * <code>uint32 JKFEIKAKLME = 9;</code>
     * @return The jKFEIKAKLME.
     */
    @java.lang.Override
    public int getJKFEIKAKLME() {
      return jKFEIKAKLME_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 5;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 5;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int FACE_ANGLE_COMPACT_FIELD_NUMBER = 7;
    private int faceAngleCompact_;
    /**
     * <code>int32 face_angle_compact = 7;</code>
     * @return The faceAngleCompact.
     */
    @java.lang.Override
    public int getFaceAngleCompact() {
      return faceAngleCompact_;
    }

    public static final int NLMICFIEANI_FIELD_NUMBER = 2;
    private int nLMICFIEANI_;
    /**
     * <code>uint32 NLMICFIEANI = 2;</code>
     * @return The nLMICFIEANI.
     */
    @java.lang.Override
    public int getNLMICFIEANI() {
      return nLMICFIEANI_;
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
      if (nLMICFIEANI_ != 0) {
        output.writeUInt32(2, nLMICFIEANI_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(5, entityId_);
      }
      if (faceAngleCompact_ != 0) {
        output.writeInt32(7, faceAngleCompact_);
      }
      if (jKFEIKAKLME_ != 0) {
        output.writeUInt32(9, jKFEIKAKLME_);
      }
      if (curPos_ != null) {
        output.writeMessage(13, getCurPos());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nLMICFIEANI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, nLMICFIEANI_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, entityId_);
      }
      if (faceAngleCompact_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, faceAngleCompact_);
      }
      if (jKFEIKAKLME_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, jKFEIKAKLME_);
      }
      if (curPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getCurPos());
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo other = (emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) obj;

      if (hasCurPos() != other.hasCurPos()) return false;
      if (hasCurPos()) {
        if (!getCurPos()
            .equals(other.getCurPos())) return false;
      }
      if (getJKFEIKAKLME()
          != other.getJKFEIKAKLME()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getFaceAngleCompact()
          != other.getFaceAngleCompact()) return false;
      if (getNLMICFIEANI()
          != other.getNLMICFIEANI()) return false;
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
      if (hasCurPos()) {
        hash = (37 * hash) + CUR_POS_FIELD_NUMBER;
        hash = (53 * hash) + getCurPos().hashCode();
      }
      hash = (37 * hash) + JKFEIKAKLME_FIELD_NUMBER;
      hash = (53 * hash) + getJKFEIKAKLME();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + FACE_ANGLE_COMPACT_FIELD_NUMBER;
      hash = (53 * hash) + getFaceAngleCompact();
      hash = (37 * hash) + NLMICFIEANI_FIELD_NUMBER;
      hash = (53 * hash) + getNLMICFIEANI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo prototype) {
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
     * Obf: ACLNMEGDNGL
     * </pre>
     *
     * Protobuf type {@code EvtCompensatePosDiffInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtCompensatePosDiffInfo)
        emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.class, emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.newBuilder()
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
        if (curPosBuilder_ == null) {
          curPos_ = null;
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }
        jKFEIKAKLME_ = 0;

        entityId_ = 0;

        faceAngleCompact_ = 0;

        nLMICFIEANI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.internal_static_EvtCompensatePosDiffInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo build() {
        emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo buildPartial() {
        emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo result = new emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo(this);
        if (curPosBuilder_ == null) {
          result.curPos_ = curPos_;
        } else {
          result.curPos_ = curPosBuilder_.build();
        }
        result.jKFEIKAKLME_ = jKFEIKAKLME_;
        result.entityId_ = entityId_;
        result.faceAngleCompact_ = faceAngleCompact_;
        result.nLMICFIEANI_ = nLMICFIEANI_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo other) {
        if (other == emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo.getDefaultInstance()) return this;
        if (other.hasCurPos()) {
          mergeCurPos(other.getCurPos());
        }
        if (other.getJKFEIKAKLME() != 0) {
          setJKFEIKAKLME(other.getJKFEIKAKLME());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getFaceAngleCompact() != 0) {
          setFaceAngleCompact(other.getFaceAngleCompact());
        }
        if (other.getNLMICFIEANI() != 0) {
          setNLMICFIEANI(other.getNLMICFIEANI());
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
        emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector curPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> curPosBuilder_;
      /**
       * <code>.Vector cur_pos = 13;</code>
       * @return Whether the curPos field is set.
       */
      public boolean hasCurPos() {
        return curPosBuilder_ != null || curPos_ != null;
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       * @return The curPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCurPos() {
        if (curPosBuilder_ == null) {
          return curPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        } else {
          return curPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public Builder setCurPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          curPos_ = value;
          onChanged();
        } else {
          curPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public Builder setCurPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (curPosBuilder_ == null) {
          curPos_ = builderForValue.build();
          onChanged();
        } else {
          curPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public Builder mergeCurPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (curPosBuilder_ == null) {
          if (curPos_ != null) {
            curPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(curPos_).mergeFrom(value).buildPartial();
          } else {
            curPos_ = value;
          }
          onChanged();
        } else {
          curPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public Builder clearCurPos() {
        if (curPosBuilder_ == null) {
          curPos_ = null;
          onChanged();
        } else {
          curPos_ = null;
          curPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCurPosBuilder() {
        
        onChanged();
        return getCurPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCurPosOrBuilder() {
        if (curPosBuilder_ != null) {
          return curPosBuilder_.getMessageOrBuilder();
        } else {
          return curPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : curPos_;
        }
      }
      /**
       * <code>.Vector cur_pos = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCurPosFieldBuilder() {
        if (curPosBuilder_ == null) {
          curPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCurPos(),
                  getParentForChildren(),
                  isClean());
          curPos_ = null;
        }
        return curPosBuilder_;
      }

      private int jKFEIKAKLME_ ;
      /**
       * <code>uint32 JKFEIKAKLME = 9;</code>
       * @return The jKFEIKAKLME.
       */
      @java.lang.Override
      public int getJKFEIKAKLME() {
        return jKFEIKAKLME_;
      }
      /**
       * <code>uint32 JKFEIKAKLME = 9;</code>
       * @param value The jKFEIKAKLME to set.
       * @return This builder for chaining.
       */
      public Builder setJKFEIKAKLME(int value) {
        
        jKFEIKAKLME_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKFEIKAKLME = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearJKFEIKAKLME() {
        
        jKFEIKAKLME_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private int faceAngleCompact_ ;
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @return The faceAngleCompact.
       */
      @java.lang.Override
      public int getFaceAngleCompact() {
        return faceAngleCompact_;
      }
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @param value The faceAngleCompact to set.
       * @return This builder for chaining.
       */
      public Builder setFaceAngleCompact(int value) {
        
        faceAngleCompact_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 face_angle_compact = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceAngleCompact() {
        
        faceAngleCompact_ = 0;
        onChanged();
        return this;
      }

      private int nLMICFIEANI_ ;
      /**
       * <code>uint32 NLMICFIEANI = 2;</code>
       * @return The nLMICFIEANI.
       */
      @java.lang.Override
      public int getNLMICFIEANI() {
        return nLMICFIEANI_;
      }
      /**
       * <code>uint32 NLMICFIEANI = 2;</code>
       * @param value The nLMICFIEANI to set.
       * @return This builder for chaining.
       */
      public Builder setNLMICFIEANI(int value) {
        
        nLMICFIEANI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NLMICFIEANI = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearNLMICFIEANI() {
        
        nLMICFIEANI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtCompensatePosDiffInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtCompensatePosDiffInfo)
    private static final emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo();
    }

    public static emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtCompensatePosDiffInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtCompensatePosDiffInfo>() {
      @java.lang.Override
      public EvtCompensatePosDiffInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtCompensatePosDiffInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtCompensatePosDiffInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtCompensatePosDiffInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtCompensatePosDiffInfoOuterClass.EvtCompensatePosDiffInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtCompensatePosDiffInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036EvtCompensatePosDiffInfo.proto\032\014Vector" +
      ".proto\"\215\001\n\030EvtCompensatePosDiffInfo\022\030\n\007c" +
      "ur_pos\030\r \001(\0132\007.Vector\022\023\n\013JKFEIKAKLME\030\t \001" +
      "(\r\022\021\n\tentity_id\030\005 \001(\r\022\032\n\022face_angle_comp" +
      "act\030\007 \001(\005\022\023\n\013NLMICFIEANI\030\002 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtCompensatePosDiffInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtCompensatePosDiffInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtCompensatePosDiffInfo_descriptor,
        new java.lang.String[] { "CurPos", "JKFEIKAKLME", "EntityId", "FaceAngleCompact", "NLMICFIEANI", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

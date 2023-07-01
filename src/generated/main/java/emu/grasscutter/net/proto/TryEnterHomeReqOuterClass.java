// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterHomeReq.proto

package emu.grasscutter.net.proto;

public final class TryEnterHomeReqOuterClass {
  private TryEnterHomeReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TryEnterHomeReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TryEnterHomeReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_transfer_to_safe_point = 12;</code>
     * @return The isTransferToSafePoint.
     */
    boolean getIsTransferToSafePoint();

    /**
     * <code>uint32 target_point = 8;</code>
     * @return The targetPoint.
     */
    int getTargetPoint();

    /**
     * <code>uint32 target_uid = 11;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>bool GGBOCPDIIKL = 14;</code>
     * @return The gGBOCPDIIKL.
     */
    boolean getGGBOCPDIIKL();
  }
  /**
   * <pre>
   * CmdId: 4565
   * Obf: DGPBLIIAEOL
   * </pre>
   *
   * Protobuf type {@code TryEnterHomeReq}
   */
  public static final class TryEnterHomeReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TryEnterHomeReq)
      TryEnterHomeReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TryEnterHomeReq.newBuilder() to construct.
    private TryEnterHomeReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TryEnterHomeReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TryEnterHomeReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TryEnterHomeReq(
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
            case 64: {

              targetPoint_ = input.readUInt32();
              break;
            }
            case 88: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 96: {

              isTransferToSafePoint_ = input.readBool();
              break;
            }
            case 112: {

              gGBOCPDIIKL_ = input.readBool();
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
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
    }

    public static final int IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER = 12;
    private boolean isTransferToSafePoint_;
    /**
     * <code>bool is_transfer_to_safe_point = 12;</code>
     * @return The isTransferToSafePoint.
     */
    @java.lang.Override
    public boolean getIsTransferToSafePoint() {
      return isTransferToSafePoint_;
    }

    public static final int TARGET_POINT_FIELD_NUMBER = 8;
    private int targetPoint_;
    /**
     * <code>uint32 target_point = 8;</code>
     * @return The targetPoint.
     */
    @java.lang.Override
    public int getTargetPoint() {
      return targetPoint_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 11;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 11;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int GGBOCPDIIKL_FIELD_NUMBER = 14;
    private boolean gGBOCPDIIKL_;
    /**
     * <code>bool GGBOCPDIIKL = 14;</code>
     * @return The gGBOCPDIIKL.
     */
    @java.lang.Override
    public boolean getGGBOCPDIIKL() {
      return gGBOCPDIIKL_;
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
      if (targetPoint_ != 0) {
        output.writeUInt32(8, targetPoint_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(11, targetUid_);
      }
      if (isTransferToSafePoint_ != false) {
        output.writeBool(12, isTransferToSafePoint_);
      }
      if (gGBOCPDIIKL_ != false) {
        output.writeBool(14, gGBOCPDIIKL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetPoint_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, targetPoint_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, targetUid_);
      }
      if (isTransferToSafePoint_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isTransferToSafePoint_);
      }
      if (gGBOCPDIIKL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, gGBOCPDIIKL_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other = (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) obj;

      if (getIsTransferToSafePoint()
          != other.getIsTransferToSafePoint()) return false;
      if (getTargetPoint()
          != other.getTargetPoint()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getGGBOCPDIIKL()
          != other.getGGBOCPDIIKL()) return false;
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
      hash = (37 * hash) + IS_TRANSFER_TO_SAFE_POINT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTransferToSafePoint());
      hash = (37 * hash) + TARGET_POINT_FIELD_NUMBER;
      hash = (53 * hash) + getTargetPoint();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + GGBOCPDIIKL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getGGBOCPDIIKL());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq prototype) {
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
     * CmdId: 4565
     * Obf: DGPBLIIAEOL
     * </pre>
     *
     * Protobuf type {@code TryEnterHomeReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TryEnterHomeReq)
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.class, emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.newBuilder()
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
        isTransferToSafePoint_ = false;

        targetPoint_ = 0;

        targetUid_ = 0;

        gGBOCPDIIKL_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.internal_static_TryEnterHomeReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq build() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq buildPartial() {
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq result = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq(this);
        result.isTransferToSafePoint_ = isTransferToSafePoint_;
        result.targetPoint_ = targetPoint_;
        result.targetUid_ = targetUid_;
        result.gGBOCPDIIKL_ = gGBOCPDIIKL_;
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
        if (other instanceof emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) {
          return mergeFrom((emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq other) {
        if (other == emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq.getDefaultInstance()) return this;
        if (other.getIsTransferToSafePoint() != false) {
          setIsTransferToSafePoint(other.getIsTransferToSafePoint());
        }
        if (other.getTargetPoint() != 0) {
          setTargetPoint(other.getTargetPoint());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getGGBOCPDIIKL() != false) {
          setGGBOCPDIIKL(other.getGGBOCPDIIKL());
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
        emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isTransferToSafePoint_ ;
      /**
       * <code>bool is_transfer_to_safe_point = 12;</code>
       * @return The isTransferToSafePoint.
       */
      @java.lang.Override
      public boolean getIsTransferToSafePoint() {
        return isTransferToSafePoint_;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 12;</code>
       * @param value The isTransferToSafePoint to set.
       * @return This builder for chaining.
       */
      public Builder setIsTransferToSafePoint(boolean value) {
        
        isTransferToSafePoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_transfer_to_safe_point = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTransferToSafePoint() {
        
        isTransferToSafePoint_ = false;
        onChanged();
        return this;
      }

      private int targetPoint_ ;
      /**
       * <code>uint32 target_point = 8;</code>
       * @return The targetPoint.
       */
      @java.lang.Override
      public int getTargetPoint() {
        return targetPoint_;
      }
      /**
       * <code>uint32 target_point = 8;</code>
       * @param value The targetPoint to set.
       * @return This builder for chaining.
       */
      public Builder setTargetPoint(int value) {
        
        targetPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_point = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetPoint() {
        
        targetPoint_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 11;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 11;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private boolean gGBOCPDIIKL_ ;
      /**
       * <code>bool GGBOCPDIIKL = 14;</code>
       * @return The gGBOCPDIIKL.
       */
      @java.lang.Override
      public boolean getGGBOCPDIIKL() {
        return gGBOCPDIIKL_;
      }
      /**
       * <code>bool GGBOCPDIIKL = 14;</code>
       * @param value The gGBOCPDIIKL to set.
       * @return This builder for chaining.
       */
      public Builder setGGBOCPDIIKL(boolean value) {
        
        gGBOCPDIIKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool GGBOCPDIIKL = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGGBOCPDIIKL() {
        
        gGBOCPDIIKL_ = false;
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


      // @@protoc_insertion_point(builder_scope:TryEnterHomeReq)
    }

    // @@protoc_insertion_point(class_scope:TryEnterHomeReq)
    private static final emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq();
    }

    public static emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TryEnterHomeReq>
        PARSER = new com.google.protobuf.AbstractParser<TryEnterHomeReq>() {
      @java.lang.Override
      public TryEnterHomeReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TryEnterHomeReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TryEnterHomeReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TryEnterHomeReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TryEnterHomeReqOuterClass.TryEnterHomeReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TryEnterHomeReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TryEnterHomeReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TryEnterHomeReq.proto\"s\n\017TryEnterHomeR" +
      "eq\022!\n\031is_transfer_to_safe_point\030\014 \001(\010\022\024\n" +
      "\014target_point\030\010 \001(\r\022\022\n\ntarget_uid\030\013 \001(\r\022" +
      "\023\n\013GGBOCPDIIKL\030\016 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TryEnterHomeReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TryEnterHomeReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TryEnterHomeReq_descriptor,
        new java.lang.String[] { "IsTransferToSafePoint", "TargetPoint", "TargetUid", "GGBOCPDIIKL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
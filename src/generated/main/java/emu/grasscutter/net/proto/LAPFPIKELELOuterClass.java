// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LAPFPIKELEL.proto

package emu.grasscutter.net.proto;

public final class LAPFPIKELELOuterClass {
  private LAPFPIKELELOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LAPFPIKELELOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LAPFPIKELEL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>int32 reason = 7;</code>
     * @return The reason.
     */
    int getReason();
  }
  /**
   * <pre>
   * CmdId: 23395
   * </pre>
   *
   * Protobuf type {@code LAPFPIKELEL}
   */
  public static final class LAPFPIKELEL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LAPFPIKELEL)
      LAPFPIKELELOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LAPFPIKELEL.newBuilder() to construct.
    private LAPFPIKELEL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LAPFPIKELEL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LAPFPIKELEL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LAPFPIKELEL(
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

              isSuccess_ = input.readBool();
              break;
            }
            case 56: {

              reason_ = input.readInt32();
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
      return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.internal_static_LAPFPIKELEL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.internal_static_LAPFPIKELEL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.class, emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 4;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 4;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int REASON_FIELD_NUMBER = 7;
    private int reason_;
    /**
     * <code>int32 reason = 7;</code>
     * @return The reason.
     */
    @java.lang.Override
    public int getReason() {
      return reason_;
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
      if (isSuccess_ != false) {
        output.writeBool(4, isSuccess_);
      }
      if (reason_ != 0) {
        output.writeInt32(7, reason_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isSuccess_);
      }
      if (reason_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, reason_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL other = (emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getReason()
          != other.getReason()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + getReason();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL prototype) {
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
     * CmdId: 23395
     * </pre>
     *
     * Protobuf type {@code LAPFPIKELEL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LAPFPIKELEL)
        emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELELOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.internal_static_LAPFPIKELEL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.internal_static_LAPFPIKELEL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.class, emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.newBuilder()
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
        isSuccess_ = false;

        reason_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.internal_static_LAPFPIKELEL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL build() {
        emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL buildPartial() {
        emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL result = new emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL(this);
        result.isSuccess_ = isSuccess_;
        result.reason_ = reason_;
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
        if (other instanceof emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL) {
          return mergeFrom((emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL other) {
        if (other == emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getReason() != 0) {
          setReason(other.getReason());
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
        emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 4;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int reason_ ;
      /**
       * <code>int32 reason = 7;</code>
       * @return The reason.
       */
      @java.lang.Override
      public int getReason() {
        return reason_;
      }
      /**
       * <code>int32 reason = 7;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 reason = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
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


      // @@protoc_insertion_point(builder_scope:LAPFPIKELEL)
    }

    // @@protoc_insertion_point(class_scope:LAPFPIKELEL)
    private static final emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL();
    }

    public static emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LAPFPIKELEL>
        PARSER = new com.google.protobuf.AbstractParser<LAPFPIKELEL>() {
      @java.lang.Override
      public LAPFPIKELEL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LAPFPIKELEL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LAPFPIKELEL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LAPFPIKELEL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LAPFPIKELELOuterClass.LAPFPIKELEL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LAPFPIKELEL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LAPFPIKELEL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021LAPFPIKELEL.proto\"1\n\013LAPFPIKELEL\022\022\n\nis" +
      "_success\030\004 \001(\010\022\016\n\006reason\030\007 \001(\005B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LAPFPIKELEL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LAPFPIKELEL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LAPFPIKELEL_descriptor,
        new java.lang.String[] { "IsSuccess", "Reason", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

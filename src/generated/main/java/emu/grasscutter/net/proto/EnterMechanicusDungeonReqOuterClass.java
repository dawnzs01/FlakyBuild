// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterMechanicusDungeonReq.proto

package emu.grasscutter.net.proto;

public final class EnterMechanicusDungeonReqOuterClass {
  private EnterMechanicusDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterMechanicusDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterMechanicusDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 difficult_level = 8;</code>
     * @return The difficultLevel.
     */
    int getDifficultLevel();
  }
  /**
   * <pre>
   * CmdId: 3984
   * Obf: OEBANJNBOIL
   * </pre>
   *
   * Protobuf type {@code EnterMechanicusDungeonReq}
   */
  public static final class EnterMechanicusDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterMechanicusDungeonReq)
      EnterMechanicusDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterMechanicusDungeonReq.newBuilder() to construct.
    private EnterMechanicusDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterMechanicusDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterMechanicusDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterMechanicusDungeonReq(
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

              difficultLevel_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.internal_static_EnterMechanicusDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.internal_static_EnterMechanicusDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.class, emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.Builder.class);
    }

    public static final int DIFFICULT_LEVEL_FIELD_NUMBER = 8;
    private int difficultLevel_;
    /**
     * <code>uint32 difficult_level = 8;</code>
     * @return The difficultLevel.
     */
    @java.lang.Override
    public int getDifficultLevel() {
      return difficultLevel_;
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
      if (difficultLevel_ != 0) {
        output.writeUInt32(8, difficultLevel_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (difficultLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, difficultLevel_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq other = (emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq) obj;

      if (getDifficultLevel()
          != other.getDifficultLevel()) return false;
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
      hash = (37 * hash) + DIFFICULT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultLevel();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq prototype) {
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
     * CmdId: 3984
     * Obf: OEBANJNBOIL
     * </pre>
     *
     * Protobuf type {@code EnterMechanicusDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterMechanicusDungeonReq)
        emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.internal_static_EnterMechanicusDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.internal_static_EnterMechanicusDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.class, emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.newBuilder()
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
        difficultLevel_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.internal_static_EnterMechanicusDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq build() {
        emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq buildPartial() {
        emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq result = new emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq(this);
        result.difficultLevel_ = difficultLevel_;
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
        if (other instanceof emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq other) {
        if (other == emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq.getDefaultInstance()) return this;
        if (other.getDifficultLevel() != 0) {
          setDifficultLevel(other.getDifficultLevel());
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
        emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int difficultLevel_ ;
      /**
       * <code>uint32 difficult_level = 8;</code>
       * @return The difficultLevel.
       */
      @java.lang.Override
      public int getDifficultLevel() {
        return difficultLevel_;
      }
      /**
       * <code>uint32 difficult_level = 8;</code>
       * @param value The difficultLevel to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultLevel(int value) {
        
        difficultLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficult_level = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultLevel() {
        
        difficultLevel_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EnterMechanicusDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:EnterMechanicusDungeonReq)
    private static final emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq();
    }

    public static emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterMechanicusDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterMechanicusDungeonReq>() {
      @java.lang.Override
      public EnterMechanicusDungeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterMechanicusDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterMechanicusDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterMechanicusDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterMechanicusDungeonReqOuterClass.EnterMechanicusDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterMechanicusDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterMechanicusDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037EnterMechanicusDungeonReq.proto\"4\n\031Ent" +
      "erMechanicusDungeonReq\022\027\n\017difficult_leve" +
      "l\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterMechanicusDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterMechanicusDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterMechanicusDungeonReq_descriptor,
        new java.lang.String[] { "DifficultLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

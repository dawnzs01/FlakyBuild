// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PLKCIBEIPJL.proto

package emu.grasscutter.net.proto;

public final class PLKCIBEIPJLOuterClass {
  private PLKCIBEIPJLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PLKCIBEIPJLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PLKCIBEIPJL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     * @return Whether the basicInfo field is set.
     */
    boolean hasBasicInfo();
    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     * @return The basicInfo.
     */
    emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL getBasicInfo();
    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     */
    emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder getBasicInfoOrBuilder();
  }
  /**
   * Protobuf type {@code PLKCIBEIPJL}
   */
  public static final class PLKCIBEIPJL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PLKCIBEIPJL)
      PLKCIBEIPJLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PLKCIBEIPJL.newBuilder() to construct.
    private PLKCIBEIPJL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PLKCIBEIPJL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PLKCIBEIPJL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PLKCIBEIPJL(
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
            case 114: {
              emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder subBuilder = null;
              if (basicInfo_ != null) {
                subBuilder = basicInfo_.toBuilder();
              }
              basicInfo_ = input.readMessage(emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(basicInfo_);
                basicInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.internal_static_PLKCIBEIPJL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.internal_static_PLKCIBEIPJL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.class, emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.Builder.class);
    }

    public static final int BASIC_INFO_FIELD_NUMBER = 14;
    private emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL basicInfo_;
    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     * @return Whether the basicInfo field is set.
     */
    @java.lang.Override
    public boolean hasBasicInfo() {
      return basicInfo_ != null;
    }
    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     * @return The basicInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL getBasicInfo() {
      return basicInfo_ == null ? emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.getDefaultInstance() : basicInfo_;
    }
    /**
     * <code>.COPAGJPLLDL basic_info = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder getBasicInfoOrBuilder() {
      return getBasicInfo();
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
      if (basicInfo_ != null) {
        output.writeMessage(14, getBasicInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (basicInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getBasicInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL other = (emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL) obj;

      if (hasBasicInfo() != other.hasBasicInfo()) return false;
      if (hasBasicInfo()) {
        if (!getBasicInfo()
            .equals(other.getBasicInfo())) return false;
      }
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
      if (hasBasicInfo()) {
        hash = (37 * hash) + BASIC_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getBasicInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL prototype) {
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
     * Protobuf type {@code PLKCIBEIPJL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PLKCIBEIPJL)
        emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.internal_static_PLKCIBEIPJL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.internal_static_PLKCIBEIPJL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.class, emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.newBuilder()
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
        if (basicInfoBuilder_ == null) {
          basicInfo_ = null;
        } else {
          basicInfo_ = null;
          basicInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.internal_static_PLKCIBEIPJL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL build() {
        emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL buildPartial() {
        emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL result = new emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL(this);
        if (basicInfoBuilder_ == null) {
          result.basicInfo_ = basicInfo_;
        } else {
          result.basicInfo_ = basicInfoBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL) {
          return mergeFrom((emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL other) {
        if (other == emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL.getDefaultInstance()) return this;
        if (other.hasBasicInfo()) {
          mergeBasicInfo(other.getBasicInfo());
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
        emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL basicInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder> basicInfoBuilder_;
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       * @return Whether the basicInfo field is set.
       */
      public boolean hasBasicInfo() {
        return basicInfoBuilder_ != null || basicInfo_ != null;
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       * @return The basicInfo.
       */
      public emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL getBasicInfo() {
        if (basicInfoBuilder_ == null) {
          return basicInfo_ == null ? emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.getDefaultInstance() : basicInfo_;
        } else {
          return basicInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public Builder setBasicInfo(emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL value) {
        if (basicInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          basicInfo_ = value;
          onChanged();
        } else {
          basicInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public Builder setBasicInfo(
          emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder builderForValue) {
        if (basicInfoBuilder_ == null) {
          basicInfo_ = builderForValue.build();
          onChanged();
        } else {
          basicInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public Builder mergeBasicInfo(emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL value) {
        if (basicInfoBuilder_ == null) {
          if (basicInfo_ != null) {
            basicInfo_ =
              emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.newBuilder(basicInfo_).mergeFrom(value).buildPartial();
          } else {
            basicInfo_ = value;
          }
          onChanged();
        } else {
          basicInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public Builder clearBasicInfo() {
        if (basicInfoBuilder_ == null) {
          basicInfo_ = null;
          onChanged();
        } else {
          basicInfo_ = null;
          basicInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder getBasicInfoBuilder() {
        
        onChanged();
        return getBasicInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      public emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder getBasicInfoOrBuilder() {
        if (basicInfoBuilder_ != null) {
          return basicInfoBuilder_.getMessageOrBuilder();
        } else {
          return basicInfo_ == null ?
              emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.getDefaultInstance() : basicInfo_;
        }
      }
      /**
       * <code>.COPAGJPLLDL basic_info = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder> 
          getBasicInfoFieldBuilder() {
        if (basicInfoBuilder_ == null) {
          basicInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDL.Builder, emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.COPAGJPLLDLOrBuilder>(
                  getBasicInfo(),
                  getParentForChildren(),
                  isClean());
          basicInfo_ = null;
        }
        return basicInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PLKCIBEIPJL)
    }

    // @@protoc_insertion_point(class_scope:PLKCIBEIPJL)
    private static final emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL();
    }

    public static emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PLKCIBEIPJL>
        PARSER = new com.google.protobuf.AbstractParser<PLKCIBEIPJL>() {
      @java.lang.Override
      public PLKCIBEIPJL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PLKCIBEIPJL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PLKCIBEIPJL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PLKCIBEIPJL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PLKCIBEIPJLOuterClass.PLKCIBEIPJL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PLKCIBEIPJL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PLKCIBEIPJL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021PLKCIBEIPJL.proto\032\021COPAGJPLLDL.proto\"/" +
      "\n\013PLKCIBEIPJL\022 \n\nbasic_info\030\016 \001(\0132\014.COPA" +
      "GJPLLDLB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.getDescriptor(),
        });
    internal_static_PLKCIBEIPJL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PLKCIBEIPJL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PLKCIBEIPJL_descriptor,
        new java.lang.String[] { "BasicInfo", });
    emu.grasscutter.net.proto.COPAGJPLLDLOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

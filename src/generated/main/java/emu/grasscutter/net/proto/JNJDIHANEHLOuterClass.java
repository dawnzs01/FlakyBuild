// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JNJDIHANEHL.proto

package emu.grasscutter.net.proto;

public final class JNJDIHANEHLOuterClass {
  private JNJDIHANEHLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JNJDIHANEHLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JNJDIHANEHL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 FPEBFLFMNIL = 5;</code>
     * @return The fPEBFLFMNIL.
     */
    int getFPEBFLFMNIL();

    /**
     * <code>uint32 group_id = 14;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 MDFPNEGGLLE = 7;</code>
     * @return The mDFPNEGGLLE.
     */
    int getMDFPNEGGLLE();
  }
  /**
   * <pre>
   * CmdId: 9102
   * </pre>
   *
   * Protobuf type {@code JNJDIHANEHL}
   */
  public static final class JNJDIHANEHL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JNJDIHANEHL)
      JNJDIHANEHLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JNJDIHANEHL.newBuilder() to construct.
    private JNJDIHANEHL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JNJDIHANEHL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JNJDIHANEHL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JNJDIHANEHL(
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
            case 40: {

              fPEBFLFMNIL_ = input.readUInt32();
              break;
            }
            case 56: {

              mDFPNEGGLLE_ = input.readUInt32();
              break;
            }
            case 112: {

              groupId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.internal_static_JNJDIHANEHL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.internal_static_JNJDIHANEHL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.class, emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.Builder.class);
    }

    public static final int FPEBFLFMNIL_FIELD_NUMBER = 5;
    private int fPEBFLFMNIL_;
    /**
     * <code>uint32 FPEBFLFMNIL = 5;</code>
     * @return The fPEBFLFMNIL.
     */
    @java.lang.Override
    public int getFPEBFLFMNIL() {
      return fPEBFLFMNIL_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 14;
    private int groupId_;
    /**
     * <code>uint32 group_id = 14;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int MDFPNEGGLLE_FIELD_NUMBER = 7;
    private int mDFPNEGGLLE_;
    /**
     * <code>uint32 MDFPNEGGLLE = 7;</code>
     * @return The mDFPNEGGLLE.
     */
    @java.lang.Override
    public int getMDFPNEGGLLE() {
      return mDFPNEGGLLE_;
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
      if (fPEBFLFMNIL_ != 0) {
        output.writeUInt32(5, fPEBFLFMNIL_);
      }
      if (mDFPNEGGLLE_ != 0) {
        output.writeUInt32(7, mDFPNEGGLLE_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(14, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fPEBFLFMNIL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, fPEBFLFMNIL_);
      }
      if (mDFPNEGGLLE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, mDFPNEGGLLE_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL other = (emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL) obj;

      if (getFPEBFLFMNIL()
          != other.getFPEBFLFMNIL()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getMDFPNEGGLLE()
          != other.getMDFPNEGGLLE()) return false;
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
      hash = (37 * hash) + FPEBFLFMNIL_FIELD_NUMBER;
      hash = (53 * hash) + getFPEBFLFMNIL();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + MDFPNEGGLLE_FIELD_NUMBER;
      hash = (53 * hash) + getMDFPNEGGLLE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL prototype) {
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
     * CmdId: 9102
     * </pre>
     *
     * Protobuf type {@code JNJDIHANEHL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JNJDIHANEHL)
        emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.internal_static_JNJDIHANEHL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.internal_static_JNJDIHANEHL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.class, emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.newBuilder()
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
        fPEBFLFMNIL_ = 0;

        groupId_ = 0;

        mDFPNEGGLLE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.internal_static_JNJDIHANEHL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL build() {
        emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL buildPartial() {
        emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL result = new emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL(this);
        result.fPEBFLFMNIL_ = fPEBFLFMNIL_;
        result.groupId_ = groupId_;
        result.mDFPNEGGLLE_ = mDFPNEGGLLE_;
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
        if (other instanceof emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL) {
          return mergeFrom((emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL other) {
        if (other == emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL.getDefaultInstance()) return this;
        if (other.getFPEBFLFMNIL() != 0) {
          setFPEBFLFMNIL(other.getFPEBFLFMNIL());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getMDFPNEGGLLE() != 0) {
          setMDFPNEGGLLE(other.getMDFPNEGGLLE());
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
        emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fPEBFLFMNIL_ ;
      /**
       * <code>uint32 FPEBFLFMNIL = 5;</code>
       * @return The fPEBFLFMNIL.
       */
      @java.lang.Override
      public int getFPEBFLFMNIL() {
        return fPEBFLFMNIL_;
      }
      /**
       * <code>uint32 FPEBFLFMNIL = 5;</code>
       * @param value The fPEBFLFMNIL to set.
       * @return This builder for chaining.
       */
      public Builder setFPEBFLFMNIL(int value) {
        
        fPEBFLFMNIL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FPEBFLFMNIL = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFPEBFLFMNIL() {
        
        fPEBFLFMNIL_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 14;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 14;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int mDFPNEGGLLE_ ;
      /**
       * <code>uint32 MDFPNEGGLLE = 7;</code>
       * @return The mDFPNEGGLLE.
       */
      @java.lang.Override
      public int getMDFPNEGGLLE() {
        return mDFPNEGGLLE_;
      }
      /**
       * <code>uint32 MDFPNEGGLLE = 7;</code>
       * @param value The mDFPNEGGLLE to set.
       * @return This builder for chaining.
       */
      public Builder setMDFPNEGGLLE(int value) {
        
        mDFPNEGGLLE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MDFPNEGGLLE = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMDFPNEGGLLE() {
        
        mDFPNEGGLLE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JNJDIHANEHL)
    }

    // @@protoc_insertion_point(class_scope:JNJDIHANEHL)
    private static final emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL();
    }

    public static emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JNJDIHANEHL>
        PARSER = new com.google.protobuf.AbstractParser<JNJDIHANEHL>() {
      @java.lang.Override
      public JNJDIHANEHL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JNJDIHANEHL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JNJDIHANEHL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JNJDIHANEHL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JNJDIHANEHLOuterClass.JNJDIHANEHL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JNJDIHANEHL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JNJDIHANEHL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JNJDIHANEHL.proto\"I\n\013JNJDIHANEHL\022\023\n\013FP" +
      "EBFLFMNIL\030\005 \001(\r\022\020\n\010group_id\030\016 \001(\r\022\023\n\013MDF" +
      "PNEGGLLE\030\007 \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JNJDIHANEHL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JNJDIHANEHL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JNJDIHANEHL_descriptor,
        new java.lang.String[] { "FPEBFLFMNIL", "GroupId", "MDFPNEGGLLE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

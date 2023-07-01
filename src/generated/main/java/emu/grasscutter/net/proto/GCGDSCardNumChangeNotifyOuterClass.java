// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardNumChangeNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSCardNumChangeNotifyOuterClass {
  private GCGDSCardNumChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardNumChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardNumChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 num = 15;</code>
     * @return The num.
     */
    int getNum();

    /**
     * <code>uint32 card_id = 12;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * CmdId: 7158
   * Obf: DBCICNAFMKH
   * </pre>
   *
   * Protobuf type {@code GCGDSCardNumChangeNotify}
   */
  public static final class GCGDSCardNumChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardNumChangeNotify)
      GCGDSCardNumChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardNumChangeNotify.newBuilder() to construct.
    private GCGDSCardNumChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardNumChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardNumChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSCardNumChangeNotify(
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
            case 96: {

              cardId_ = input.readUInt32();
              break;
            }
            case 120: {

              num_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.internal_static_GCGDSCardNumChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.internal_static_GCGDSCardNumChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.class, emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.Builder.class);
    }

    public static final int NUM_FIELD_NUMBER = 15;
    private int num_;
    /**
     * <code>uint32 num = 15;</code>
     * @return The num.
     */
    @java.lang.Override
    public int getNum() {
      return num_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 12;
    private int cardId_;
    /**
     * <code>uint32 card_id = 12;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(12, cardId_);
      }
      if (num_ != 0) {
        output.writeUInt32(15, num_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cardId_);
      }
      if (num_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, num_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify other = (emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify) obj;

      if (getNum()
          != other.getNum()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + NUM_FIELD_NUMBER;
      hash = (53 * hash) + getNum();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify prototype) {
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
     * CmdId: 7158
     * Obf: DBCICNAFMKH
     * </pre>
     *
     * Protobuf type {@code GCGDSCardNumChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardNumChangeNotify)
        emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.internal_static_GCGDSCardNumChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.internal_static_GCGDSCardNumChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.class, emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.newBuilder()
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
        num_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.internal_static_GCGDSCardNumChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify build() {
        emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify buildPartial() {
        emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify result = new emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify(this);
        result.num_ = num_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify other) {
        if (other == emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify.getDefaultInstance()) return this;
        if (other.getNum() != 0) {
          setNum(other.getNum());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int num_ ;
      /**
       * <code>uint32 num = 15;</code>
       * @return The num.
       */
      @java.lang.Override
      public int getNum() {
        return num_;
      }
      /**
       * <code>uint32 num = 15;</code>
       * @param value The num to set.
       * @return This builder for chaining.
       */
      public Builder setNum(int value) {
        
        num_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 num = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearNum() {
        
        num_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 12;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 12;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardNumChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardNumChangeNotify)
    private static final emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify();
    }

    public static emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardNumChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardNumChangeNotify>() {
      @java.lang.Override
      public GCGDSCardNumChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSCardNumChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSCardNumChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardNumChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSCardNumChangeNotifyOuterClass.GCGDSCardNumChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardNumChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardNumChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036GCGDSCardNumChangeNotify.proto\"8\n\030GCGD" +
      "SCardNumChangeNotify\022\013\n\003num\030\017 \001(\r\022\017\n\007car" +
      "d_id\030\014 \001(\rB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardNumChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardNumChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardNumChangeNotify_descriptor,
        new java.lang.String[] { "Num", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

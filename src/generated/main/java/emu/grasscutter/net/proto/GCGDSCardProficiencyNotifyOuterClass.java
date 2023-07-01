// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardProficiencyNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSCardProficiencyNotifyOuterClass {
  private GCGDSCardProficiencyNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardProficiencyNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardProficiencyNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    int getCardId();

    /**
     * <code>uint32 proficiency = 1;</code>
     * @return The proficiency.
     */
    int getProficiency();
  }
  /**
   * <pre>
   * CmdId: 7774
   * Obf: NKEGILJDAKE
   * </pre>
   *
   * Protobuf type {@code GCGDSCardProficiencyNotify}
   */
  public static final class GCGDSCardProficiencyNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardProficiencyNotify)
      GCGDSCardProficiencyNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardProficiencyNotify.newBuilder() to construct.
    private GCGDSCardProficiencyNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardProficiencyNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardProficiencyNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSCardProficiencyNotify(
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
            case 8: {

              proficiency_ = input.readUInt32();
              break;
            }
            case 16: {

              cardId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.class, emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 2;
    private int cardId_;
    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
    }

    public static final int PROFICIENCY_FIELD_NUMBER = 1;
    private int proficiency_;
    /**
     * <code>uint32 proficiency = 1;</code>
     * @return The proficiency.
     */
    @java.lang.Override
    public int getProficiency() {
      return proficiency_;
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
      if (proficiency_ != 0) {
        output.writeUInt32(1, proficiency_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(2, cardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (proficiency_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, proficiency_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cardId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify other = (emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify) obj;

      if (getCardId()
          != other.getCardId()) return false;
      if (getProficiency()
          != other.getProficiency()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (37 * hash) + PROFICIENCY_FIELD_NUMBER;
      hash = (53 * hash) + getProficiency();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify prototype) {
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
     * CmdId: 7774
     * Obf: NKEGILJDAKE
     * </pre>
     *
     * Protobuf type {@code GCGDSCardProficiencyNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardProficiencyNotify)
        emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.class, emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.newBuilder()
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
        cardId_ = 0;

        proficiency_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.internal_static_GCGDSCardProficiencyNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify build() {
        emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify buildPartial() {
        emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify result = new emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify(this);
        result.cardId_ = cardId_;
        result.proficiency_ = proficiency_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify other) {
        if (other == emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
        }
        if (other.getProficiency() != 0) {
          setProficiency(other.getProficiency());
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
        emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 2;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
        return this;
      }

      private int proficiency_ ;
      /**
       * <code>uint32 proficiency = 1;</code>
       * @return The proficiency.
       */
      @java.lang.Override
      public int getProficiency() {
        return proficiency_;
      }
      /**
       * <code>uint32 proficiency = 1;</code>
       * @param value The proficiency to set.
       * @return This builder for chaining.
       */
      public Builder setProficiency(int value) {
        
        proficiency_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 proficiency = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearProficiency() {
        
        proficiency_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardProficiencyNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardProficiencyNotify)
    private static final emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify();
    }

    public static emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardProficiencyNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardProficiencyNotify>() {
      @java.lang.Override
      public GCGDSCardProficiencyNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSCardProficiencyNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSCardProficiencyNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardProficiencyNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSCardProficiencyNotifyOuterClass.GCGDSCardProficiencyNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardProficiencyNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n GCGDSCardProficiencyNotify.proto\"B\n\032GC" +
      "GDSCardProficiencyNotify\022\017\n\007card_id\030\002 \001(" +
      "\r\022\023\n\013proficiency\030\001 \001(\rB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardProficiencyNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardProficiencyNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardProficiencyNotify_descriptor,
        new java.lang.String[] { "CardId", "Proficiency", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

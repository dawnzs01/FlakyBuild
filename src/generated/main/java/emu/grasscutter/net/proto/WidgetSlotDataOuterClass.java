// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WidgetSlotData.proto

package emu.grasscutter.net.proto;

public final class WidgetSlotDataOuterClass {
  private WidgetSlotDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WidgetSlotDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WidgetSlotData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.WidgetSlotTag tag = 1;</code>
     * @return The enum numeric value on the wire for tag.
     */
    int getTagValue();
    /**
     * <code>.WidgetSlotTag tag = 1;</code>
     * @return The tag.
     */
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTag();

    /**
     * <code>uint32 material_id = 15;</code>
     * @return The materialId.
     */
    int getMaterialId();

    /**
     * <code>bool is_active = 6;</code>
     * @return The isActive.
     */
    boolean getIsActive();

    /**
     * <code>uint32 cd_over_time = 2;</code>
     * @return The cdOverTime.
     */
    int getCdOverTime();
  }
  /**
   * <pre>
   * Obf: BEOHCOKHPFF
   * </pre>
   *
   * Protobuf type {@code WidgetSlotData}
   */
  public static final class WidgetSlotData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WidgetSlotData)
      WidgetSlotDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WidgetSlotData.newBuilder() to construct.
    private WidgetSlotData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WidgetSlotData() {
      tag_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WidgetSlotData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WidgetSlotData(
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
              int rawValue = input.readEnum();

              tag_ = rawValue;
              break;
            }
            case 16: {

              cdOverTime_ = input.readUInt32();
              break;
            }
            case 48: {

              isActive_ = input.readBool();
              break;
            }
            case 120: {

              materialId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.class, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder.class);
    }

    public static final int TAG_FIELD_NUMBER = 1;
    private int tag_;
    /**
     * <code>.WidgetSlotTag tag = 1;</code>
     * @return The enum numeric value on the wire for tag.
     */
    @java.lang.Override public int getTagValue() {
      return tag_;
    }
    /**
     * <code>.WidgetSlotTag tag = 1;</code>
     * @return The tag.
     */
    @java.lang.Override public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(tag_);
      return result == null ? emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
    }

    public static final int MATERIAL_ID_FIELD_NUMBER = 15;
    private int materialId_;
    /**
     * <code>uint32 material_id = 15;</code>
     * @return The materialId.
     */
    @java.lang.Override
    public int getMaterialId() {
      return materialId_;
    }

    public static final int IS_ACTIVE_FIELD_NUMBER = 6;
    private boolean isActive_;
    /**
     * <code>bool is_active = 6;</code>
     * @return The isActive.
     */
    @java.lang.Override
    public boolean getIsActive() {
      return isActive_;
    }

    public static final int CD_OVER_TIME_FIELD_NUMBER = 2;
    private int cdOverTime_;
    /**
     * <code>uint32 cd_over_time = 2;</code>
     * @return The cdOverTime.
     */
    @java.lang.Override
    public int getCdOverTime() {
      return cdOverTime_;
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
      if (tag_ != emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
        output.writeEnum(1, tag_);
      }
      if (cdOverTime_ != 0) {
        output.writeUInt32(2, cdOverTime_);
      }
      if (isActive_ != false) {
        output.writeBool(6, isActive_);
      }
      if (materialId_ != 0) {
        output.writeUInt32(15, materialId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tag_ != emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.WIDGET_SLOT_TAG_QUICK_USE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, tag_);
      }
      if (cdOverTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cdOverTime_);
      }
      if (isActive_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isActive_);
      }
      if (materialId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, materialId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData other = (emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData) obj;

      if (tag_ != other.tag_) return false;
      if (getMaterialId()
          != other.getMaterialId()) return false;
      if (getIsActive()
          != other.getIsActive()) return false;
      if (getCdOverTime()
          != other.getCdOverTime()) return false;
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
      hash = (37 * hash) + TAG_FIELD_NUMBER;
      hash = (53 * hash) + tag_;
      hash = (37 * hash) + MATERIAL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMaterialId();
      hash = (37 * hash) + IS_ACTIVE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsActive());
      hash = (37 * hash) + CD_OVER_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getCdOverTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData prototype) {
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
     * Obf: BEOHCOKHPFF
     * </pre>
     *
     * Protobuf type {@code WidgetSlotData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WidgetSlotData)
        emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.class, emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.newBuilder()
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
        tag_ = 0;

        materialId_ = 0;

        isActive_ = false;

        cdOverTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.internal_static_WidgetSlotData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData build() {
        emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData buildPartial() {
        emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData result = new emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData(this);
        result.tag_ = tag_;
        result.materialId_ = materialId_;
        result.isActive_ = isActive_;
        result.cdOverTime_ = cdOverTime_;
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
        if (other instanceof emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData) {
          return mergeFrom((emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData other) {
        if (other == emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData.getDefaultInstance()) return this;
        if (other.tag_ != 0) {
          setTagValue(other.getTagValue());
        }
        if (other.getMaterialId() != 0) {
          setMaterialId(other.getMaterialId());
        }
        if (other.getIsActive() != false) {
          setIsActive(other.getIsActive());
        }
        if (other.getCdOverTime() != 0) {
          setCdOverTime(other.getCdOverTime());
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
        emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int tag_ = 0;
      /**
       * <code>.WidgetSlotTag tag = 1;</code>
       * @return The enum numeric value on the wire for tag.
       */
      @java.lang.Override public int getTagValue() {
        return tag_;
      }
      /**
       * <code>.WidgetSlotTag tag = 1;</code>
       * @param value The enum numeric value on the wire for tag to set.
       * @return This builder for chaining.
       */
      public Builder setTagValue(int value) {
        
        tag_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotTag tag = 1;</code>
       * @return The tag.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag getTag() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag result = emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.valueOf(tag_);
        return result == null ? emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag.UNRECOGNIZED : result;
      }
      /**
       * <code>.WidgetSlotTag tag = 1;</code>
       * @param value The tag to set.
       * @return This builder for chaining.
       */
      public Builder setTag(emu.grasscutter.net.proto.WidgetSlotTagOuterClass.WidgetSlotTag value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        tag_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.WidgetSlotTag tag = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTag() {
        
        tag_ = 0;
        onChanged();
        return this;
      }

      private int materialId_ ;
      /**
       * <code>uint32 material_id = 15;</code>
       * @return The materialId.
       */
      @java.lang.Override
      public int getMaterialId() {
        return materialId_;
      }
      /**
       * <code>uint32 material_id = 15;</code>
       * @param value The materialId to set.
       * @return This builder for chaining.
       */
      public Builder setMaterialId(int value) {
        
        materialId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 material_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaterialId() {
        
        materialId_ = 0;
        onChanged();
        return this;
      }

      private boolean isActive_ ;
      /**
       * <code>bool is_active = 6;</code>
       * @return The isActive.
       */
      @java.lang.Override
      public boolean getIsActive() {
        return isActive_;
      }
      /**
       * <code>bool is_active = 6;</code>
       * @param value The isActive to set.
       * @return This builder for chaining.
       */
      public Builder setIsActive(boolean value) {
        
        isActive_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_active = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsActive() {
        
        isActive_ = false;
        onChanged();
        return this;
      }

      private int cdOverTime_ ;
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @return The cdOverTime.
       */
      @java.lang.Override
      public int getCdOverTime() {
        return cdOverTime_;
      }
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @param value The cdOverTime to set.
       * @return This builder for chaining.
       */
      public Builder setCdOverTime(int value) {
        
        cdOverTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cd_over_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCdOverTime() {
        
        cdOverTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:WidgetSlotData)
    }

    // @@protoc_insertion_point(class_scope:WidgetSlotData)
    private static final emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData();
    }

    public static emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WidgetSlotData>
        PARSER = new com.google.protobuf.AbstractParser<WidgetSlotData>() {
      @java.lang.Override
      public WidgetSlotData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WidgetSlotData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WidgetSlotData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WidgetSlotData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WidgetSlotDataOuterClass.WidgetSlotData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WidgetSlotData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WidgetSlotData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024WidgetSlotData.proto\032\023WidgetSlotTag.pr" +
      "oto\"k\n\016WidgetSlotData\022\033\n\003tag\030\001 \001(\0162\016.Wid" +
      "getSlotTag\022\023\n\013material_id\030\017 \001(\r\022\021\n\tis_ac" +
      "tive\030\006 \001(\010\022\024\n\014cd_over_time\030\002 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor(),
        });
    internal_static_WidgetSlotData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WidgetSlotData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WidgetSlotData_descriptor,
        new java.lang.String[] { "Tag", "MaterialId", "IsActive", "CdOverTime", });
    emu.grasscutter.net.proto.WidgetSlotTagOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
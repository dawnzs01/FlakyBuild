// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomePlantInfoNotify.proto

package emu.grasscutter.net.proto;

public final class HomePlantInfoNotifyOuterClass {
  private HomePlantInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomePlantInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomePlantInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> 
        getFieldListList();
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index);
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    int getFieldListCount();
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
        getFieldListOrBuilderList();
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4606
   * Obf: BPKLKNGIPAK
   * </pre>
   *
   * Protobuf type {@code HomePlantInfoNotify}
   */
  public static final class HomePlantInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomePlantInfoNotify)
      HomePlantInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomePlantInfoNotify.newBuilder() to construct.
    private HomePlantInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomePlantInfoNotify() {
      fieldList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomePlantInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomePlantInfoNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fieldList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData>();
                mutable_bitField0_ |= 0x00000001;
              }
              fieldList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fieldList_ = java.util.Collections.unmodifiableList(fieldList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.internal_static_HomePlantInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.internal_static_HomePlantInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.class, emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.Builder.class);
    }

    public static final int FIELD_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> fieldList_;
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> getFieldListList() {
      return fieldList_;
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
        getFieldListOrBuilderList() {
      return fieldList_;
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    @java.lang.Override
    public int getFieldListCount() {
      return fieldList_.size();
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index) {
      return fieldList_.get(index);
    }
    /**
     * <code>repeated .HomePlantFieldData field_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
        int index) {
      return fieldList_.get(index);
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
      for (int i = 0; i < fieldList_.size(); i++) {
        output.writeMessage(2, fieldList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < fieldList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, fieldList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify other = (emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify) obj;

      if (!getFieldListList()
          .equals(other.getFieldListList())) return false;
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
      if (getFieldListCount() > 0) {
        hash = (37 * hash) + FIELD_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getFieldListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify prototype) {
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
     * CmdId: 4606
     * Obf: BPKLKNGIPAK
     * </pre>
     *
     * Protobuf type {@code HomePlantInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomePlantInfoNotify)
        emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.internal_static_HomePlantInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.internal_static_HomePlantInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.class, emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.newBuilder()
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
          getFieldListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (fieldListBuilder_ == null) {
          fieldList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fieldListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.internal_static_HomePlantInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify build() {
        emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify buildPartial() {
        emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify result = new emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify(this);
        int from_bitField0_ = bitField0_;
        if (fieldListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fieldList_ = java.util.Collections.unmodifiableList(fieldList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fieldList_ = fieldList_;
        } else {
          result.fieldList_ = fieldListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify other) {
        if (other == emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify.getDefaultInstance()) return this;
        if (fieldListBuilder_ == null) {
          if (!other.fieldList_.isEmpty()) {
            if (fieldList_.isEmpty()) {
              fieldList_ = other.fieldList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFieldListIsMutable();
              fieldList_.addAll(other.fieldList_);
            }
            onChanged();
          }
        } else {
          if (!other.fieldList_.isEmpty()) {
            if (fieldListBuilder_.isEmpty()) {
              fieldListBuilder_.dispose();
              fieldListBuilder_ = null;
              fieldList_ = other.fieldList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fieldListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFieldListFieldBuilder() : null;
            } else {
              fieldListBuilder_.addAllMessages(other.fieldList_);
            }
          }
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
        emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> fieldList_ =
        java.util.Collections.emptyList();
      private void ensureFieldListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fieldList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData>(fieldList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> fieldListBuilder_;

      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> getFieldListList() {
        if (fieldListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fieldList_);
        } else {
          return fieldListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public int getFieldListCount() {
        if (fieldListBuilder_ == null) {
          return fieldList_.size();
        } else {
          return fieldListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData getFieldList(int index) {
        if (fieldListBuilder_ == null) {
          return fieldList_.get(index);
        } else {
          return fieldListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder setFieldList(
          int index, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.set(index, value);
          onChanged();
        } else {
          fieldListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder setFieldList(
          int index, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.set(index, builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder addFieldList(emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.add(value);
          onChanged();
        } else {
          fieldListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder addFieldList(
          int index, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData value) {
        if (fieldListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldListIsMutable();
          fieldList_.add(index, value);
          onChanged();
        } else {
          fieldListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder addFieldList(
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.add(builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder addFieldList(
          int index, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder builderForValue) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.add(index, builderForValue.build());
          onChanged();
        } else {
          fieldListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder addAllFieldList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData> values) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fieldList_);
          onChanged();
        } else {
          fieldListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder clearFieldList() {
        if (fieldListBuilder_ == null) {
          fieldList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fieldListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public Builder removeFieldList(int index) {
        if (fieldListBuilder_ == null) {
          ensureFieldListIsMutable();
          fieldList_.remove(index);
          onChanged();
        } else {
          fieldListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder getFieldListBuilder(
          int index) {
        return getFieldListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder getFieldListOrBuilder(
          int index) {
        if (fieldListBuilder_ == null) {
          return fieldList_.get(index);  } else {
          return fieldListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
           getFieldListOrBuilderList() {
        if (fieldListBuilder_ != null) {
          return fieldListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fieldList_);
        }
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder addFieldListBuilder() {
        return getFieldListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder addFieldListBuilder(
          int index) {
        return getFieldListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.getDefaultInstance());
      }
      /**
       * <code>repeated .HomePlantFieldData field_list = 2;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder> 
           getFieldListBuilderList() {
        return getFieldListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder> 
          getFieldListFieldBuilder() {
        if (fieldListBuilder_ == null) {
          fieldListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldData.Builder, emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.HomePlantFieldDataOrBuilder>(
                  fieldList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fieldList_ = null;
        }
        return fieldListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomePlantInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:HomePlantInfoNotify)
    private static final emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify();
    }

    public static emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomePlantInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<HomePlantInfoNotify>() {
      @java.lang.Override
      public HomePlantInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomePlantInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomePlantInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomePlantInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomePlantInfoNotifyOuterClass.HomePlantInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomePlantInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomePlantInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031HomePlantInfoNotify.proto\032\030HomePlantFi" +
      "eldData.proto\">\n\023HomePlantInfoNotify\022\'\n\n" +
      "field_list\030\002 \003(\0132\023.HomePlantFieldDataB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.getDescriptor(),
        });
    internal_static_HomePlantInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomePlantInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomePlantInfoNotify_descriptor,
        new java.lang.String[] { "FieldList", });
    emu.grasscutter.net.proto.HomePlantFieldDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

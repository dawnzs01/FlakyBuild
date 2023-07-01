// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MassiveGrassInfo.proto

package emu.grasscutter.net.proto;

public final class MassiveGrassInfoOuterClass {
  private MassiveGrassInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MassiveGrassInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MassiveGrassInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>.Vector center = 2;</code>
     * @return Whether the center field is set.
     */
    boolean hasCenter();
    /**
     * <code>.Vector center = 2;</code>
     * @return The center.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter();
    /**
     * <code>.Vector center = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder();

    /**
     * <code>.Vector size = 3;</code>
     * @return Whether the size field is set.
     */
    boolean hasSize();
    /**
     * <code>.Vector size = 3;</code>
     * @return The size.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getSize();
    /**
     * <code>.Vector size = 3;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSizeOrBuilder();
  }
  /**
   * <pre>
   * Obf: EACNKHKNNDA
   * </pre>
   *
   * Protobuf type {@code MassiveGrassInfo}
   */
  public static final class MassiveGrassInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MassiveGrassInfo)
      MassiveGrassInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MassiveGrassInfo.newBuilder() to construct.
    private MassiveGrassInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MassiveGrassInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MassiveGrassInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MassiveGrassInfo(
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

              id_ = input.readUInt32();
              break;
            }
            case 18: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (center_ != null) {
                subBuilder = center_.toBuilder();
              }
              center_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(center_);
                center_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (size_ != null) {
                subBuilder = size_.toBuilder();
              }
              size_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(size_);
                size_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.internal_static_MassiveGrassInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.internal_static_MassiveGrassInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.class, emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>uint32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int CENTER_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
    /**
     * <code>.Vector center = 2;</code>
     * @return Whether the center field is set.
     */
    @java.lang.Override
    public boolean hasCenter() {
      return center_ != null;
    }
    /**
     * <code>.Vector center = 2;</code>
     * @return The center.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
      return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
    }
    /**
     * <code>.Vector center = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
      return getCenter();
    }

    public static final int SIZE_FIELD_NUMBER = 3;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector size_;
    /**
     * <code>.Vector size = 3;</code>
     * @return Whether the size field is set.
     */
    @java.lang.Override
    public boolean hasSize() {
      return size_ != null;
    }
    /**
     * <code>.Vector size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getSize() {
      return size_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : size_;
    }
    /**
     * <code>.Vector size = 3;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSizeOrBuilder() {
      return getSize();
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
      if (id_ != 0) {
        output.writeUInt32(1, id_);
      }
      if (center_ != null) {
        output.writeMessage(2, getCenter());
      }
      if (size_ != null) {
        output.writeMessage(3, getSize());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (center_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getCenter());
      }
      if (size_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getSize());
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
      if (!(obj instanceof emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo other = (emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo) obj;

      if (getId()
          != other.getId()) return false;
      if (hasCenter() != other.hasCenter()) return false;
      if (hasCenter()) {
        if (!getCenter()
            .equals(other.getCenter())) return false;
      }
      if (hasSize() != other.hasSize()) return false;
      if (hasSize()) {
        if (!getSize()
            .equals(other.getSize())) return false;
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
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      if (hasCenter()) {
        hash = (37 * hash) + CENTER_FIELD_NUMBER;
        hash = (53 * hash) + getCenter().hashCode();
      }
      if (hasSize()) {
        hash = (37 * hash) + SIZE_FIELD_NUMBER;
        hash = (53 * hash) + getSize().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo prototype) {
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
     * Obf: EACNKHKNNDA
     * </pre>
     *
     * Protobuf type {@code MassiveGrassInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MassiveGrassInfo)
        emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.internal_static_MassiveGrassInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.internal_static_MassiveGrassInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.class, emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.newBuilder()
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
        id_ = 0;

        if (centerBuilder_ == null) {
          center_ = null;
        } else {
          center_ = null;
          centerBuilder_ = null;
        }
        if (sizeBuilder_ == null) {
          size_ = null;
        } else {
          size_ = null;
          sizeBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.internal_static_MassiveGrassInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo build() {
        emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo buildPartial() {
        emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo result = new emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo(this);
        result.id_ = id_;
        if (centerBuilder_ == null) {
          result.center_ = center_;
        } else {
          result.center_ = centerBuilder_.build();
        }
        if (sizeBuilder_ == null) {
          result.size_ = size_;
        } else {
          result.size_ = sizeBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo) {
          return mergeFrom((emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo other) {
        if (other == emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.hasCenter()) {
          mergeCenter(other.getCenter());
        }
        if (other.hasSize()) {
          mergeSize(other.getSize());
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
        emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector center_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> centerBuilder_;
      /**
       * <code>.Vector center = 2;</code>
       * @return Whether the center field is set.
       */
      public boolean hasCenter() {
        return centerBuilder_ != null || center_ != null;
      }
      /**
       * <code>.Vector center = 2;</code>
       * @return The center.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getCenter() {
        if (centerBuilder_ == null) {
          return center_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        } else {
          return centerBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public Builder setCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          center_ = value;
          onChanged();
        } else {
          centerBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public Builder setCenter(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (centerBuilder_ == null) {
          center_ = builderForValue.build();
          onChanged();
        } else {
          centerBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public Builder mergeCenter(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (centerBuilder_ == null) {
          if (center_ != null) {
            center_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(center_).mergeFrom(value).buildPartial();
          } else {
            center_ = value;
          }
          onChanged();
        } else {
          centerBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public Builder clearCenter() {
        if (centerBuilder_ == null) {
          center_ = null;
          onChanged();
        } else {
          center_ = null;
          centerBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getCenterBuilder() {
        
        onChanged();
        return getCenterFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getCenterOrBuilder() {
        if (centerBuilder_ != null) {
          return centerBuilder_.getMessageOrBuilder();
        } else {
          return center_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : center_;
        }
      }
      /**
       * <code>.Vector center = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getCenterFieldBuilder() {
        if (centerBuilder_ == null) {
          centerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getCenter(),
                  getParentForChildren(),
                  isClean());
          center_ = null;
        }
        return centerBuilder_;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector size_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> sizeBuilder_;
      /**
       * <code>.Vector size = 3;</code>
       * @return Whether the size field is set.
       */
      public boolean hasSize() {
        return sizeBuilder_ != null || size_ != null;
      }
      /**
       * <code>.Vector size = 3;</code>
       * @return The size.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getSize() {
        if (sizeBuilder_ == null) {
          return size_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : size_;
        } else {
          return sizeBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public Builder setSize(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (sizeBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          size_ = value;
          onChanged();
        } else {
          sizeBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public Builder setSize(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (sizeBuilder_ == null) {
          size_ = builderForValue.build();
          onChanged();
        } else {
          sizeBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public Builder mergeSize(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (sizeBuilder_ == null) {
          if (size_ != null) {
            size_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(size_).mergeFrom(value).buildPartial();
          } else {
            size_ = value;
          }
          onChanged();
        } else {
          sizeBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public Builder clearSize() {
        if (sizeBuilder_ == null) {
          size_ = null;
          onChanged();
        } else {
          size_ = null;
          sizeBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getSizeBuilder() {
        
        onChanged();
        return getSizeFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getSizeOrBuilder() {
        if (sizeBuilder_ != null) {
          return sizeBuilder_.getMessageOrBuilder();
        } else {
          return size_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : size_;
        }
      }
      /**
       * <code>.Vector size = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getSizeFieldBuilder() {
        if (sizeBuilder_ == null) {
          sizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getSize(),
                  getParentForChildren(),
                  isClean());
          size_ = null;
        }
        return sizeBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MassiveGrassInfo)
    }

    // @@protoc_insertion_point(class_scope:MassiveGrassInfo)
    private static final emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo();
    }

    public static emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MassiveGrassInfo>
        PARSER = new com.google.protobuf.AbstractParser<MassiveGrassInfo>() {
      @java.lang.Override
      public MassiveGrassInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MassiveGrassInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MassiveGrassInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MassiveGrassInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MassiveGrassInfoOuterClass.MassiveGrassInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MassiveGrassInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MassiveGrassInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026MassiveGrassInfo.proto\032\014Vector.proto\"N" +
      "\n\020MassiveGrassInfo\022\n\n\002id\030\001 \001(\r\022\027\n\006center" +
      "\030\002 \001(\0132\007.Vector\022\025\n\004size\030\003 \001(\0132\007.VectorB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_MassiveGrassInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MassiveGrassInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MassiveGrassInfo_descriptor,
        new java.lang.String[] { "Id", "Center", "Size", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

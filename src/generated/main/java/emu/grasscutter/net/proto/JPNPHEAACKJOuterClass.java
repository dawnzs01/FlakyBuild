// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JPNPHEAACKJ.proto

package emu.grasscutter.net.proto;

public final class JPNPHEAACKJOuterClass {
  private JPNPHEAACKJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JPNPHEAACKJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JPNPHEAACKJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     * @return Whether the progress field is set.
     */
    boolean hasProgress();
    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     * @return The progress.
     */
    emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA getProgress();
    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     */
    emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder getProgressOrBuilder();

    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 5598
   * </pre>
   *
   * Protobuf type {@code JPNPHEAACKJ}
   */
  public static final class JPNPHEAACKJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JPNPHEAACKJ)
      JPNPHEAACKJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JPNPHEAACKJ.newBuilder() to construct.
    private JPNPHEAACKJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JPNPHEAACKJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JPNPHEAACKJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JPNPHEAACKJ(
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
            case 90: {
              emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder subBuilder = null;
              if (progress_ != null) {
                subBuilder = progress_.toBuilder();
              }
              progress_ = input.readMessage(emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(progress_);
                progress_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              galleryId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.internal_static_JPNPHEAACKJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.internal_static_JPNPHEAACKJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.class, emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.Builder.class);
    }

    public static final int PROGRESS_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA progress_;
    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     * @return Whether the progress field is set.
     */
    @java.lang.Override
    public boolean hasProgress() {
      return progress_ != null;
    }
    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     * @return The progress.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA getProgress() {
      return progress_ == null ? emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.getDefaultInstance() : progress_;
    }
    /**
     * <code>.PHKJPHNBGHA progress = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder getProgressOrBuilder() {
      return getProgress();
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 14;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 14;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (progress_ != null) {
        output.writeMessage(11, getProgress());
      }
      if (galleryId_ != 0) {
        output.writeUInt32(14, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getProgress());
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, galleryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ other = (emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ) obj;

      if (hasProgress() != other.hasProgress()) return false;
      if (hasProgress()) {
        if (!getProgress()
            .equals(other.getProgress())) return false;
      }
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      if (hasProgress()) {
        hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
        hash = (53 * hash) + getProgress().hashCode();
      }
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ prototype) {
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
     * CmdId: 5598
     * </pre>
     *
     * Protobuf type {@code JPNPHEAACKJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JPNPHEAACKJ)
        emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.internal_static_JPNPHEAACKJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.internal_static_JPNPHEAACKJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.class, emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.newBuilder()
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
        if (progressBuilder_ == null) {
          progress_ = null;
        } else {
          progress_ = null;
          progressBuilder_ = null;
        }
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.internal_static_JPNPHEAACKJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ build() {
        emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ buildPartial() {
        emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ result = new emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ(this);
        if (progressBuilder_ == null) {
          result.progress_ = progress_;
        } else {
          result.progress_ = progressBuilder_.build();
        }
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ) {
          return mergeFrom((emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ other) {
        if (other == emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ.getDefaultInstance()) return this;
        if (other.hasProgress()) {
          mergeProgress(other.getProgress());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA progress_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder> progressBuilder_;
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       * @return Whether the progress field is set.
       */
      public boolean hasProgress() {
        return progressBuilder_ != null || progress_ != null;
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       * @return The progress.
       */
      public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA getProgress() {
        if (progressBuilder_ == null) {
          return progress_ == null ? emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.getDefaultInstance() : progress_;
        } else {
          return progressBuilder_.getMessage();
        }
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public Builder setProgress(emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA value) {
        if (progressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          progress_ = value;
          onChanged();
        } else {
          progressBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public Builder setProgress(
          emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder builderForValue) {
        if (progressBuilder_ == null) {
          progress_ = builderForValue.build();
          onChanged();
        } else {
          progressBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public Builder mergeProgress(emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA value) {
        if (progressBuilder_ == null) {
          if (progress_ != null) {
            progress_ =
              emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.newBuilder(progress_).mergeFrom(value).buildPartial();
          } else {
            progress_ = value;
          }
          onChanged();
        } else {
          progressBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public Builder clearProgress() {
        if (progressBuilder_ == null) {
          progress_ = null;
          onChanged();
        } else {
          progress_ = null;
          progressBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder getProgressBuilder() {
        
        onChanged();
        return getProgressFieldBuilder().getBuilder();
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      public emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder getProgressOrBuilder() {
        if (progressBuilder_ != null) {
          return progressBuilder_.getMessageOrBuilder();
        } else {
          return progress_ == null ?
              emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.getDefaultInstance() : progress_;
        }
      }
      /**
       * <code>.PHKJPHNBGHA progress = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder> 
          getProgressFieldBuilder() {
        if (progressBuilder_ == null) {
          progressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHA.Builder, emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.PHKJPHNBGHAOrBuilder>(
                  getProgress(),
                  getParentForChildren(),
                  isClean());
          progress_ = null;
        }
        return progressBuilder_;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JPNPHEAACKJ)
    }

    // @@protoc_insertion_point(class_scope:JPNPHEAACKJ)
    private static final emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ();
    }

    public static emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JPNPHEAACKJ>
        PARSER = new com.google.protobuf.AbstractParser<JPNPHEAACKJ>() {
      @java.lang.Override
      public JPNPHEAACKJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JPNPHEAACKJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JPNPHEAACKJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JPNPHEAACKJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JPNPHEAACKJOuterClass.JPNPHEAACKJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JPNPHEAACKJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JPNPHEAACKJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JPNPHEAACKJ.proto\032\021PHKJPHNBGHA.proto\"A" +
      "\n\013JPNPHEAACKJ\022\036\n\010progress\030\013 \001(\0132\014.PHKJPH" +
      "NBGHA\022\022\n\ngallery_id\030\016 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.getDescriptor(),
        });
    internal_static_JPNPHEAACKJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JPNPHEAACKJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JPNPHEAACKJ_descriptor,
        new java.lang.String[] { "Progress", "GalleryId", });
    emu.grasscutter.net.proto.PHKJPHNBGHAOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

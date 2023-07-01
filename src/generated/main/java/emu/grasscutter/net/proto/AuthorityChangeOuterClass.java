// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthorityChange.proto

package emu.grasscutter.net.proto;

public final class AuthorityChangeOuterClass {
  private AuthorityChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AuthorityChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AuthorityChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 authority_peer_id = 5;</code>
     * @return The authorityPeerId.
     */
    int getAuthorityPeerId();

    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     * @return Whether the entityAuthorityInfo field is set.
     */
    boolean hasEntityAuthorityInfo();
    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     * @return The entityAuthorityInfo.
     */
    emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo();
    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     */
    emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * Obf: ABPGGKJDEIM
   * </pre>
   *
   * Protobuf type {@code AuthorityChange}
   */
  public static final class AuthorityChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AuthorityChange)
      AuthorityChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AuthorityChange.newBuilder() to construct.
    private AuthorityChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AuthorityChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AuthorityChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AuthorityChange(
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

              authorityPeerId_ = input.readUInt32();
              break;
            }
            case 88: {

              entityId_ = input.readUInt32();
              break;
            }
            case 122: {
              emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder subBuilder = null;
              if (entityAuthorityInfo_ != null) {
                subBuilder = entityAuthorityInfo_.toBuilder();
              }
              entityAuthorityInfo_ = input.readMessage(emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(entityAuthorityInfo_);
                entityAuthorityInfo_ = subBuilder.buildPartial();
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
      return emu.grasscutter.net.proto.AuthorityChangeOuterClass.internal_static_AuthorityChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AuthorityChangeOuterClass.internal_static_AuthorityChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.class, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder.class);
    }

    public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 5;
    private int authorityPeerId_;
    /**
     * <code>uint32 authority_peer_id = 5;</code>
     * @return The authorityPeerId.
     */
    @java.lang.Override
    public int getAuthorityPeerId() {
      return authorityPeerId_;
    }

    public static final int ENTITY_AUTHORITY_INFO_FIELD_NUMBER = 15;
    private emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo entityAuthorityInfo_;
    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     * @return Whether the entityAuthorityInfo field is set.
     */
    @java.lang.Override
    public boolean hasEntityAuthorityInfo() {
      return entityAuthorityInfo_ != null;
    }
    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     * @return The entityAuthorityInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo() {
      return entityAuthorityInfo_ == null ? emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : entityAuthorityInfo_;
    }
    /**
     * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder() {
      return getEntityAuthorityInfo();
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (authorityPeerId_ != 0) {
        output.writeUInt32(5, authorityPeerId_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      if (entityAuthorityInfo_ != null) {
        output.writeMessage(15, getEntityAuthorityInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (authorityPeerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, authorityPeerId_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
      }
      if (entityAuthorityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(15, getEntityAuthorityInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange other = (emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange) obj;

      if (getAuthorityPeerId()
          != other.getAuthorityPeerId()) return false;
      if (hasEntityAuthorityInfo() != other.hasEntityAuthorityInfo()) return false;
      if (hasEntityAuthorityInfo()) {
        if (!getEntityAuthorityInfo()
            .equals(other.getEntityAuthorityInfo())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + AUTHORITY_PEER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityPeerId();
      if (hasEntityAuthorityInfo()) {
        hash = (37 * hash) + ENTITY_AUTHORITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getEntityAuthorityInfo().hashCode();
      }
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange prototype) {
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
     * Obf: ABPGGKJDEIM
     * </pre>
     *
     * Protobuf type {@code AuthorityChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AuthorityChange)
        emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AuthorityChangeOuterClass.internal_static_AuthorityChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AuthorityChangeOuterClass.internal_static_AuthorityChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.class, emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.newBuilder()
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
        authorityPeerId_ = 0;

        if (entityAuthorityInfoBuilder_ == null) {
          entityAuthorityInfo_ = null;
        } else {
          entityAuthorityInfo_ = null;
          entityAuthorityInfoBuilder_ = null;
        }
        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AuthorityChangeOuterClass.internal_static_AuthorityChange_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange build() {
        emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange buildPartial() {
        emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange result = new emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange(this);
        result.authorityPeerId_ = authorityPeerId_;
        if (entityAuthorityInfoBuilder_ == null) {
          result.entityAuthorityInfo_ = entityAuthorityInfo_;
        } else {
          result.entityAuthorityInfo_ = entityAuthorityInfoBuilder_.build();
        }
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange) {
          return mergeFrom((emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange other) {
        if (other == emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange.getDefaultInstance()) return this;
        if (other.getAuthorityPeerId() != 0) {
          setAuthorityPeerId(other.getAuthorityPeerId());
        }
        if (other.hasEntityAuthorityInfo()) {
          mergeEntityAuthorityInfo(other.getEntityAuthorityInfo());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int authorityPeerId_ ;
      /**
       * <code>uint32 authority_peer_id = 5;</code>
       * @return The authorityPeerId.
       */
      @java.lang.Override
      public int getAuthorityPeerId() {
        return authorityPeerId_;
      }
      /**
       * <code>uint32 authority_peer_id = 5;</code>
       * @param value The authorityPeerId to set.
       * @return This builder for chaining.
       */
      public Builder setAuthorityPeerId(int value) {
        
        authorityPeerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 authority_peer_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAuthorityPeerId() {
        
        authorityPeerId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo entityAuthorityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder> entityAuthorityInfoBuilder_;
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       * @return Whether the entityAuthorityInfo field is set.
       */
      public boolean hasEntityAuthorityInfo() {
        return entityAuthorityInfoBuilder_ != null || entityAuthorityInfo_ != null;
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       * @return The entityAuthorityInfo.
       */
      public emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo getEntityAuthorityInfo() {
        if (entityAuthorityInfoBuilder_ == null) {
          return entityAuthorityInfo_ == null ? emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : entityAuthorityInfo_;
        } else {
          return entityAuthorityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public Builder setEntityAuthorityInfo(emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo value) {
        if (entityAuthorityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entityAuthorityInfo_ = value;
          onChanged();
        } else {
          entityAuthorityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public Builder setEntityAuthorityInfo(
          emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder builderForValue) {
        if (entityAuthorityInfoBuilder_ == null) {
          entityAuthorityInfo_ = builderForValue.build();
          onChanged();
        } else {
          entityAuthorityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public Builder mergeEntityAuthorityInfo(emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo value) {
        if (entityAuthorityInfoBuilder_ == null) {
          if (entityAuthorityInfo_ != null) {
            entityAuthorityInfo_ =
              emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.newBuilder(entityAuthorityInfo_).mergeFrom(value).buildPartial();
          } else {
            entityAuthorityInfo_ = value;
          }
          onChanged();
        } else {
          entityAuthorityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public Builder clearEntityAuthorityInfo() {
        if (entityAuthorityInfoBuilder_ == null) {
          entityAuthorityInfo_ = null;
          onChanged();
        } else {
          entityAuthorityInfo_ = null;
          entityAuthorityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder getEntityAuthorityInfoBuilder() {
        
        onChanged();
        return getEntityAuthorityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      public emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder getEntityAuthorityInfoOrBuilder() {
        if (entityAuthorityInfoBuilder_ != null) {
          return entityAuthorityInfoBuilder_.getMessageOrBuilder();
        } else {
          return entityAuthorityInfo_ == null ?
              emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.getDefaultInstance() : entityAuthorityInfo_;
        }
      }
      /**
       * <code>.EntityAuthorityInfo entity_authority_info = 15;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder> 
          getEntityAuthorityInfoFieldBuilder() {
        if (entityAuthorityInfoBuilder_ == null) {
          entityAuthorityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfo.Builder, emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.EntityAuthorityInfoOrBuilder>(
                  getEntityAuthorityInfo(),
                  getParentForChildren(),
                  isClean());
          entityAuthorityInfo_ = null;
        }
        return entityAuthorityInfoBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AuthorityChange)
    }

    // @@protoc_insertion_point(class_scope:AuthorityChange)
    private static final emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange();
    }

    public static emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AuthorityChange>
        PARSER = new com.google.protobuf.AbstractParser<AuthorityChange>() {
      @java.lang.Override
      public AuthorityChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthorityChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AuthorityChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AuthorityChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AuthorityChangeOuterClass.AuthorityChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthorityChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AuthorityChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025AuthorityChange.proto\032\031EntityAuthority" +
      "Info.proto\"t\n\017AuthorityChange\022\031\n\021authori" +
      "ty_peer_id\030\005 \001(\r\0223\n\025entity_authority_inf" +
      "o\030\017 \001(\0132\024.EntityAuthorityInfo\022\021\n\tentity_" +
      "id\030\013 \001(\rB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.getDescriptor(),
        });
    internal_static_AuthorityChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AuthorityChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AuthorityChange_descriptor,
        new java.lang.String[] { "AuthorityPeerId", "EntityAuthorityInfo", "EntityId", });
    emu.grasscutter.net.proto.EntityAuthorityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

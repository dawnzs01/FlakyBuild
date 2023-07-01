// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DumperServer.proto

package com.alibaba.polardbx.rpc.cdc;

/**
 * Protobuf type {@code dumper.ShowBinlogEventsRequest}
 */
public final class ShowBinlogEventsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dumper.ShowBinlogEventsRequest)
    ShowBinlogEventsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShowBinlogEventsRequest.newBuilder() to construct.
  private ShowBinlogEventsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShowBinlogEventsRequest() {
    logName_ = "";
    streamName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShowBinlogEventsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShowBinlogEventsRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            logName_ = s;
            break;
          }
          case 16: {

            pos_ = input.readInt64();
            break;
          }
          case 24: {

            offset_ = input.readInt64();
            break;
          }
          case 32: {

            rowCount_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            streamName_ = s;
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
    return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_ShowBinlogEventsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_ShowBinlogEventsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.class, com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.Builder.class);
  }

  public static final int LOGNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object logName_;
  /**
   * <code>string logName = 1;</code>
   * @return The logName.
   */
  @java.lang.Override
  public java.lang.String getLogName() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logName_ = s;
      return s;
    }
  }
  /**
   * <code>string logName = 1;</code>
   * @return The bytes for logName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLogNameBytes() {
    java.lang.Object ref = logName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      logName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POS_FIELD_NUMBER = 2;
  private long pos_;
  /**
   * <code>int64 pos = 2;</code>
   * @return The pos.
   */
  @java.lang.Override
  public long getPos() {
    return pos_;
  }

  public static final int OFFSET_FIELD_NUMBER = 3;
  private long offset_;
  /**
   * <code>int64 offset = 3;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int ROWCOUNT_FIELD_NUMBER = 4;
  private long rowCount_;
  /**
   * <code>int64 rowCount = 4;</code>
   * @return The rowCount.
   */
  @java.lang.Override
  public long getRowCount() {
    return rowCount_;
  }

  public static final int STREAMNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object streamName_;
  /**
   * <code>string streamName = 5;</code>
   * @return The streamName.
   */
  @java.lang.Override
  public java.lang.String getStreamName() {
    java.lang.Object ref = streamName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      streamName_ = s;
      return s;
    }
  }
  /**
   * <code>string streamName = 5;</code>
   * @return The bytes for streamName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreamNameBytes() {
    java.lang.Object ref = streamName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      streamName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getLogNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, logName_);
    }
    if (pos_ != 0L) {
      output.writeInt64(2, pos_);
    }
    if (offset_ != 0L) {
      output.writeInt64(3, offset_);
    }
    if (rowCount_ != 0L) {
      output.writeInt64(4, rowCount_);
    }
    if (!getStreamNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, streamName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLogNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, logName_);
    }
    if (pos_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, pos_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, offset_);
    }
    if (rowCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, rowCount_);
    }
    if (!getStreamNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, streamName_);
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
    if (!(obj instanceof com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest)) {
      return super.equals(obj);
    }
    com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest other = (com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest) obj;

    if (!getLogName()
        .equals(other.getLogName())) return false;
    if (getPos()
        != other.getPos()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getRowCount()
        != other.getRowCount()) return false;
    if (!getStreamName()
        .equals(other.getStreamName())) return false;
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
    hash = (37 * hash) + LOGNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLogName().hashCode();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPos());
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + ROWCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRowCount());
    hash = (37 * hash) + STREAMNAME_FIELD_NUMBER;
    hash = (53 * hash) + getStreamName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parseFrom(
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
  public static Builder newBuilder(com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest prototype) {
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
   * Protobuf type {@code dumper.ShowBinlogEventsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dumper.ShowBinlogEventsRequest)
      com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_ShowBinlogEventsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_ShowBinlogEventsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.class, com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.Builder.class);
    }

    // Construct using com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.newBuilder()
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
      logName_ = "";

      pos_ = 0L;

      offset_ = 0L;

      rowCount_ = 0L;

      streamName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.alibaba.polardbx.rpc.cdc.DumperServer.internal_static_dumper_ShowBinlogEventsRequest_descriptor;
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest getDefaultInstanceForType() {
      return com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest build() {
      com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest buildPartial() {
      com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest result = new com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest(this);
      result.logName_ = logName_;
      result.pos_ = pos_;
      result.offset_ = offset_;
      result.rowCount_ = rowCount_;
      result.streamName_ = streamName_;
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
      if (other instanceof com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest) {
        return mergeFrom((com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest other) {
      if (other == com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest.getDefaultInstance()) return this;
      if (!other.getLogName().isEmpty()) {
        logName_ = other.logName_;
        onChanged();
      }
      if (other.getPos() != 0L) {
        setPos(other.getPos());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getRowCount() != 0L) {
        setRowCount(other.getRowCount());
      }
      if (!other.getStreamName().isEmpty()) {
        streamName_ = other.streamName_;
        onChanged();
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
      com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object logName_ = "";
    /**
     * <code>string logName = 1;</code>
     * @return The logName.
     */
    public java.lang.String getLogName() {
      java.lang.Object ref = logName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @return The bytes for logName.
     */
    public com.google.protobuf.ByteString
        getLogNameBytes() {
      java.lang.Object ref = logName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        logName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      logName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLogName() {
      
      logName_ = getDefaultInstance().getLogName();
      onChanged();
      return this;
    }
    /**
     * <code>string logName = 1;</code>
     * @param value The bytes for logName to set.
     * @return This builder for chaining.
     */
    public Builder setLogNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      logName_ = value;
      onChanged();
      return this;
    }

    private long pos_ ;
    /**
     * <code>int64 pos = 2;</code>
     * @return The pos.
     */
    @java.lang.Override
    public long getPos() {
      return pos_;
    }
    /**
     * <code>int64 pos = 2;</code>
     * @param value The pos to set.
     * @return This builder for chaining.
     */
    public Builder setPos(long value) {
      
      pos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pos = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPos() {
      
      pos_ = 0L;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>int64 offset = 3;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>int64 offset = 3;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 offset = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      
      offset_ = 0L;
      onChanged();
      return this;
    }

    private long rowCount_ ;
    /**
     * <code>int64 rowCount = 4;</code>
     * @return The rowCount.
     */
    @java.lang.Override
    public long getRowCount() {
      return rowCount_;
    }
    /**
     * <code>int64 rowCount = 4;</code>
     * @param value The rowCount to set.
     * @return This builder for chaining.
     */
    public Builder setRowCount(long value) {
      
      rowCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 rowCount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRowCount() {
      
      rowCount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object streamName_ = "";
    /**
     * <code>string streamName = 5;</code>
     * @return The streamName.
     */
    public java.lang.String getStreamName() {
      java.lang.Object ref = streamName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        streamName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string streamName = 5;</code>
     * @return The bytes for streamName.
     */
    public com.google.protobuf.ByteString
        getStreamNameBytes() {
      java.lang.Object ref = streamName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        streamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string streamName = 5;</code>
     * @param value The streamName to set.
     * @return This builder for chaining.
     */
    public Builder setStreamName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      streamName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string streamName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreamName() {
      
      streamName_ = getDefaultInstance().getStreamName();
      onChanged();
      return this;
    }
    /**
     * <code>string streamName = 5;</code>
     * @param value The bytes for streamName to set.
     * @return This builder for chaining.
     */
    public Builder setStreamNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      streamName_ = value;
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


    // @@protoc_insertion_point(builder_scope:dumper.ShowBinlogEventsRequest)
  }

  // @@protoc_insertion_point(class_scope:dumper.ShowBinlogEventsRequest)
  private static final com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest();
  }

  public static com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShowBinlogEventsRequest>
      PARSER = new com.google.protobuf.AbstractParser<ShowBinlogEventsRequest>() {
    @java.lang.Override
    public ShowBinlogEventsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShowBinlogEventsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShowBinlogEventsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShowBinlogEventsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.alibaba.polardbx.rpc.cdc.ShowBinlogEventsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

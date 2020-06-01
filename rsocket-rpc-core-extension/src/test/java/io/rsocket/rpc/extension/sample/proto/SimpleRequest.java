// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package io.rsocket.rpc.extension.sample.proto;

/**
 * Protobuf type {@code io.rsocket.rpc.extension.sample.proto.SimpleRequest}
 */
public  final class SimpleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.rsocket.rpc.extension.sample.proto.SimpleRequest)
    SimpleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleRequest.newBuilder() to construct.
  private SimpleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleRequest() {
    requestMessage_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimpleRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            requestMessage_ = s;
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
    return io.rsocket.rpc.extension.sample.proto.SimpleServiceProto.internal_static_io_netifi_rsocket_example_SimpleRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.rsocket.rpc.extension.sample.proto.SimpleServiceProto.internal_static_io_netifi_rsocket_example_SimpleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.rsocket.rpc.extension.sample.proto.SimpleRequest.class, io.rsocket.rpc.extension.sample.proto.SimpleRequest.Builder.class);
  }

  public static final int REQUESTMESSAGE_FIELD_NUMBER = 1;
  private volatile Object requestMessage_;
  /**
   * <code>string requestMessage = 1;</code>
   * @return The requestMessage.
   */
  public String getRequestMessage() {
    Object ref = requestMessage_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      requestMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string requestMessage = 1;</code>
   * @return The bytes for requestMessage.
   */
  public com.google.protobuf.ByteString
      getRequestMessageBytes() {
    Object ref = requestMessage_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      requestMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getRequestMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, requestMessage_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRequestMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, requestMessage_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.rsocket.rpc.extension.sample.proto.SimpleRequest)) {
      return super.equals(obj);
    }
    io.rsocket.rpc.extension.sample.proto.SimpleRequest other = (io.rsocket.rpc.extension.sample.proto.SimpleRequest) obj;

    if (!getRequestMessage()
        .equals(other.getRequestMessage())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUESTMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getRequestMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.rsocket.rpc.extension.sample.proto.SimpleRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.rsocket.rpc.extension.sample.proto.SimpleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.rsocket.rpc.extension.sample.proto.SimpleRequest)
      io.rsocket.rpc.extension.sample.proto.SimpleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.rsocket.rpc.extension.sample.proto.SimpleServiceProto.internal_static_io_netifi_rsocket_example_SimpleRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.rsocket.rpc.extension.sample.proto.SimpleServiceProto.internal_static_io_netifi_rsocket_example_SimpleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.rsocket.rpc.extension.sample.proto.SimpleRequest.class, io.rsocket.rpc.extension.sample.proto.SimpleRequest.Builder.class);
    }

    // Construct using io.rsocket.rpc.extension.sample.proto.SimpleRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      requestMessage_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.rsocket.rpc.extension.sample.proto.SimpleServiceProto.internal_static_io_netifi_rsocket_example_SimpleRequest_descriptor;
    }

    @Override
    public io.rsocket.rpc.extension.sample.proto.SimpleRequest getDefaultInstanceForType() {
      return io.rsocket.rpc.extension.sample.proto.SimpleRequest.getDefaultInstance();
    }

    @Override
    public io.rsocket.rpc.extension.sample.proto.SimpleRequest build() {
      io.rsocket.rpc.extension.sample.proto.SimpleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.rsocket.rpc.extension.sample.proto.SimpleRequest buildPartial() {
      io.rsocket.rpc.extension.sample.proto.SimpleRequest result = new io.rsocket.rpc.extension.sample.proto.SimpleRequest(this);
      result.requestMessage_ = requestMessage_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.rsocket.rpc.extension.sample.proto.SimpleRequest) {
        return mergeFrom((io.rsocket.rpc.extension.sample.proto.SimpleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.rsocket.rpc.extension.sample.proto.SimpleRequest other) {
      if (other == io.rsocket.rpc.extension.sample.proto.SimpleRequest.getDefaultInstance()) return this;
      if (!other.getRequestMessage().isEmpty()) {
        requestMessage_ = other.requestMessage_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.rsocket.rpc.extension.sample.proto.SimpleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.rsocket.rpc.extension.sample.proto.SimpleRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object requestMessage_ = "";
    /**
     * <code>string requestMessage = 1;</code>
     * @return The requestMessage.
     */
    public String getRequestMessage() {
      Object ref = requestMessage_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        requestMessage_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string requestMessage = 1;</code>
     * @return The bytes for requestMessage.
     */
    public com.google.protobuf.ByteString
        getRequestMessageBytes() {
      Object ref = requestMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        requestMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requestMessage = 1;</code>
     * @param value The requestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setRequestMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string requestMessage = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestMessage() {
      
      requestMessage_ = getDefaultInstance().getRequestMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string requestMessage = 1;</code>
     * @param value The bytes for requestMessage to set.
     * @return This builder for chaining.
     */
    public Builder setRequestMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestMessage_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.rsocket.rpc.extension.sample.proto.SimpleRequest)
  }

  // @@protoc_insertion_point(class_scope:io.rsocket.rpc.extension.sample.proto.SimpleRequest)
  private static final io.rsocket.rpc.extension.sample.proto.SimpleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.rsocket.rpc.extension.sample.proto.SimpleRequest();
  }

  public static io.rsocket.rpc.extension.sample.proto.SimpleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleRequest>
      PARSER = new com.google.protobuf.AbstractParser<SimpleRequest>() {
    @Override
    public SimpleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimpleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SimpleRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public io.rsocket.rpc.extension.sample.proto.SimpleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


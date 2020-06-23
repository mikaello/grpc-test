// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

/**
 * <pre>
 * Points are represented as latitude-longitude pairs in the E7 representation
 * (degrees multiplied by 10**7 and rounded to the nearest integer).
 * Latitudes should be in the range +/- 90 degrees and longitude should be in
 * the range +/- 180 degrees (inclusive).
 * </pre>
 *
 * Protobuf type {@code io.grpc.examples.routeguide.Point}
 */
public  final class Point extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.grpc.examples.routeguide.Point)
    PointOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Point() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Point();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Point(
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

            latitude_ = input.readInt32();
            break;
          }
          case 16: {

            longitude_ = input.readInt32();
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
    return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.routeguide.Point.class, io.grpc.examples.routeguide.Point.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private int latitude_;
  /**
   * <code>int32 latitude = 1;</code>
   * @return The latitude.
   */
  public int getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private int longitude_;
  /**
   * <code>int32 longitude = 2;</code>
   * @return The longitude.
   */
  public int getLongitude() {
    return longitude_;
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
    if (latitude_ != 0) {
      output.writeInt32(1, latitude_);
    }
    if (longitude_ != 0) {
      output.writeInt32(2, longitude_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, latitude_);
    }
    if (longitude_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, longitude_);
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
    if (!(obj instanceof io.grpc.examples.routeguide.Point)) {
      return super.equals(obj);
    }
    io.grpc.examples.routeguide.Point other = (io.grpc.examples.routeguide.Point) obj;

    if (getLatitude()
        != other.getLatitude()) return false;
    if (getLongitude()
        != other.getLongitude()) return false;
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
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + getLatitude();
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + getLongitude();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.routeguide.Point parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.Point parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.Point parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.routeguide.Point prototype) {
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
   * Points are represented as latitude-longitude pairs in the E7 representation
   * (degrees multiplied by 10**7 and rounded to the nearest integer).
   * Latitudes should be in the range +/- 90 degrees and longitude should be in
   * the range +/- 180 degrees (inclusive).
   * </pre>
   *
   * Protobuf type {@code io.grpc.examples.routeguide.Point}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.grpc.examples.routeguide.Point)
      io.grpc.examples.routeguide.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.routeguide.Point.class, io.grpc.examples.routeguide.Point.Builder.class);
    }

    // Construct using io.grpc.examples.routeguide.Point.newBuilder()
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
      latitude_ = 0;

      longitude_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_Point_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.Point getDefaultInstanceForType() {
      return io.grpc.examples.routeguide.Point.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.Point build() {
      io.grpc.examples.routeguide.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.Point buildPartial() {
      io.grpc.examples.routeguide.Point result = new io.grpc.examples.routeguide.Point(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
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
      if (other instanceof io.grpc.examples.routeguide.Point) {
        return mergeFrom((io.grpc.examples.routeguide.Point)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.routeguide.Point other) {
      if (other == io.grpc.examples.routeguide.Point.getDefaultInstance()) return this;
      if (other.getLatitude() != 0) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0) {
        setLongitude(other.getLongitude());
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
      io.grpc.examples.routeguide.Point parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.routeguide.Point) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int latitude_ ;
    /**
     * <code>int32 latitude = 1;</code>
     * @return The latitude.
     */
    public int getLatitude() {
      return latitude_;
    }
    /**
     * <code>int32 latitude = 1;</code>
     * @param value The latitude to set.
     * @return This builder for chaining.
     */
    public Builder setLatitude(int value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 latitude = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLatitude() {
      
      latitude_ = 0;
      onChanged();
      return this;
    }

    private int longitude_ ;
    /**
     * <code>int32 longitude = 2;</code>
     * @return The longitude.
     */
    public int getLongitude() {
      return longitude_;
    }
    /**
     * <code>int32 longitude = 2;</code>
     * @param value The longitude to set.
     * @return This builder for chaining.
     */
    public Builder setLongitude(int value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 longitude = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLongitude() {
      
      longitude_ = 0;
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


    // @@protoc_insertion_point(builder_scope:io.grpc.examples.routeguide.Point)
  }

  // @@protoc_insertion_point(class_scope:io.grpc.examples.routeguide.Point)
  private static final io.grpc.examples.routeguide.Point DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.routeguide.Point();
  }

  public static io.grpc.examples.routeguide.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point>
      PARSER = new com.google.protobuf.AbstractParser<Point>() {
    @java.lang.Override
    public Point parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Point(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.routeguide.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


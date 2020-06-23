// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: route_guide.proto

package io.grpc.examples.routeguide;

/**
 * <pre>
 * A RouteSummary is received in response to a RecordRoute rpc.
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 * </pre>
 *
 * Protobuf type {@code io.grpc.examples.routeguide.RouteSummary}
 */
public  final class RouteSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.grpc.examples.routeguide.RouteSummary)
    RouteSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteSummary.newBuilder() to construct.
  private RouteSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteSummary();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteSummary(
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

            pointCount_ = input.readInt32();
            break;
          }
          case 16: {

            featureCount_ = input.readInt32();
            break;
          }
          case 24: {

            distance_ = input.readInt32();
            break;
          }
          case 34: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (elapsedTime_ != null) {
              subBuilder = elapsedTime_.toBuilder();
            }
            elapsedTime_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(elapsedTime_);
              elapsedTime_ = subBuilder.buildPartial();
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
    return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_RouteSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_RouteSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.examples.routeguide.RouteSummary.class, io.grpc.examples.routeguide.RouteSummary.Builder.class);
  }

  public static final int POINT_COUNT_FIELD_NUMBER = 1;
  private int pointCount_;
  /**
   * <pre>
   * The number of points received.
   * </pre>
   *
   * <code>int32 point_count = 1;</code>
   * @return The pointCount.
   */
  public int getPointCount() {
    return pointCount_;
  }

  public static final int FEATURE_COUNT_FIELD_NUMBER = 2;
  private int featureCount_;
  /**
   * <pre>
   * The number of known features passed while traversing the route.
   * </pre>
   *
   * <code>int32 feature_count = 2;</code>
   * @return The featureCount.
   */
  public int getFeatureCount() {
    return featureCount_;
  }

  public static final int DISTANCE_FIELD_NUMBER = 3;
  private int distance_;
  /**
   * <pre>
   * The distance covered in metres.
   * </pre>
   *
   * <code>int32 distance = 3;</code>
   * @return The distance.
   */
  public int getDistance() {
    return distance_;
  }

  public static final int ELAPSED_TIME_FIELD_NUMBER = 4;
  private com.google.protobuf.Duration elapsedTime_;
  /**
   * <pre>
   * The duration of the traversal.
   * </pre>
   *
   * <code>.google.protobuf.Duration elapsed_time = 4;</code>
   * @return Whether the elapsedTime field is set.
   */
  public boolean hasElapsedTime() {
    return elapsedTime_ != null;
  }
  /**
   * <pre>
   * The duration of the traversal.
   * </pre>
   *
   * <code>.google.protobuf.Duration elapsed_time = 4;</code>
   * @return The elapsedTime.
   */
  public com.google.protobuf.Duration getElapsedTime() {
    return elapsedTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : elapsedTime_;
  }
  /**
   * <pre>
   * The duration of the traversal.
   * </pre>
   *
   * <code>.google.protobuf.Duration elapsed_time = 4;</code>
   */
  public com.google.protobuf.DurationOrBuilder getElapsedTimeOrBuilder() {
    return getElapsedTime();
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
    if (pointCount_ != 0) {
      output.writeInt32(1, pointCount_);
    }
    if (featureCount_ != 0) {
      output.writeInt32(2, featureCount_);
    }
    if (distance_ != 0) {
      output.writeInt32(3, distance_);
    }
    if (elapsedTime_ != null) {
      output.writeMessage(4, getElapsedTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pointCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pointCount_);
    }
    if (featureCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, featureCount_);
    }
    if (distance_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, distance_);
    }
    if (elapsedTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getElapsedTime());
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
    if (!(obj instanceof io.grpc.examples.routeguide.RouteSummary)) {
      return super.equals(obj);
    }
    io.grpc.examples.routeguide.RouteSummary other = (io.grpc.examples.routeguide.RouteSummary) obj;

    if (getPointCount()
        != other.getPointCount()) return false;
    if (getFeatureCount()
        != other.getFeatureCount()) return false;
    if (getDistance()
        != other.getDistance()) return false;
    if (hasElapsedTime() != other.hasElapsedTime()) return false;
    if (hasElapsedTime()) {
      if (!getElapsedTime()
          .equals(other.getElapsedTime())) return false;
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
    hash = (37 * hash) + POINT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPointCount();
    hash = (37 * hash) + FEATURE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getFeatureCount();
    hash = (37 * hash) + DISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getDistance();
    if (hasElapsedTime()) {
      hash = (37 * hash) + ELAPSED_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getElapsedTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.examples.routeguide.RouteSummary parseFrom(
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
  public static Builder newBuilder(io.grpc.examples.routeguide.RouteSummary prototype) {
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
   * A RouteSummary is received in response to a RecordRoute rpc.
   * It contains the number of individual points received, the number of
   * detected features, and the total distance covered as the cumulative sum of
   * the distance between each point.
   * </pre>
   *
   * Protobuf type {@code io.grpc.examples.routeguide.RouteSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.grpc.examples.routeguide.RouteSummary)
      io.grpc.examples.routeguide.RouteSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_RouteSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_RouteSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.examples.routeguide.RouteSummary.class, io.grpc.examples.routeguide.RouteSummary.Builder.class);
    }

    // Construct using io.grpc.examples.routeguide.RouteSummary.newBuilder()
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
      pointCount_ = 0;

      featureCount_ = 0;

      distance_ = 0;

      if (elapsedTimeBuilder_ == null) {
        elapsedTime_ = null;
      } else {
        elapsedTime_ = null;
        elapsedTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.examples.routeguide.RouteGuideOuterClass.internal_static_io_grpc_examples_routeguide_RouteSummary_descriptor;
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.RouteSummary getDefaultInstanceForType() {
      return io.grpc.examples.routeguide.RouteSummary.getDefaultInstance();
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.RouteSummary build() {
      io.grpc.examples.routeguide.RouteSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grpc.examples.routeguide.RouteSummary buildPartial() {
      io.grpc.examples.routeguide.RouteSummary result = new io.grpc.examples.routeguide.RouteSummary(this);
      result.pointCount_ = pointCount_;
      result.featureCount_ = featureCount_;
      result.distance_ = distance_;
      if (elapsedTimeBuilder_ == null) {
        result.elapsedTime_ = elapsedTime_;
      } else {
        result.elapsedTime_ = elapsedTimeBuilder_.build();
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
      if (other instanceof io.grpc.examples.routeguide.RouteSummary) {
        return mergeFrom((io.grpc.examples.routeguide.RouteSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.examples.routeguide.RouteSummary other) {
      if (other == io.grpc.examples.routeguide.RouteSummary.getDefaultInstance()) return this;
      if (other.getPointCount() != 0) {
        setPointCount(other.getPointCount());
      }
      if (other.getFeatureCount() != 0) {
        setFeatureCount(other.getFeatureCount());
      }
      if (other.getDistance() != 0) {
        setDistance(other.getDistance());
      }
      if (other.hasElapsedTime()) {
        mergeElapsedTime(other.getElapsedTime());
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
      io.grpc.examples.routeguide.RouteSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.examples.routeguide.RouteSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pointCount_ ;
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     * @return The pointCount.
     */
    public int getPointCount() {
      return pointCount_;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     * @param value The pointCount to set.
     * @return This builder for chaining.
     */
    public Builder setPointCount(int value) {
      
      pointCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of points received.
     * </pre>
     *
     * <code>int32 point_count = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPointCount() {
      
      pointCount_ = 0;
      onChanged();
      return this;
    }

    private int featureCount_ ;
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     * @return The featureCount.
     */
    public int getFeatureCount() {
      return featureCount_;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     * @param value The featureCount to set.
     * @return This builder for chaining.
     */
    public Builder setFeatureCount(int value) {
      
      featureCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of known features passed while traversing the route.
     * </pre>
     *
     * <code>int32 feature_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFeatureCount() {
      
      featureCount_ = 0;
      onChanged();
      return this;
    }

    private int distance_ ;
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     * @return The distance.
     */
    public int getDistance() {
      return distance_;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     * @param value The distance to set.
     * @return This builder for chaining.
     */
    public Builder setDistance(int value) {
      
      distance_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The distance covered in metres.
     * </pre>
     *
     * <code>int32 distance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDistance() {
      
      distance_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Duration elapsedTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> elapsedTimeBuilder_;
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     * @return Whether the elapsedTime field is set.
     */
    public boolean hasElapsedTime() {
      return elapsedTimeBuilder_ != null || elapsedTime_ != null;
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     * @return The elapsedTime.
     */
    public com.google.protobuf.Duration getElapsedTime() {
      if (elapsedTimeBuilder_ == null) {
        return elapsedTime_ == null ? com.google.protobuf.Duration.getDefaultInstance() : elapsedTime_;
      } else {
        return elapsedTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public Builder setElapsedTime(com.google.protobuf.Duration value) {
      if (elapsedTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        elapsedTime_ = value;
        onChanged();
      } else {
        elapsedTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public Builder setElapsedTime(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (elapsedTimeBuilder_ == null) {
        elapsedTime_ = builderForValue.build();
        onChanged();
      } else {
        elapsedTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public Builder mergeElapsedTime(com.google.protobuf.Duration value) {
      if (elapsedTimeBuilder_ == null) {
        if (elapsedTime_ != null) {
          elapsedTime_ =
            com.google.protobuf.Duration.newBuilder(elapsedTime_).mergeFrom(value).buildPartial();
        } else {
          elapsedTime_ = value;
        }
        onChanged();
      } else {
        elapsedTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public Builder clearElapsedTime() {
      if (elapsedTimeBuilder_ == null) {
        elapsedTime_ = null;
        onChanged();
      } else {
        elapsedTime_ = null;
        elapsedTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public com.google.protobuf.Duration.Builder getElapsedTimeBuilder() {
      
      onChanged();
      return getElapsedTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    public com.google.protobuf.DurationOrBuilder getElapsedTimeOrBuilder() {
      if (elapsedTimeBuilder_ != null) {
        return elapsedTimeBuilder_.getMessageOrBuilder();
      } else {
        return elapsedTime_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : elapsedTime_;
      }
    }
    /**
     * <pre>
     * The duration of the traversal.
     * </pre>
     *
     * <code>.google.protobuf.Duration elapsed_time = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getElapsedTimeFieldBuilder() {
      if (elapsedTimeBuilder_ == null) {
        elapsedTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getElapsedTime(),
                getParentForChildren(),
                isClean());
        elapsedTime_ = null;
      }
      return elapsedTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:io.grpc.examples.routeguide.RouteSummary)
  }

  // @@protoc_insertion_point(class_scope:io.grpc.examples.routeguide.RouteSummary)
  private static final io.grpc.examples.routeguide.RouteSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.examples.routeguide.RouteSummary();
  }

  public static io.grpc.examples.routeguide.RouteSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteSummary>
      PARSER = new com.google.protobuf.AbstractParser<RouteSummary>() {
    @java.lang.Override
    public RouteSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grpc.examples.routeguide.RouteSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


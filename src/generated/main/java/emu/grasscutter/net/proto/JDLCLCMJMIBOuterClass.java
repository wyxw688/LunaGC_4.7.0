// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: JDLCLCMJMIB.proto

package emu.grasscutter.net.proto;

public final class JDLCLCMJMIBOuterClass {
  private JDLCLCMJMIBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface JDLCLCMJMIBOrBuilder extends
      // @@protoc_insertion_point(interface_extends:JDLCLCMJMIB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 IFDFPFOOEAB = 11;</code>
     * @return The iFDFPFOOEAB.
     */
    int getIFDFPFOOEAB();
  }
  /**
   * <pre>
   * CmdId: 23584
   * </pre>
   *
   * Protobuf type {@code JDLCLCMJMIB}
   */
  public static final class JDLCLCMJMIB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:JDLCLCMJMIB)
      JDLCLCMJMIBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use JDLCLCMJMIB.newBuilder() to construct.
    private JDLCLCMJMIB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private JDLCLCMJMIB() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new JDLCLCMJMIB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private JDLCLCMJMIB(
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
            case 88: {

              iFDFPFOOEAB_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.internal_static_JDLCLCMJMIB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.internal_static_JDLCLCMJMIB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.class, emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.Builder.class);
    }

    public static final int IFDFPFOOEAB_FIELD_NUMBER = 11;
    private int iFDFPFOOEAB_;
    /**
     * <code>uint32 IFDFPFOOEAB = 11;</code>
     * @return The iFDFPFOOEAB.
     */
    @java.lang.Override
    public int getIFDFPFOOEAB() {
      return iFDFPFOOEAB_;
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
      if (iFDFPFOOEAB_ != 0) {
        output.writeUInt32(11, iFDFPFOOEAB_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (iFDFPFOOEAB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, iFDFPFOOEAB_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB other = (emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB) obj;

      if (getIFDFPFOOEAB()
          != other.getIFDFPFOOEAB()) return false;
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
      hash = (37 * hash) + IFDFPFOOEAB_FIELD_NUMBER;
      hash = (53 * hash) + getIFDFPFOOEAB();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB prototype) {
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
     * CmdId: 23584
     * </pre>
     *
     * Protobuf type {@code JDLCLCMJMIB}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:JDLCLCMJMIB)
        emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.internal_static_JDLCLCMJMIB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.internal_static_JDLCLCMJMIB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.class, emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.newBuilder()
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
        iFDFPFOOEAB_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.internal_static_JDLCLCMJMIB_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB build() {
        emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB buildPartial() {
        emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB result = new emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB(this);
        result.iFDFPFOOEAB_ = iFDFPFOOEAB_;
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
        if (other instanceof emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB) {
          return mergeFrom((emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB other) {
        if (other == emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB.getDefaultInstance()) return this;
        if (other.getIFDFPFOOEAB() != 0) {
          setIFDFPFOOEAB(other.getIFDFPFOOEAB());
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
        emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int iFDFPFOOEAB_ ;
      /**
       * <code>uint32 IFDFPFOOEAB = 11;</code>
       * @return The iFDFPFOOEAB.
       */
      @java.lang.Override
      public int getIFDFPFOOEAB() {
        return iFDFPFOOEAB_;
      }
      /**
       * <code>uint32 IFDFPFOOEAB = 11;</code>
       * @param value The iFDFPFOOEAB to set.
       * @return This builder for chaining.
       */
      public Builder setIFDFPFOOEAB(int value) {
        
        iFDFPFOOEAB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 IFDFPFOOEAB = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIFDFPFOOEAB() {
        
        iFDFPFOOEAB_ = 0;
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


      // @@protoc_insertion_point(builder_scope:JDLCLCMJMIB)
    }

    // @@protoc_insertion_point(class_scope:JDLCLCMJMIB)
    private static final emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB();
    }

    public static emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JDLCLCMJMIB>
        PARSER = new com.google.protobuf.AbstractParser<JDLCLCMJMIB>() {
      @java.lang.Override
      public JDLCLCMJMIB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new JDLCLCMJMIB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<JDLCLCMJMIB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JDLCLCMJMIB> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.JDLCLCMJMIBOuterClass.JDLCLCMJMIB getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_JDLCLCMJMIB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_JDLCLCMJMIB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021JDLCLCMJMIB.proto\"\"\n\013JDLCLCMJMIB\022\023\n\013IF" +
      "DFPFOOEAB\030\013 \001(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_JDLCLCMJMIB_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_JDLCLCMJMIB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_JDLCLCMJMIB_descriptor,
        new java.lang.String[] { "IFDFPFOOEAB", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
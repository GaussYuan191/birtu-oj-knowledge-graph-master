// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseEntity.proto

package cn.yaminets.grpclib;

public final class BaseProto {
  private BaseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_ResponseEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_ResponseEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020BaseEntity.proto\022\nhelloworld\"\235\001\n\016Respo" +
      "nseEntity\022\017\n\007errCode\030\001 \001(\005\022\022\n\nerrMessage" +
      "\030\002 \001(\t\022\014\n\004data\030\003 \001(\014\0221\n\004type\030\004 \001(\0162#.hel" +
      "loworld.ResponseEntity.DataType\"%\n\010DataT" +
      "ype\022\010\n\004TEXT\020\000\022\017\n\013PROBLEMLIST\020\001B)\n\023cn.yam" +
      "inets.grpclibB\tBaseProtoP\001\242\002\004yamib\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_helloworld_ResponseEntity_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_ResponseEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_ResponseEntity_descriptor,
        new java.lang.String[] { "ErrCode", "ErrMessage", "Data", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

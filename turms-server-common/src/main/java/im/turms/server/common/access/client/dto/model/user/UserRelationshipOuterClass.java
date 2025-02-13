/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.server.common.access.client.dto.model.user;

public final class UserRelationshipOuterClass {
    private UserRelationshipOuterClass() {
    }

    static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
                com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
                /* major= */ 4,
                /* minor= */ 26,
                /* patch= */ 1,
                /* suffix= */ "",
                UserRelationshipOuterClass.class.getName());
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    static final com.google.protobuf.Descriptors.Descriptor internal_static_im_turms_proto_UserRelationship_descriptor;
    static final com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_im_turms_proto_UserRelationship_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static final com.google.protobuf.Descriptors.FileDescriptor descriptor;
    static {
        java.lang.String[] descriptorData = {"\n\"model/user/user_relationship.proto\022\016im"
                + ".turms.proto\"\216\002\n\020UserRelationship\022\025\n\010own"
                + "er_id\030\001 \001(\003H\000\210\001\001\022\034\n\017related_user_id\030\002 \001("
                + "\003H\001\210\001\001\022\027\n\nblock_date\030\003 \001(\003H\002\210\001\001\022\030\n\013group"
                + "_index\030\004 \001(\003H\003\210\001\001\022\037\n\022establishment_date\030"
                + "\005 \001(\003H\004\210\001\001\022\021\n\004name\030\006 \001(\tH\005\210\001\001B\013\n\t_owner_"
                + "idB\022\n\020_related_user_idB\r\n\013_block_dateB\016\n"
                + "\014_group_indexB\025\n\023_establishment_dateB\007\n\005"
                + "_nameB:\n3im.turms.server.common.access.c"
                + "lient.dto.model.userP\001\272\002\000b\006proto3"};
        descriptor = com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[]{});
        internal_static_im_turms_proto_UserRelationship_descriptor =
                getDescriptor().getMessageTypes()
                        .get(0);
        internal_static_im_turms_proto_UserRelationship_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                        internal_static_im_turms_proto_UserRelationship_descriptor,
                        new java.lang.String[]{"OwnerId",
                                "RelatedUserId",
                                "BlockDate",
                                "GroupIndex",
                                "EstablishmentDate",
                                "Name",});
        descriptor.resolveAllFeaturesImmutable();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
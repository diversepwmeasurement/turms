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

package im.turms.server.common.access.client.dto.request.user.relationship;

/**
 * Protobuf type {@code im.turms.proto.QueryRelationshipsRequest}
 */
public final class QueryRelationshipsRequest extends com.google.protobuf.GeneratedMessage implements
        // @@protoc_insertion_point(message_implements:im.turms.proto.QueryRelationshipsRequest)
        QueryRelationshipsRequestOrBuilder {
    private static final long serialVersionUID = 0L;
    static {
        com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
                com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
                /* major= */ 4,
                /* minor= */ 26,
                /* patch= */ 1,
                /* suffix= */ "",
                QueryRelationshipsRequest.class.getName());
    }

    // Use QueryRelationshipsRequest.newBuilder() to construct.
    private QueryRelationshipsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
        super(builder);
    }

    private QueryRelationshipsRequest() {
        userIds_ = emptyLongList();
        groupIndexes_ = emptyIntList();
        name_ = "";
    }

    public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOuterClass.internal_static_im_turms_proto_QueryRelationshipsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOuterClass.internal_static_im_turms_proto_QueryRelationshipsRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest.class,
                        im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest.Builder.class);
    }

    private int bitField0_;
    public static final int USER_IDS_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList userIds_ = emptyLongList();

    /**
     * <code>repeated int64 user_ids = 1;</code>
     *
     * @return A list containing the userIds.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long> getUserIdsList() {
        return userIds_;
    }

    /**
     * <code>repeated int64 user_ids = 1;</code>
     *
     * @return The count of userIds.
     */
    public int getUserIdsCount() {
        return userIds_.size();
    }

    /**
     * <code>repeated int64 user_ids = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The userIds at the given index.
     */
    public long getUserIds(int index) {
        return userIds_.getLong(index);
    }

    private int userIdsMemoizedSerializedSize = -1;

    public static final int BLOCKED_FIELD_NUMBER = 2;
    private boolean blocked_ = false;

    /**
     * <code>optional bool blocked = 2;</code>
     *
     * @return Whether the blocked field is set.
     */
    @java.lang.Override
    public boolean hasBlocked() {
        return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     * <code>optional bool blocked = 2;</code>
     *
     * @return The blocked.
     */
    @java.lang.Override
    public boolean getBlocked() {
        return blocked_;
    }

    public static final int GROUP_INDEXES_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList groupIndexes_ = emptyIntList();

    /**
     * <code>repeated int32 group_indexes = 3;</code>
     *
     * @return A list containing the groupIndexes.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer> getGroupIndexesList() {
        return groupIndexes_;
    }

    /**
     * <code>repeated int32 group_indexes = 3;</code>
     *
     * @return The count of groupIndexes.
     */
    public int getGroupIndexesCount() {
        return groupIndexes_.size();
    }

    /**
     * <code>repeated int32 group_indexes = 3;</code>
     *
     * @param index The index of the element to return.
     * @return The groupIndexes at the given index.
     */
    public int getGroupIndexes(int index) {
        return groupIndexes_.getInt(index);
    }

    private int groupIndexesMemoizedSerializedSize = -1;

    public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 4;
    private long lastUpdatedDate_ = 0L;

    /**
     * <code>optional int64 last_updated_date = 4;</code>
     *
     * @return Whether the lastUpdatedDate field is set.
     */
    @java.lang.Override
    public boolean hasLastUpdatedDate() {
        return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional int64 last_updated_date = 4;</code>
     *
     * @return The lastUpdatedDate.
     */
    @java.lang.Override
    public long getLastUpdatedDate() {
        return lastUpdatedDate_;
    }

    public static final int NAME_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private volatile java.lang.Object name_ = "";

    /**
     * <code>optional string name = 5;</code>
     *
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
        return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            name_ = s;
            return s;
        }
    }

    /**
     * <code>optional string name = 5;</code>
     *
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            name_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        getSerializedSize();
        if (getUserIdsList().size() > 0) {
            output.writeUInt32NoTag(10);
            output.writeUInt32NoTag(userIdsMemoizedSerializedSize);
        }
        for (int i = 0; i < userIds_.size(); i++) {
            output.writeInt64NoTag(userIds_.getLong(i));
        }
        if (((bitField0_ & 0x00000001) != 0)) {
            output.writeBool(2, blocked_);
        }
        if (getGroupIndexesList().size() > 0) {
            output.writeUInt32NoTag(26);
            output.writeUInt32NoTag(groupIndexesMemoizedSerializedSize);
        }
        for (int i = 0; i < groupIndexes_.size(); i++) {
            output.writeInt32NoTag(groupIndexes_.getInt(i));
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            output.writeInt64(4, lastUpdatedDate_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
            com.google.protobuf.GeneratedMessage.writeString(output, 5, name_);
        }
        getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) {
            return size;
        }

        size = 0;
        {
            int dataSize = 0;
            for (int i = 0; i < userIds_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt64SizeNoTag(userIds_.getLong(i));
            }
            size += dataSize;
            if (!getUserIdsList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            userIdsMemoizedSerializedSize = dataSize;
        }
        if (((bitField0_ & 0x00000001) != 0)) {
            size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, blocked_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < groupIndexes_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(groupIndexes_.getInt(i));
            }
            size += dataSize;
            if (!getGroupIndexesList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            groupIndexesMemoizedSerializedSize = dataSize;
        }
        if (((bitField0_ & 0x00000002) != 0)) {
            size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, lastUpdatedDate_);
        }
        if (((bitField0_ & 0x00000004) != 0)) {
            size += com.google.protobuf.GeneratedMessage.computeStringSize(5, name_);
        }
        size += getUnknownFields().getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueryRelationshipsRequest other)) {
            return super.equals(obj);
        }

        if (!getUserIdsList().equals(other.getUserIdsList())) {
            return false;
        }
        if (hasBlocked() != other.hasBlocked()) {
            return false;
        }
        if (hasBlocked()) {
            if (getBlocked() != other.getBlocked()) {
                return false;
            }
        }
        if (!getGroupIndexesList().equals(other.getGroupIndexesList())) {
            return false;
        }
        if (hasLastUpdatedDate() != other.hasLastUpdatedDate()) {
            return false;
        }
        if (hasLastUpdatedDate()) {
            if (getLastUpdatedDate() != other.getLastUpdatedDate()) {
                return false;
            }
        }
        if (hasName() != other.hasName()) {
            return false;
        }
        if (hasName()) {
            if (!getName().equals(other.getName())) {
                return false;
            }
        }
        return getUnknownFields().equals(other.getUnknownFields());
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (getUserIdsCount() > 0) {
            hash = (37 * hash) + USER_IDS_FIELD_NUMBER;
            hash = (53 * hash) + getUserIdsList().hashCode();
        }
        if (hasBlocked()) {
            hash = (37 * hash) + BLOCKED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getBlocked());
        }
        if (getGroupIndexesCount() > 0) {
            hash = (37 * hash) + GROUP_INDEXES_FIELD_NUMBER;
            hash = (53 * hash) + getGroupIndexesList().hashCode();
        }
        if (hasLastUpdatedDate()) {
            hash = (37 * hash) + LAST_UPDATED_DATE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getLastUpdatedDate());
        }
        if (hasName()) {
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
        }
        hash = (29 * hash) + getUnknownFields().hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage.parseDelimitedWithIOException(PARSER, input);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage.parseWithIOException(PARSER, input);
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessage
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder()
                .mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder()
                : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        return new Builder(parent);
    }

    /**
     * Protobuf type {@code im.turms.proto.QueryRelationshipsRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessage.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:im.turms.proto.QueryRelationshipsRequest)
            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOrBuilder {
        public static com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOuterClass.internal_static_im_turms_proto_QueryRelationshipsRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
            return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOuterClass.internal_static_im_turms_proto_QueryRelationshipsRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest.class,
                            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest.Builder.class);
        }

        // Construct using
        // im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest.newBuilder()
        private Builder() {

        }

        private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            super(parent);

        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            bitField0_ = 0;
            userIds_ = emptyLongList();
            blocked_ = false;
            groupIndexes_ = emptyIntList();
            lastUpdatedDate_ = 0L;
            name_ = "";
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequestOuterClass.internal_static_im_turms_proto_QueryRelationshipsRequest_descriptor;
        }

        @java.lang.Override
        public im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest getDefaultInstanceForType() {
            return im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest
                    .getDefaultInstance();
        }

        @java.lang.Override
        public im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest build() {
            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest result =
                    buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest buildPartial() {
            im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest result =
                    new im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest(
                            this);
            if (bitField0_ != 0) {
                buildPartial0(result);
            }
            onBuilt();
            return result;
        }

        private void buildPartial0(
                im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest result) {
            int from_bitField0_ = bitField0_;
            if (((from_bitField0_ & 0x00000001) != 0)) {
                userIds_.makeImmutable();
                result.userIds_ = userIds_;
            }
            int to_bitField0_ = 0;
            if (((from_bitField0_ & 0x00000002) != 0)) {
                result.blocked_ = blocked_;
                to_bitField0_ |= 0x00000001;
            }
            if (((from_bitField0_ & 0x00000004) != 0)) {
                groupIndexes_.makeImmutable();
                result.groupIndexes_ = groupIndexes_;
            }
            if (((from_bitField0_ & 0x00000008) != 0)) {
                result.lastUpdatedDate_ = lastUpdatedDate_;
                to_bitField0_ |= 0x00000002;
            }
            if (((from_bitField0_ & 0x00000010) != 0)) {
                result.name_ = name_;
                to_bitField0_ |= 0x00000004;
            }
            result.bitField0_ |= to_bitField0_;
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest) {
                return mergeFrom(
                        (im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(
                im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest other) {
            if (other == im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest
                    .getDefaultInstance()) {
                return this;
            }
            if (!other.userIds_.isEmpty()) {
                if (userIds_.isEmpty()) {
                    userIds_ = other.userIds_;
                    userIds_.makeImmutable();
                    bitField0_ |= 0x00000001;
                } else {
                    ensureUserIdsIsMutable();
                    userIds_.addAll(other.userIds_);
                }
                onChanged();
            }
            if (other.hasBlocked()) {
                setBlocked(other.getBlocked());
            }
            if (!other.groupIndexes_.isEmpty()) {
                if (groupIndexes_.isEmpty()) {
                    groupIndexes_ = other.groupIndexes_;
                    groupIndexes_.makeImmutable();
                    bitField0_ |= 0x00000004;
                } else {
                    ensureGroupIndexesIsMutable();
                    groupIndexes_.addAll(other.groupIndexes_);
                }
                onChanged();
            }
            if (other.hasLastUpdatedDate()) {
                setLastUpdatedDate(other.getLastUpdatedDate());
            }
            if (other.hasName()) {
                name_ = other.name_;
                bitField0_ |= 0x00000010;
                onChanged();
            }
            this.mergeUnknownFields(other.getUnknownFields());
            onChanged();
            return this;
        }

        @java.lang.Override
        public boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0 -> done = true;
                        case 8 -> {
                            long v = input.readInt64();
                            ensureUserIdsIsMutable();
                            userIds_.addLong(v);
                        } // case 8
                        case 10 -> {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            ensureUserIdsIsMutable();
                            while (input.getBytesUntilLimit() > 0) {
                                userIds_.addLong(input.readInt64());
                            }
                            input.popLimit(limit);
                        } // case 10
                        case 16 -> {
                            blocked_ = input.readBool();
                            bitField0_ |= 0x00000002;
                        } // case 16
                        case 24 -> {
                            int v = input.readInt32();
                            ensureGroupIndexesIsMutable();
                            groupIndexes_.addInt(v);
                        } // case 24
                        case 26 -> {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            ensureGroupIndexesIsMutable();
                            while (input.getBytesUntilLimit() > 0) {
                                groupIndexes_.addInt(input.readInt32());
                            }
                            input.popLimit(limit);
                        } // case 26
                        case 32 -> {
                            lastUpdatedDate_ = input.readInt64();
                            bitField0_ |= 0x00000008;
                        } // case 32
                        case 42 -> {
                            name_ = input.readStringRequireUtf8();
                            bitField0_ |= 0x00000010;
                        } // case 42
                        default -> {
                            if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                done = true; // was an endgroup tag
                            }
                        } // default:
                    } // switch (tag)
                } // while (!done)
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.unwrapIOException();
            } finally {
                onChanged();
            } // finally
            return this;
        }

        private int bitField0_;

        private com.google.protobuf.Internal.LongList userIds_ = emptyLongList();

        private void ensureUserIdsIsMutable() {
            if (!userIds_.isModifiable()) {
                userIds_ = makeMutableCopy(userIds_);
            }
            bitField0_ |= 0x00000001;
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @return A list containing the userIds.
         */
        public java.util.List<java.lang.Long> getUserIdsList() {
            userIds_.makeImmutable();
            return userIds_;
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @return The count of userIds.
         */
        public int getUserIdsCount() {
            return userIds_.size();
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The userIds at the given index.
         */
        public long getUserIds(int index) {
            return userIds_.getLong(index);
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @param index The index to set the value at.
         * @param value The userIds to set.
         * @return This builder for chaining.
         */
        public Builder setUserIds(int index, long value) {

            ensureUserIdsIsMutable();
            userIds_.setLong(index, value);
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @param value The userIds to add.
         * @return This builder for chaining.
         */
        public Builder addUserIds(long value) {

            ensureUserIdsIsMutable();
            userIds_.addLong(value);
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @param values The userIds to add.
         * @return This builder for chaining.
         */
        public Builder addAllUserIds(java.lang.Iterable<? extends java.lang.Long> values) {
            ensureUserIdsIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, userIds_);
            bitField0_ |= 0x00000001;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int64 user_ids = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearUserIds() {
            userIds_ = emptyLongList();
            bitField0_ &= ~0x00000001;
            onChanged();
            return this;
        }

        private boolean blocked_;

        /**
         * <code>optional bool blocked = 2;</code>
         *
         * @return Whether the blocked field is set.
         */
        @java.lang.Override
        public boolean hasBlocked() {
            return ((bitField0_ & 0x00000002) != 0);
        }

        /**
         * <code>optional bool blocked = 2;</code>
         *
         * @return The blocked.
         */
        @java.lang.Override
        public boolean getBlocked() {
            return blocked_;
        }

        /**
         * <code>optional bool blocked = 2;</code>
         *
         * @param value The blocked to set.
         * @return This builder for chaining.
         */
        public Builder setBlocked(boolean value) {

            blocked_ = value;
            bitField0_ |= 0x00000002;
            onChanged();
            return this;
        }

        /**
         * <code>optional bool blocked = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearBlocked() {
            bitField0_ &= ~0x00000002;
            blocked_ = false;
            onChanged();
            return this;
        }

        private com.google.protobuf.Internal.IntList groupIndexes_ = emptyIntList();

        private void ensureGroupIndexesIsMutable() {
            if (!groupIndexes_.isModifiable()) {
                groupIndexes_ = makeMutableCopy(groupIndexes_);
            }
            bitField0_ |= 0x00000004;
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @return A list containing the groupIndexes.
         */
        public java.util.List<java.lang.Integer> getGroupIndexesList() {
            groupIndexes_.makeImmutable();
            return groupIndexes_;
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @return The count of groupIndexes.
         */
        public int getGroupIndexesCount() {
            return groupIndexes_.size();
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @param index The index of the element to return.
         * @return The groupIndexes at the given index.
         */
        public int getGroupIndexes(int index) {
            return groupIndexes_.getInt(index);
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @param index The index to set the value at.
         * @param value The groupIndexes to set.
         * @return This builder for chaining.
         */
        public Builder setGroupIndexes(int index, int value) {

            ensureGroupIndexesIsMutable();
            groupIndexes_.setInt(index, value);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @param value The groupIndexes to add.
         * @return This builder for chaining.
         */
        public Builder addGroupIndexes(int value) {

            ensureGroupIndexesIsMutable();
            groupIndexes_.addInt(value);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @param values The groupIndexes to add.
         * @return This builder for chaining.
         */
        public Builder addAllGroupIndexes(java.lang.Iterable<? extends java.lang.Integer> values) {
            ensureGroupIndexesIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(values, groupIndexes_);
            bitField0_ |= 0x00000004;
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 group_indexes = 3;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearGroupIndexes() {
            groupIndexes_ = emptyIntList();
            bitField0_ &= ~0x00000004;
            onChanged();
            return this;
        }

        private long lastUpdatedDate_;

        /**
         * <code>optional int64 last_updated_date = 4;</code>
         *
         * @return Whether the lastUpdatedDate field is set.
         */
        @java.lang.Override
        public boolean hasLastUpdatedDate() {
            return ((bitField0_ & 0x00000008) != 0);
        }

        /**
         * <code>optional int64 last_updated_date = 4;</code>
         *
         * @return The lastUpdatedDate.
         */
        @java.lang.Override
        public long getLastUpdatedDate() {
            return lastUpdatedDate_;
        }

        /**
         * <code>optional int64 last_updated_date = 4;</code>
         *
         * @param value The lastUpdatedDate to set.
         * @return This builder for chaining.
         */
        public Builder setLastUpdatedDate(long value) {

            lastUpdatedDate_ = value;
            bitField0_ |= 0x00000008;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 last_updated_date = 4;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearLastUpdatedDate() {
            bitField0_ &= ~0x00000008;
            lastUpdatedDate_ = 0L;
            onChanged();
            return this;
        }

        private java.lang.Object name_ = "";

        /**
         * <code>optional string name = 5;</code>
         *
         * @return Whether the name field is set.
         */
        public boolean hasName() {
            return ((bitField0_ & 0x00000010) != 0);
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return The name.
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return The bytes for name.
         */
        public com.google.protobuf.ByteString getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @param value The name to set.
         * @return This builder for chaining.
         */
        public Builder setName(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            name_ = value;
            bitField0_ |= 0x00000010;
            onChanged();
            return this;
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearName() {
            name_ = getDefaultInstance().getName();
            bitField0_ &= ~0x00000010;
            onChanged();
            return this;
        }

        /**
         * <code>optional string name = 5;</code>
         *
         * @param value The bytes for name to set.
         * @return This builder for chaining.
         */
        public Builder setNameBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            name_ = value;
            bitField0_ |= 0x00000010;
            onChanged();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:im.turms.proto.QueryRelationshipsRequest)
    }

    // @@protoc_insertion_point(class_scope:im.turms.proto.QueryRelationshipsRequest)
    private static final im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest DEFAULT_INSTANCE;
    static {
        DEFAULT_INSTANCE =
                new im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest();
    }

    public static im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryRelationshipsRequest> PARSER =
            new com.google.protobuf.AbstractParser<>() {
                @java.lang.Override
                public QueryRelationshipsRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    Builder builder = newBuilder();
                    try {
                        builder.mergeFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(builder.buildPartial());
                    } catch (com.google.protobuf.UninitializedMessageException e) {
                        throw e.asInvalidProtocolBufferException()
                                .setUnfinishedMessage(builder.buildPartial());
                    } catch (java.io.IOException e) {
                        throw new com.google.protobuf.InvalidProtocolBufferException(e)
                                .setUnfinishedMessage(builder.buildPartial());
                    }
                    return builder.buildPartial();
                }
            };

    public static com.google.protobuf.Parser<QueryRelationshipsRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryRelationshipsRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public im.turms.server.common.access.client.dto.request.user.relationship.QueryRelationshipsRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model/user/users_infos_with_version.proto

package im.turms.client.model.proto.model.user;

/**
 * Protobuf type {@code im.turms.proto.UsersInfosWithVersion}
 */
public  final class UsersInfosWithVersion extends
    com.google.protobuf.GeneratedMessageLite<
        UsersInfosWithVersion, UsersInfosWithVersion.Builder> implements
    // @@protoc_insertion_point(message_implements:im.turms.proto.UsersInfosWithVersion)
    UsersInfosWithVersionOrBuilder {
  private UsersInfosWithVersion() {
    userInfos_ = emptyProtobufList();
  }
  private int bitField0_;
  public static final int USER_INFOS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<im.turms.client.model.proto.model.user.UserInfo> userInfos_;
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  @java.lang.Override
  public java.util.List<im.turms.client.model.proto.model.user.UserInfo> getUserInfosList() {
    return userInfos_;
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public java.util.List<? extends im.turms.client.model.proto.model.user.UserInfoOrBuilder> 
      getUserInfosOrBuilderList() {
    return userInfos_;
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  @java.lang.Override
  public int getUserInfosCount() {
    return userInfos_.size();
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  @java.lang.Override
  public im.turms.client.model.proto.model.user.UserInfo getUserInfos(int index) {
    return userInfos_.get(index);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  public im.turms.client.model.proto.model.user.UserInfoOrBuilder getUserInfosOrBuilder(
      int index) {
    return userInfos_.get(index);
  }
  private void ensureUserInfosIsMutable() {
    com.google.protobuf.Internal.ProtobufList<im.turms.client.model.proto.model.user.UserInfo> tmp = userInfos_;
    if (!tmp.isModifiable()) {
      userInfos_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void setUserInfos(
      int index, im.turms.client.model.proto.model.user.UserInfo value) {
    value.getClass();
  ensureUserInfosIsMutable();
    userInfos_.set(index, value);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void addUserInfos(im.turms.client.model.proto.model.user.UserInfo value) {
    value.getClass();
  ensureUserInfosIsMutable();
    userInfos_.add(value);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void addUserInfos(
      int index, im.turms.client.model.proto.model.user.UserInfo value) {
    value.getClass();
  ensureUserInfosIsMutable();
    userInfos_.add(index, value);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void addAllUserInfos(
      java.lang.Iterable<? extends im.turms.client.model.proto.model.user.UserInfo> values) {
    ensureUserInfosIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, userInfos_);
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void clearUserInfos() {
    userInfos_ = emptyProtobufList();
  }
  /**
   * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
   */
  private void removeUserInfos(int index) {
    ensureUserInfosIsMutable();
    userInfos_.remove(index);
  }

  public static final int LAST_UPDATED_DATE_FIELD_NUMBER = 2;
  private long lastUpdatedDate_;
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return Whether the lastUpdatedDate field is set.
   */
  @java.lang.Override
  public boolean hasLastUpdatedDate() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @return The lastUpdatedDate.
   */
  @java.lang.Override
  public long getLastUpdatedDate() {
    return lastUpdatedDate_;
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   * @param value The lastUpdatedDate to set.
   */
  private void setLastUpdatedDate(long value) {
    bitField0_ |= 0x00000001;
    lastUpdatedDate_ = value;
  }
  /**
   * <code>optional int64 last_updated_date = 2;</code>
   */
  private void clearLastUpdatedDate() {
    bitField0_ = (bitField0_ & ~0x00000001);
    lastUpdatedDate_ = 0L;
  }

  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(im.turms.client.model.proto.model.user.UsersInfosWithVersion prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code im.turms.proto.UsersInfosWithVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        im.turms.client.model.proto.model.user.UsersInfosWithVersion, Builder> implements
      // @@protoc_insertion_point(builder_implements:im.turms.proto.UsersInfosWithVersion)
      im.turms.client.model.proto.model.user.UsersInfosWithVersionOrBuilder {
    // Construct using im.turms.client.model.proto.model.user.UsersInfosWithVersion.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    @java.lang.Override
    public java.util.List<im.turms.client.model.proto.model.user.UserInfo> getUserInfosList() {
      return java.util.Collections.unmodifiableList(
          instance.getUserInfosList());
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    @java.lang.Override
    public int getUserInfosCount() {
      return instance.getUserInfosCount();
    }/**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    @java.lang.Override
    public im.turms.client.model.proto.model.user.UserInfo getUserInfos(int index) {
      return instance.getUserInfos(index);
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder setUserInfos(
        int index, im.turms.client.model.proto.model.user.UserInfo value) {
      copyOnWrite();
      instance.setUserInfos(index, value);
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder setUserInfos(
        int index, im.turms.client.model.proto.model.user.UserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setUserInfos(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(im.turms.client.model.proto.model.user.UserInfo value) {
      copyOnWrite();
      instance.addUserInfos(value);
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        int index, im.turms.client.model.proto.model.user.UserInfo value) {
      copyOnWrite();
      instance.addUserInfos(index, value);
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        im.turms.client.model.proto.model.user.UserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addUserInfos(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addUserInfos(
        int index, im.turms.client.model.proto.model.user.UserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.addUserInfos(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder addAllUserInfos(
        java.lang.Iterable<? extends im.turms.client.model.proto.model.user.UserInfo> values) {
      copyOnWrite();
      instance.addAllUserInfos(values);
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder clearUserInfos() {
      copyOnWrite();
      instance.clearUserInfos();
      return this;
    }
    /**
     * <code>repeated .im.turms.proto.UserInfo user_infos = 1;</code>
     */
    public Builder removeUserInfos(int index) {
      copyOnWrite();
      instance.removeUserInfos(index);
      return this;
    }

    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return Whether the lastUpdatedDate field is set.
     */
    @java.lang.Override
    public boolean hasLastUpdatedDate() {
      return instance.hasLastUpdatedDate();
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return The lastUpdatedDate.
     */
    @java.lang.Override
    public long getLastUpdatedDate() {
      return instance.getLastUpdatedDate();
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @param value The lastUpdatedDate to set.
     * @return This builder for chaining.
     */
    public Builder setLastUpdatedDate(long value) {
      copyOnWrite();
      instance.setLastUpdatedDate(value);
      return this;
    }
    /**
     * <code>optional int64 last_updated_date = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastUpdatedDate() {
      copyOnWrite();
      instance.clearLastUpdatedDate();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:im.turms.proto.UsersInfosWithVersion)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new im.turms.client.model.proto.model.user.UsersInfosWithVersion();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bitField0_",
            "userInfos_",
            im.turms.client.model.proto.model.user.UserInfo.class,
            "lastUpdatedDate_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1002" +
              "\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<im.turms.client.model.proto.model.user.UsersInfosWithVersion> parser = PARSER;
        if (parser == null) {
          synchronized (im.turms.client.model.proto.model.user.UsersInfosWithVersion.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<im.turms.client.model.proto.model.user.UsersInfosWithVersion>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:im.turms.proto.UsersInfosWithVersion)
  private static final im.turms.client.model.proto.model.user.UsersInfosWithVersion DEFAULT_INSTANCE;
  static {
    UsersInfosWithVersion defaultInstance = new UsersInfosWithVersion();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UsersInfosWithVersion.class, defaultInstance);
  }

  public static im.turms.client.model.proto.model.user.UsersInfosWithVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UsersInfosWithVersion> PARSER;

  public static com.google.protobuf.Parser<UsersInfosWithVersion> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}


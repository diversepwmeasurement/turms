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

package im.turms.service.domain.user.po;

import im.turms.server.common.domain.common.po.BaseEntity;
import im.turms.server.common.storage.mongo.entity.IndexType;
import im.turms.server.common.storage.mongo.entity.ShardingStrategy;
import im.turms.server.common.storage.mongo.entity.annotation.Document;
import im.turms.server.common.storage.mongo.entity.annotation.Field;
import im.turms.server.common.storage.mongo.entity.annotation.Id;
import im.turms.server.common.storage.mongo.entity.annotation.Indexed;
import im.turms.server.common.storage.mongo.entity.annotation.PersistenceConstructor;
import im.turms.server.common.storage.mongo.entity.annotation.Sharded;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author James Chen
 */
@Data
@AllArgsConstructor(onConstructor = @__(@PersistenceConstructor))
@Document(UserRelationshipGroup.COLLECTION_NAME)
@Sharded(shardKey = UserRelationshipGroup.Fields.ID_OWNER_ID, shardingStrategy = ShardingStrategy.HASH)
public final class UserRelationshipGroup extends BaseEntity {

    public static final String COLLECTION_NAME = "userRelationshipGroup";

    @Id
    private final Key key;

    /**
     * Do not use the unique name of a relationship group as an ID because
     * it will cost a lot when updating the group name
     */
    @Field(Fields.NAME)
    private final String name;

    @Field(Fields.CREATION_DATE)
    private final Date creationDate;

    public UserRelationshipGroup(
            @NotNull Long ownerId,
            @NotNull Integer index,
            @NotNull String name,
            @NotNull Date creationDate) {
        this.key = new Key(ownerId, index);
        this.name = name;
        this.creationDate = creationDate;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor // Make sure spring can initiate the key and use setters
    public static final class Key {

        @Field(Fields.OWNER_ID)
        @Indexed(IndexType.HASH)
        private Long ownerId;

        /**
         * Note that the index value doesn't start from 0 and it is generated by the snowflake algorithm
         */
        @Field(Fields.GROUP_INDEX)
        private Integer groupIndex;

        public static final class Fields {
            public static final String OWNER_ID = "oid";
            public static final String GROUP_INDEX = "gidx";

            private Fields() {
            }
        }
    }

    public static final class Fields {
        public static final String ID_OWNER_ID = "_id." + Key.Fields.OWNER_ID;
        public static final String ID_GROUP_INDEX = "_id." + Key.Fields.GROUP_INDEX;
        public static final String NAME = "n";
        public static final String CREATION_DATE = "cd";

        private Fields() {
        }
    }

}
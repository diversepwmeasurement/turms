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

package im.turms.server.common.infra.property.env.service.env.elasticsearch;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import im.turms.server.common.infra.property.metadata.Description;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class ElasticsearchLanguageDetectProperties {

    @Description("Whether to enable language detection. "
            + "If true, a pipeline for language detection will be created at startup, "
            + "and will be used as the default pipeline of new indexes")
    private boolean enabled;

    @Description("The confidence score threshold. "
            + "Only languages with a confidence score higher than this threshold will be used")
    @DecimalMin("0")
    @DecimalMax("1")
    private float confidenceScoreThreshold = 0.5F;

    @Description("The maximum number of detected languages to use when detecting languages")
    @Min(1)
    private int maxDetectedLanguages = 3;

}
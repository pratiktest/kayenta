/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.kayenta.canary.providers;

import com.netflix.kayenta.canary.CanaryMetricSetQueryConfig;
import lombok.*;

import javax.validation.constraints.NotNull;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
// TODO(duftler): Figure out how to move this into the kayenta-atlas module? Doing so as-is would introduce a circular dependency.
public class AtlasCanaryMetricSetQueryConfig implements CanaryMetricSetQueryConfig {

  @NotNull
  @Getter
  private String q;
}

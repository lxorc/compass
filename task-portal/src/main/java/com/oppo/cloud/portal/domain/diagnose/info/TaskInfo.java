/*
 * Copyright 2023 OPPO.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oppo.cloud.portal.domain.diagnose.info;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("information of task")
public class TaskInfo {

    @ApiModelProperty(value = "task name")
    private String taskName;

    @ApiModelProperty(value = "flow name")
    private String flowName;

    @ApiModelProperty(value = "project name")
    private String projectName;

    @ApiModelProperty(value = "execution time")
    private String executionTime;

    @ApiModelProperty(value = "running duration of application")
    private String appTime;

    @ApiModelProperty(value = "applicationId")
    private String applicationId;

    @ApiModelProperty(value = "categories of exception")
    private List<String> categories;

    @ApiModelProperty(value = "memory consuming")
    private String memorySeconds;

    @ApiModelProperty(value = "cpu consuming")
    private String vcoreSeconds;
}

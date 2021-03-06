/**
 *  Copyright (c) 2016 Intel Corporation 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.trustedanalytics.scoring.interfaces

import org.apache.commons.lang3.StringUtils

/**
 * For providing the model details
 * @param modelType type of model
 * @param modelClass class that wraps the model and exposes the score API on the given model
 * @param modelReader Reader class for the Model. Used to read the model from Model Archive Format
 * @param customMetaData Map for providing any other customized information about the model such as creation date etc.
 */
case class ModelMetaData(modelType: String, modelClass: String, modelReader: String, customMetaData: Map[String, String]) {
  require(StringUtils.isNotEmpty(modelType), "published model type should not be empty")
  require(StringUtils.isNotEmpty(modelClass), "published model classs should not be empty")
  require(StringUtils.isNotEmpty(modelReader), "published model reader should not be empty")
}


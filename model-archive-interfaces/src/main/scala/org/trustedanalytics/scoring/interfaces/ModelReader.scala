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

import java.io.File
import java.net.URLClassLoader
import java.util.zip.ZipInputStream

import scala.concurrent.Future
/**
 * Base interface for a Model Reader.
 */
trait ModelReader {

  /**
   * Called for loading a Model from a file
   *
   */
  def read(modelZipFileInput: File, classLoader: URLClassLoader, jsonMap: Map[String, String]): Model

  /**
   * Called for loading a Model from a ZipInputStream
   *
   */
  def read(modelZipStreamInput: ZipInputStream, classLoader: URLClassLoader, jsonMap: Map[String, String]): Model

}

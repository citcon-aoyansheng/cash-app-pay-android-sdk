/*
 * Copyright (C) 2023 Cash App
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
package app.cash.paykit.core.models.request

import app.cash.paykit.core.models.common.Action
import app.cash.paykit.core.models.pii.PiiString
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerRequestData(
  @Json(name = "actions")
  val actions: List<Action>,
  @Json(name = "channel")
  val channel: String?,
  @Json(name = "redirect_url")
  val redirectUri: PiiString?,
  @Json(name = "reference_id")
  val referenceId: PiiString?,
)

/**
 * Copyright (C) 2014 The SciGraph authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.sdsc.scigraph.services.refine;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.ForwardingMap;

public class RefineQueries extends ForwardingMap<String, RefineQuery> {

  Map<String, RefineQuery> delegate = new HashMap<>();

  @Override
  protected Map<String, RefineQuery> delegate() {
    return delegate;
  }

}
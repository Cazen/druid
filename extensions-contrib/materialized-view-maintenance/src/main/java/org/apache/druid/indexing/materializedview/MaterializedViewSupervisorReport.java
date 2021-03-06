/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.druid.indexing.materializedview;

import com.google.common.collect.Sets;
import org.apache.druid.indexing.overlord.supervisor.SupervisorReport;
import org.joda.time.DateTime;
import org.joda.time.Interval;

import java.util.List;
import java.util.Set;

public class MaterializedViewSupervisorReport extends SupervisorReport 
{
  
  public MaterializedViewSupervisorReport(
      String dataSource,
      DateTime generationTime,
      String baseDataSource,
      Set<String> dimensions,
      Set<String> metrics,
      List<Interval> missTimeline
  )
  {
    super(dataSource, generationTime, "{" +
        "dataSource='" + dataSource + '\'' +
        ", baseDataSource='" + baseDataSource + '\'' +
        ", dimensions=" + dimensions +
        ", metrics=" + metrics +
        ", missTimeline" + Sets.newHashSet(missTimeline) +
        "}");
  }
}

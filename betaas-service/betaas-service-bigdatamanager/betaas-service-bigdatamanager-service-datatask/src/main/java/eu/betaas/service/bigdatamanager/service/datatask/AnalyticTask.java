/*
 Copyright 2014-2015 Hewlett-Packard Development Company, L.P.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package eu.betaas.service.bigdatamanager.service.datatask;

import java.util.HashMap;

import eu.betaas.service.bigdatamanager.service.datatask.data.TaskData;
import eu.betaas.service.bigdatamanager.service.datatask.data.TaskInfo;

public interface AnalyticTask {

	public TaskInfo getTaskInfo();
	
	public void runTask(HashMap<String,String> input);
	
	public TaskData getTaskData(String taskId);
	
	public boolean taskCompleted(String taskId);

	public void setupTask();
	
	public void removeTask();
	
}

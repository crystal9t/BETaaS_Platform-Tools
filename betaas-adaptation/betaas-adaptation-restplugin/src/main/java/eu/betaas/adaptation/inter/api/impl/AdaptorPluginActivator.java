/**
* Copyright 2014-2015 Converge ICT
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
*
*/

package eu.betaas.adaptation.inter.api.impl;

import eu.betaas.adaptation.plugin.api.IAdaptorPlugin;

public class AdaptorPluginActivator {

	private IAdaptorPlugin adaptationPlugin;
	
	public void start() {
		adaptationPlugin = new AdaptorPluginImpl();
	}
	
	public void stop() {
		
	}
}

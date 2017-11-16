/*
 *  Licensed to GIScience Research Group, Heidelberg University (GIScience)
 *
 *   http://www.giscience.uni-hd.de
 *   http://www.heigit.org
 *
 *  under one or more contributor license agreements. See the NOTICE file 
 *  distributed with this work for additional information regarding copyright 
 *  ownership. The GIScience licenses this file to you under the Apache License, 
 *  Version 2.0 (the "License"); you may not use this file except in compliance 
 *  with the License. You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package heigit.ors.routing;

public class RoutingErrorCodes 
{
	public static int INVALID_JSON_FORMAT = 200;
	public static int MISSING_PARAMETER = 201;
	public static int INVALID_PARAMETER_FORMAT = 202;
	public static int INVALID_PARAMETER_VALUE = 203;
	public static int REQUEST_EXCEEDS_SERVER_LIMIT = 204;
	public static int EMPTY_ELEMENT = 205;
	public static int UNKNOWN = 299;
}

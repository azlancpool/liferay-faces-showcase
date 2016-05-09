/**
 * Copyright (c) 2000-2016 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.test.showcase.inputsecret;

import com.liferay.faces.test.showcase.input.InputTester;


/**
 * @author  Kyle Stiemann
 * @author  Philip White
 */
public class InputSecretTester extends InputTester {

	protected static final String inputSecretURL = TEST_CONTEXT_URL + "/inputsecret";
	protected static final String inputXpath = "(//input[contains(@id,':text')])[1]";
	protected static final String inputSecretXpath = "(//input[contains(@id,':secret')])[1]";
	protected static final String inputXpathRight = "(//input[contains(@id,':text')])[2]";
	protected static final String inputSecretXpathRight = "(//input[contains(@id,':secret')])[2]";
}
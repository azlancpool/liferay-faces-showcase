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

import org.junit.Test;

import org.openqa.selenium.WebElement;

import com.liferay.faces.test.selenium.Browser;


/**
 * @author  Kyle Stiemann
 * @author  Philip White
 */
public class InputSecretImmediateTester extends InputSecretTester {

	@Test
	public void runInputSecretImmediateTest() throws Exception {

		Browser browser = Browser.getInstance();
		browser.navigateToURL(inputSecretURL + "/immediate");

		// Wait to begin the test until the submit button is rendered.
		browser.waitForElementVisible(submitButtonXpath);

		// Test that the value submits successfully and the valueChangeListener method is called during the
		// APPLY_REQUEST_VALUES phase.
		WebElement input = browser.getElement(inputXpath);
		String text = "Hello World!";
		input.sendKeys(text);
		browser.performAndWaitForAjaxRerender(browser.createClickAction(submitButtonXpath), modelValueXpath);
		browser.assertElementTextVisible(modelValueXpath, text);
		browser.assertElementVisible(immediateMessage);

		// Test that the value submits successfully and the valueChangeListener method is called during the
		// PROCESS_VALIDATIONS phase.
		input = browser.getElement(inputXpathRight);
		input.sendKeys(text);
		browser.performAndWaitForAjaxRerender(browser.createClickAction(submitButtonXpathRight), modelValueXpathRight);
		browser.assertElementTextVisible(modelValueXpathRight, text);
		browser.assertElementVisible(immediateMessageRight);
	}
}
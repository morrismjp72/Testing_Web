package com.webcuratar

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ActionKeywords {

	@Keyword
	def clickSubmit() {
		def btn = findTestObject('Page_WebCuratar/5. Button Submit')
		WebUI.waitForElementClickable(btn, 15)
		WebUI.click(btn)
	}
}
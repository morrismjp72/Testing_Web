package com.webcuratar

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class FormKeywords {

	// isi form Book an Appointment (nilai dikirim dari test case)
	@Keyword
	def fillContactForm(String name, String email, String subject, String noted) {
		WebUI.setText(findTestObject('Page_WebCuratar/1. Input_Name'), name)
		WebUI.setText(findTestObject('Page_WebCuratar/2. Input_Email'), email)
		WebUI.setText(findTestObject('Page_WebCuratar/3. Input_Subject'), subject)
		WebUI.setText(findTestObject('Page_WebCuratar/4. Input noted'), noted)
	}
}
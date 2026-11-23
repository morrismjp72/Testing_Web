package com.webcuratar

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class VerificationKeywords {

	 @Keyword
    def verifySuccessMessage() {
        WebUI.verifyElementText(
            findTestObject(
                '2. Validasi_Web_webcuratar/Page_WebCuratar/51. Validasi pengisian benar'
            ),
            'Thank you for your message. It has been sent.'
        )
    }
}
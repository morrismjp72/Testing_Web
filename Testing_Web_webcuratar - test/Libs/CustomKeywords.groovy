
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "com.webcuratar.ScreenshotKeywords.takeShot"(
    	String name	) {
    (new com.webcuratar.ScreenshotKeywords()).takeShot(
        	name)
}


def static "com.webcuratar.ActionKeywords.clickSubmit"() {
    (new com.webcuratar.ActionKeywords()).clickSubmit()
}


def static "com.webcuratar.FormKeywords.fillContactForm"(
    	String name	
     , 	String email	
     , 	String subject	
     , 	String noted	) {
    (new com.webcuratar.FormKeywords()).fillContactForm(
        	name
         , 	email
         , 	subject
         , 	noted)
}


def static "com.webcuratar.BrowserKeywords.opensite"() {
    (new com.webcuratar.BrowserKeywords()).opensite()
}


def static "com.webcuratar.BrowserKeywords.closeSite"() {
    (new com.webcuratar.BrowserKeywords()).closeSite()
}


def static "com.webcuratar.VerificationKeywords.verifySuccessMessage"() {
    (new com.webcuratar.VerificationKeywords()).verifySuccessMessage()
}

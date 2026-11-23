import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

def testData = findTestData('Data Files/Test_1')


// Jika ingin memanggil satu row/ baris 

String name = testData.getValue('Name', 1)
String email = testData.getValue('Email', 1)
String subject = testData.getValue('Subject', 1)
String noted = testData.getValue('Noted', 1)


//for (int row = 1; row <= testData.getRowNumbers(); row++) {

	//String name = testData.getValue('Name', row)
	//String email = testData.getValue('Email', row)
	// subject = testData.getValue('Subject', row)
	//String noted = testData.getValue('Noted', row)

CustomKeywords.'com.webcuratar.BrowserKeywords.opensite'()

//WebUI.openBrowser(null)

//WebUI.navigateToUrl(GlobalVariable.TrueURL)

//WebUI.maximizeWindow()


CustomKeywords.'com.webcuratar.FormKeywords.fillContactForm'(   
	 GlobalVariable.Name,
    GlobalVariable.Email,
    GlobalVariable.Subject,
    GlobalVariable.Noted
	)

//WebUI.setText(findTestObject('Page_WebCuratar/1. Input_Name'), GlobalVariable.Name)

//WebUI.setText(findTestObject('Page_WebCuratar/2. Input_Email'), GlobalVariable.Email)

//WebUI.setText(findTestObject('Page_WebCuratar/3. Input_Subject'), GlobalVariable.Subject)

//WebUI.setText(findTestObject('Page_WebCuratar/4. Input noted'), GlobalVariable.Noted)

WebUI.check(findTestObject('Page_WebCuratar/5. Button Submit'))

CustomKeywords.'com.webcuratar.ActionKeywords.clickSubmit'()

//WebUI.click(findTestObject('Page_WebCuratar/5. Button Submit'))


CustomKeywords.'com.webcuratar.VerificationKeywords.verifySuccessMessage'()

//WebUI.verifyElementText(findTestObject('2. Validasi_Web_webcuratar/Page_WebCuratar/51. Validasi pengisian benar'), 'Thank you for your message. It has been sent.')

//WebUI.closeBrowser()

CustomKeywords.'com.webcuratar.ScreenshotKeywords.takeShot'()

CustomKeywords.'com.webcuratar.BrowserKeywords.closeSite'()



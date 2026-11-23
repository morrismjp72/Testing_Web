import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import java.util.UUID
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.llm.keyword.contribution.LlmDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


import com.katalon.execution.application.ExecutionMain

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.llm.keyword.contribution.LlmDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\USER\\AppData\\Local\\Temp\\Katalon\\Test Cases\\1. Testing_Web_webcuratar\\40.Testing _Web Webcuratar\\47. TC-047-Negative Test- Book an Appointment - Mengisi hanya Email\\20261123_002600_570\\execution.properties')

TestCaseMain.beforeStart()

new ExecutionMain().init();

Map<String, String> tcProperties = new HashMap<String, String>();

def __tcBinding = new TestCaseBinding('Test Cases/1. Testing_Web_webcuratar/40.Testing _Web Webcuratar/47. TC-047-Negative Test- Book an Appointment - Mengisi hanya Email', [:])
if (__tcBinding != null) { __tcBinding.setTestCaseExecutionId(UUID.fromString('43194f04-9bcf-47c1-bfed-cff65fd1d31e')) }


        TestCaseMain.runTestCase('Test Cases/1. Testing_Web_webcuratar/40.Testing _Web Webcuratar/47. TC-047-Negative Test- Book an Appointment - Mengisi hanya Email', __tcBinding, FailureHandling.STOP_ON_FAILURE , false, tcProperties)
    

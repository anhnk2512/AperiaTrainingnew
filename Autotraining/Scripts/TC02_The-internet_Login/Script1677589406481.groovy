import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import internal.GlobalVariable

'step 1: Open browser'

WebUI.openBrowser(GlobalVariable.Theinternet_URL)

'step 2: Set Text (username)'

// wait for user name visible

WebUI.waitForElementVisible(findTestObject('Object Repository/The-internet/txt_Username'), 1)

// Enter username

WebUI.setText(findTestObject('Object Repository/The-internet/txt_Username'), GlobalVariable.Theinternet_USER)

'step 3: Set Text (password)'

WebUI.setText(findTestObject('Object Repository/The-internet/txt_Password'),GlobalVariable.Theinternet_PWD)

'Step 4: Click login button'

WebUI.click(findTestObject('Object Repository/The-internet/btn_Login'))

'step 5: Verify Text Present (Verify message ‘Welcome to the Secure Area. When you are done click logout below.’ displayed)'

WebUI.verifyElementVisible(findTestObject('Object Repository/The-internet/msg_welcome'))

'Step 6: Close browser'
//Delay 3s
WebUI.delay(3)
WebUI.closeBrowser()
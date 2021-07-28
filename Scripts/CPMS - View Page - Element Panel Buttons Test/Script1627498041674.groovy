import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('http://cpms-viewer.herokuapp.com/login/?next=/')
//
//WebUI.click(findTestObject('Object Repository/Page_CPMS - Login/input_Create your own user_username'))
//
//WebUI.setText(findTestObject('Object Repository/Page_CPMS - Login/input_Create your own user_username'), 'test')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_CPMS - Login/input_Create your own user_password'), '5xx1bkCcAlw=')
//
//WebUI.click(findTestObject('Object Repository/Page_CPMS - Login/button_Sign in'))
WebUI.callTestCase(findTestCase('CPMS - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(10)

WebUI.verifyElementVisible(findTestObject('Page_CPMS - View/panel_Element View'))

WebUI.verifyElementNotVisible(findTestObject('Page_CPMS - View/panel_Compatibility View'))

WebUI.verifyElementVisible(findTestObject('Page_CPMS - View/button_Compatibility Check'))

WebUI.click(findTestObject('Object Repository/Page_CPMS - View/button_Compatibility Check'))

WebUI.verifyElementNotVisible(findTestObject('Page_CPMS - View/button_Compatibility Check'))

WebUI.verifyElementVisible(findTestObject('Page_CPMS - View/button_View Mode'))

WebUI.verifyElementVisible(findTestObject('Page_CPMS - View/panel_Compatibility View'))

WebUI.click(findTestObject('Object Repository/Page_CPMS - View/button_View Mode'))

WebUI.verifyElementNotVisible(findTestObject('Page_CPMS - View/button_View Mode'))

WebUI.verifyElementNotVisible(findTestObject('Page_CPMS - View/panel_Compatibility View'))

WebUI.verifyElementVisible(findTestObject('Page_CPMS - View/button_Compatibility Check'))

WebUI.closeBrowser()


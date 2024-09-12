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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Login Pages/label_img'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Login Pages/label_login'), findTestData('Login/data verify login').getValue(
        'Label', 1))

WebUI.verifyElementText(findTestObject('Object Repository/Login Pages/label_username'), findTestData('Login/data verify login').getValue(
        'Label', 2))

WebUI.verifyElementText(findTestObject('Object Repository/Login Pages/label_password'), findTestData('Login/data verify login').getValue(
        'Label', 3))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login Pages/btn_login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login Pages/btn_fgtpassword'))

WebUI.setText(findTestObject('Object Repository/Login Pages/field_username'), 'username')

WebUI.setText(findTestObject('Object Repository/Login Pages/field_password'), 'password')

WebUI.takeFullPageScreenshot()

WebUI.delay(5)


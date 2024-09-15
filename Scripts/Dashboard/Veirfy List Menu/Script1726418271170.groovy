import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Login/Verify Valid Login'), [:], FailureHandling.STOP_ON_FAILURE)

//Import webdriver
WebDriver driver = DriverFactory.getWebDriver()



//println(menu.size())

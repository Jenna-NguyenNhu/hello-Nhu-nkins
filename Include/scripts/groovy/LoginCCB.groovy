import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginCCB {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on 'nguoiyeudep' site")
	def I_am_on_nguoiyeudep_site(){
		WebUI.openBrowser(null)
		WebUI.navigateToUrl('https://nguoiyeudep.com/user')
	}

	@When("I input email '(.*)'")
	def I_input_email_with_value(username) {
		WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Ti khon thnh vin ti Ngi Yu p/input__name"),5)
		WebUI.setText(findTestObject("Object Repository/Page_Ti khon thnh vin ti Ngi Yu p/input__name"),username)
	}
	@And("I input password '(.*)'")
	def I_input_password_with_value(password){
		WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Ti khon thnh vin ti Ngi Yu p/input__pass"),5)
		WebUI.setText(findTestObject("Object Repository/Page_Ti khon thnh vin ti Ngi Yu p/input__pass"),password)
	}
	@Then("I click on Sign in button")
	def I_click_on_sign_in_button(){
		WebUI.click(findTestObject("Object Repository/Page_Ti khon thnh vin ti Ngi Yu p/button_ng nhp"))
	}
}
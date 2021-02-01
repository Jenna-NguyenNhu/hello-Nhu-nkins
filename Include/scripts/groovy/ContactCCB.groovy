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



class ContactCCB {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on 'nguoiyeudep' page")
	def I_am_on_nguoiyeudep_page() {
		WebUI.openBrowser(null)
		WebUI.navigateToUrl('https://nguoiyeudep.com/')
	}

	@When("I click Sign in with messenger")
	def I_click_Sign_in_with_messenger() {
		WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/div_ng nhp vo Messenger (1)'))
	}

	@And("I enter email '(.*)'")
	def I_input_email_with_value(username) {
		WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Facebook/input_Chat vi Gii Tr p_email"),5)
		WebUI.setText(findTestObject("Object Repository/Page_Facebook/input_Chat vi Gii Tr p_email"),username)
	}
	@And("I enter password '(.*)'")
	def I_input_password_with_value(password){
		WebUI.waitForElementVisible(findTestObject("Object Repository/Page_Facebook/input_Chat vi Gii Tr p_pass"),5)
		WebUI.setText(findTestObject("Object Repository/Page_Facebook/input_Chat vi Gii Tr p_pass"),password)
	}
	@And("I click Sign in button")
	def I_click_Sign_in_button(){
		WebUI.click(findTestObject("Object Repository/Page_Facebook/div_ng nhp"))
	}
	@And("I input message 'Nhu ne'")
	def I_input_message(){
		WebUI.setText(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/input_Bn  m cuc tr chuyn ny t nguoiyeudep.c_54424e (3)'),
				'mô na')
	}

	@Then("I click Send button")
	def I_click_Send_button(){
		WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/div_Bn  m cuc tr chuyn ny t nguoiyeudep.com_3adf1f'))
	}
}
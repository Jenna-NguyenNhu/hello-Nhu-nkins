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



class AddToListCCb {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on 'nguoiyeudep' website")
	def I_am_on_nguoiyeudep_website() {
		WebUI.openBrowser(null)
		WebUI.navigateToUrl('https://nguoiyeudep.com/')
	}

	@When("I click PG and PB on the menu bar")
	def I_click_PG_and_PB_on_the_menu_bar() {
		WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/a_Chn PG  PB'))
	}

	@And("I click View button")
	def I_click_View_button() {
		WebUI.click(findTestObject('Object Repository/Page_Chn PG  PB cho bui hn ca bn/a_Xem'))
	}


	@And("I click Add to list button")
	def I_click_Add_to_list_button() {
		WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/a_a vo danh sch chn'))
	}



	@Then("I click Agree button")
	def I_click_Agree_button() {
		WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/button_ng'))
	}
}anh sch chn'))
	}
	

	@Then("I click Agree button")
	def I_click_Agree_button() {
		WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/button_ng'))
	}
}
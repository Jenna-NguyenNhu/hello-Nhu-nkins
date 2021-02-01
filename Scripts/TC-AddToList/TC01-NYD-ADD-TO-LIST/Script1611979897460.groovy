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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nguoiyeudep.com/')

WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/a_Chn PG  PB'))

WebUI.click(findTestObject('Object Repository/Page_Chn PG  PB cho bui hn ca bn/svg (1)'))

WebUI.click(findTestObject('Object Repository/Page_Chn PG  PB cho bui hn ca bn/a_Xem'))

WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/a_a vo danh sch chn'))

WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/button_ng'))

WebUI.click(findTestObject('Object Repository/Page_Saki Trn hn h ti Tp H Ch Minh/button_ng'))


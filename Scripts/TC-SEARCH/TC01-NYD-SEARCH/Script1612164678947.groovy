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

WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/svg (6)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_Ngi NamNgi n'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_- Tt c -Ngi NamNgi n'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_-Nm181920212223242526272829303132333_35cc42'), 
    '2002', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_-Nm181920212223242526272829303132333_35cc42_1'), 
    '1998', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_Cng i chi  i n  cafe  xem phim D sin_129d3d'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/select_- Tt c -Ha NiTp H Ch Minh NngHuAn Gi_b23bc8'), 
    '83', true)

WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/button_Thc hin'))

WebUI.click(findTestObject('Object Repository/Page_Chn PG  PB cho bui hn ca bn/a_Xem'))


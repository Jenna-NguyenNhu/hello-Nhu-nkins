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

WebUI.switchToWindowTitle('Hẹn hò, cho thuê người yêu đẹp, hen ho, thue nguoi yeu')

WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/div_ng nhp vo Messenger (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Chat vi Gii Tr p_email'), '0962973782')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Chat vi Gii Tr p_pass'), '5l3r5VOSXf+QVEMsJo02Sg==')

WebUI.click(findTestObject('Object Repository/Page_Facebook/div_ng nhp'))

WebUI.switchToWindowTitle('Hẹn hò, cho thuê người yêu đẹp, hen ho, thue nguoi yeu')

WebUI.setText(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/input_Bn  m cuc tr chuyn ny t nguoiyeudep.c_54424e (3)'), 
    'mô na')

WebUI.click(findTestObject('Object Repository/Page_Hn h, cho thu ngi yu p, hen ho, thue n_ad7527/div_Bn  m cuc tr chuyn ny t nguoiyeudep.com_3adf1f'))


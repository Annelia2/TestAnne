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

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/a_Add CAM'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/select_SelectInvestasiModal KerjaMultiguna'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/select_SelectInstallment Financing (IF)Sale_d9f2a8'), 
    'I', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/select_SelectNEW FINANCINGRESTRUCTURING TYP_364389'), 
    'NEW', true)

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_IndividuCorporate_ind_cor'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_UsedNew_new_car'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_NoYes_guarantor'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_NoYes_boa'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_IndividuCorporate_submit'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/input_Multiguna_yes'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/a_Name in ID Card'))

WebUI.switchToWindowTitle('MLCI - Credit Approval Memorandum')

WebUI.click(findTestObject('Page_MLCI - Credit Approval Memorandum/a_067039'))

WebUI.switchToWindowTitle('MLCI - Credit Approval Memorandum')

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/img'))

WebUI.click(findTestObject('Object Repository/Page_MLCI - Credit Approval Memorandum/a_LOGOUT'))


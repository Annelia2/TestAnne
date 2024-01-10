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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mitsuilease.co.id/')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_01_KARIR'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_02_Corporate Credit Marketing (Code CCM)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/5. Karir/1. CCM.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_01_KARIR'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_03_Credit Policy Officer (Code CPO)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/5. Karir/2.CPO.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_01_KARIR'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_04_Credit Risk Analytic (Code CRA)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/5. Karir/3. CRA.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_01_KARIR'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP05_WEBMLCI_AC_Karir/WEBMLCI_05_Credit Marketing Officer (Code CMO)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/5. Karir/4. CMO.jpg')

WebUI.closeBrowser()


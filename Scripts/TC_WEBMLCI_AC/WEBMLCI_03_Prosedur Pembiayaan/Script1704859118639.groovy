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

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_02_Cara Pembayaran Angsuran Pembiayaan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/1. Cara Pembayaran.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_03_Persyaratan Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/2. Persyaratan Kredit.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_04_Suku Bunga'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/3. Suku Bunga.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_05_Simulasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/4. Simulasi Kredit.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_06_Daftar Rekanan Asuransi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/5. Daftar Rekanan Asuransi.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_07_Aplikasi Kredit'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/6. Aplikasi Kredit.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_08_Dokumen Persyaratan Pengambilan BPKB'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/7. Dok Persyaratan Pengambilan BPKB.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_01_PROSEDUR PEMBIAYAAN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP03_WEBMLCI_AC_Prosedur Pembiayaan/WEBMLCI_09_Formulir Permohonan Pengecekan Data'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/3. Prosedur Pembiayaan/8. Formulir Permohonan Pengecekan Data.jpg')

WebUI.closeBrowser()


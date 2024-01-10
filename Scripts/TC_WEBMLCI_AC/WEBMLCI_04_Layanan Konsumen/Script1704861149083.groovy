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

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_02_KomentarSaran'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/4. Layanan Konsumen/1. Komentar Saran.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_03_Contact Us'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/4. Layanan Konsumen/2. Contact Us.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_04_Prosedur Pengaduan Konsumen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/4. Layanan Konsumen/3. Prosedur Pengaduan Konsumen.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_05_Lembaga Alternatif Penyelesaian Sengketa (LAPS)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/4. Layanan Konsumen/4. Lembaga Alternatif Penyelesaian Sengketa.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_01_LAYANAN KONSUMEN'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP04_WEBMLCI_AC_Layanan Konsumen/WEBMLCI_05_Ringkasan Informasi Produk dan Layanan Ve_100725'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/4. Layanan Konsumen/5. Ringkasan Informasi Produk.jpg')

WebUI.closeBrowser()


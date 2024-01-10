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

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_02_Apa itu My Apps dan bagaimana penggunaannya'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/1. Apa itu My Apps.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_03_Apa yang perlu diperhatikan dalam proses _0b92b7'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/2. Apa yang perlu diperhatikan.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_04_Bagaimana cara klaim asuransi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/3. Cara Klaim Asuransi.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_05_Apa saja dokumen yang diterima setelah pelunasan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/4. Apa saja dokumen yang diterima.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_06_Kapan pembayaran angsuran dilakukan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/5. Kapan Pembayaran Angsuran.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_07_Bagaimana cara pelunasan fasilitas pembiayaan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/6. Cara pelunasan.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_08_Bagaimana cara pembayaran angsuran'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/7. Cara pembayaran.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_09_Mengapa Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/8. Mengapa Mitsui.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_01_FAQ'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP06_WEBMLCI_AC_FAQ/WEBMLCI_10_Apa Keunggulan Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/6. FAQ/9. Apa keunggulan Mitsui.jpg')

WebUI.closeBrowser()


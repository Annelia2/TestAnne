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

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_02_Tentang Mitsui Leasing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/1. Tentang MITSUI.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_03_Misi, Visi dan Nilai'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/2. VISI, MISI, dan Nilai.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_04_Struktur Organisasi'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/3. Struktur Organisasi.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_05_Manajemen'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/4. Management.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_06_Laporan Tahunan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/5. Laporan Tahunan.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_07_Tata Kelola'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/6. Tata Kelola.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_09_Tanggung Jawab Sosial Lingkungan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/7. Tanggung Jwb.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_08_Kegiatan Perusahaan'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_10_Berita dan Acara'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/8. Berita dan Acara.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_12_Kantor Pusat'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/9. Kantor Pusat.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_13_Kantor Cabang'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/10. Kantor Cabang.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_11_Kantor Mitsui Leasing'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_14_Kantor Selain Kantor Cabang (KSKC)'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/11. KSKC.jpg')

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_01_Profile'))

WebUI.click(findTestObject('Object Repository/REP_WEBMLCI_AC/REP01_WEBMLCI_AC_Profile/WEBMLCI_15_Laporan Keberlanjutan'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot('D:/Annelia/MLCI/Katalon/Katalon_Studio_PE_Windows_64-8.5.5/WEBMLCI/1. Profile/12. Laporan Keberlanjutan.jpg')

WebUI.closeBrowser()


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

WebUI.openBrowser('https://10.9.2.63/ecommerce/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login/Button Login'), 0)

WebUI.click(findTestObject('Wakaf Asset Online/Donasi'))

WebUI.click(findTestObject('Wakaf Asset Online/Wakaf Asset Donasi'))

WebUI.verifyElementPresent(findTestObject('Wakaf Asset Online/verify Wakaf Asset Online'), 0)

WebUI.selectOptionByValue(findTestObject('Wakaf Asset Online/Pilih Type Wakaf'), 'Bangunan', false)

WebUI.setText(findTestObject('Wakaf Asset Online/Input Perkiraan Nilai Asset'), '100000000')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Alamat Asset'), 'jalan Taruma Jawa Timur')

WebUI.setText(findTestObject('Wakaf Asset Online/Keterangan Asset'), 'Masjid')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Nama Lengkap'), 'joko susanto')

WebUI.setText(findTestObject('Wakaf Asset Online/Input No Handphone'), '085123456789')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Email'), 'joko@gmail.com')

WebUI.uploadFile(findTestObject('Wakaf Asset Online/Input File Upload'), 'E:\\minions.png')

WebUI.setText(findTestObject('Wakaf Asset Online/Input 2 Digit Terakhir'), '88')

WebUI.click(findTestObject('Wakaf Asset Online/button Wakaf Sekarang'))

WebUI.verifyElementPresent(findTestObject('Wakaf Asset Online/Verify_GAGAL Diproses, 2 Digit Terakhir No Handphone'), 0)


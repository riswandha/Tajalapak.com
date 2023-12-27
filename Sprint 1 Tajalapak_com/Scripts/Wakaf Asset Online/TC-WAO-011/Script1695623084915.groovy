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

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('https://10.9.2.63/ecommerce/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Search Product/Verify Page Tajalapak'), 0)

WebUI.click(findTestObject('Wakaf Asset Online/Donasi'))

WebUI.click(findTestObject('Wakaf Asset Online/Wakaf Asset Donasi'))

WebUI.verifyElementPresent(findTestObject('Wakaf Asset Online/verify Wakaf Asset Online'), 0)

WebUI.selectOptionByValue(findTestObject('Wakaf Asset Online/Pilih Type Wakaf'), 'Bangunan', false)

WebUI.setText(findTestObject('Wakaf Asset Online/Input Perkiraan Nilai Asset'), '100000000')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Alamat Asset'), 'Jalan Taruma Jawa Timur')

WebUI.setText(findTestObject('Wakaf Asset Online/Keterangan Asset'), '')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Nama Lengkap'), 'juni')

WebUI.setText(findTestObject('Wakaf Asset Online/Input No Handphone'), 'nomor')

WebUI.setText(findTestObject('Wakaf Asset Online/Input Email'), 'joko@gmail.com')

WebUI.uploadFile(findTestObject('Wakaf Asset Online/Input File Upload'), 'E:\\minions.png')

WebUI.setText(findTestObject('Wakaf Asset Online/Input 2 Digit Terakhir'), '89')

WebUI.click(findTestObject('Wakaf Asset Online/button Wakaf Sekarang'))

//Cara Ambil Error Message Field
WebDriver driver = DriverFactory.getWebDriver()

//Ambil Xpath field nanti muncul error messagenya (coba xpath biasa atau fill full xpath)
field_username_element = driver.findElement(By.xpath('//input[@name="no_handphone"]'))

//Ambil Error Messagenya menggunakan perintah javascript
accept_button_message = ((driver) as JavascriptExecutor).executeScript('return arguments[0].validationMessage', field_username_element)

println(accept_button_message)

//Verifikasi apakah error message sesuai / ada
assert accept_button_message == 'Please fill out this field.'

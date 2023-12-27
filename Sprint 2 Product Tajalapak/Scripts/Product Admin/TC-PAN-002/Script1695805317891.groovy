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

import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.callTestCase(findTestCase('Product Admin/TC-PA-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Admin/Button Tambahkan Data'))

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Verifikasi Halaman Product Baru'), 0)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Pemilik'), 'Toko Koko')

WebUI.click(findTestObject('Product Admin/TambahProduk/Pemilik Toko Koko'))

WebUI.selectOptionByValue(findTestObject('Product Admin/TambahProduk/Pilih Katagori'), '6', false)

WebUI.click(findTestObject('Product Admin/TambahProduk/Button Tambahkan'))

//Cara Ambil Error Message Field
WebDriver driver = DriverFactory.getWebDriver()

//Ambil Xpath field nanti muncul error messagenya (coba xpath biasa atau fill full xpath)
field_username_element = driver.findElement(By.xpath('//input[@name="b"]'))
//Ambil Error Messagenya menggunakan perintah javascript
accept_button_message = ((JavascriptExecutor) driver).executeScript("return arguments[0].validationMessage", field_username_element)
println accept_button_message

//Verifikasi apakah error message sesuai / ada
assert accept_button_message == "Please fill out this field."


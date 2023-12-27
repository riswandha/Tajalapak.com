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

WebUI.callTestCase(findTestCase('Product Ecommerce/TC-PE-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Product Ecommerce/Image Gambar produk 1'))

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Edit Data'))

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Berat'), '1000000000')

//Cara Ambil Error Message Field
WebDriver driver = DriverFactory.getWebDriver()

//Ambil Xpath field nanti muncul error messagenya (coba xpath biasa atau fill full xpath)
field_username_element = driver.findElement(By.xpath('//input[@name="berat"]'))

//Ambil Error Messagenya menggunakan perintah javascript
accept_button_message = ((driver) as JavascriptExecutor).executeScript('return arguments[0].validationMessage', field_username_element)


WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Button Update Data'))

println(accept_button_message)

//Verifikasi apakah error message sesuai / ada
assert accept_button_message == 'Berat produk terlalu berat'


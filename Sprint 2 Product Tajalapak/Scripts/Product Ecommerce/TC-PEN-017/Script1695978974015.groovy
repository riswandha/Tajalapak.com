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

WebUI.callTestCase(findTestCase('Product Ecommerce/TC-PE-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Product Ecommerce/Image Gambar produk 1'))

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Edit Data'))

WebUI.verifyElementPresent(findTestObject('Product Ecommerce/Tambahkan Product/Button Update Data'), 0)

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Input Hapus Kolom Variasi 1'))

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Input Hapus Kolom Variasi 1'))

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Input Hapus Kolom Variasi 1'))

notif = WebUI.getAlertText()

assert "Tidak ditemukan textbox untuk dihapus." == notif
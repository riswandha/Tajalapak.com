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

WebUI.callTestCase(findTestCase('Product Admin/TC-PA-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Admin/Button Edit Product Fleksibel'))

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Verifikasi Halaman Product Baru'), 0)

WebUI.click(findTestObject('Product Admin/TambahProduk/Keterangan/Button Upload Gambar Keterangan'))

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Keterangan/Verify Halaman Insert Image Keterangan'), 
    0)

WebUI.uploadFile(findTestObject('Product Admin/TambahProduk/Keterangan/Input File Gambar Keterangan'), 'E:\\Pelatihan\\Xsis Academy\\panci.jpg')

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Keterangan/img via Link'), 0)


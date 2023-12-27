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

WebUI.uploadFile(findTestObject('Product Admin/TambahProduk/Input File'), 'E:\\Pelatihan\\Xsis Academy\\DJI_0621.DNG')

WebUI.verifyElementText(findTestObject('Product Admin/TambahProduk/Verifikasi File Lebih besar dari 10MB'), 'Error File Lebih besar dari 10 MB')


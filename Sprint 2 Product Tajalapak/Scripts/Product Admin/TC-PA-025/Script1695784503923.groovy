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

jmlAwal = WebUI.getText(findTestObject('Object Repository/Product Admin/Showing 1 to 10 of 55 entries'))

dataLama = WebUI.getText(findTestObject('Object Repository/Product Admin/TambahProduk/Data Verifikasi Hapus Data'))

WebUI.click(findTestObject('Product Admin/Button Hapus Data'))

WebUI.acceptAlert()

dataBaru = WebUI.getText(findTestObject('Object Repository/Product Admin/TambahProduk/Data Verifikasi Hapus Data'))

jmlAkhir = WebUI.getText(findTestObject('Object Repository/Product Admin/Showing 1 to 10 of 55 entries'))

resultAwal = jmlAwal.trim().substring(19,21)
resultAkhir = jmlAkhir.trim().substring(19,21)

data1 = Integer.parseInt(resultAwal)
data2 = Integer.parseInt(resultAkhir)

assert dataLama != dataBaru
assert (data1 - 1) == data2

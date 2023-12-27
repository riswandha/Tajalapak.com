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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Product Ecommerce/TC-PE-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Product Ecommerce/Image Gambar produk 1'))

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Edit Data'))

WebUI.click(findTestObject('Product Ecommerce/Kupon/Button Buat Product'))

WebUI.verifyElementPresent(findTestObject('Product Ecommerce/Kupon/Verifikasi Halaman Voucher Product'), 0)

WebUI.setText(findTestObject('Product Ecommerce/Kupon/Input Kode Kupon'), kodeKupon)

WebUI.setText(findTestObject('Product Ecommerce/Kupon/Input Jumlah Kode kupon'), jumlah)

WebUI.setText(findTestObject('Product Ecommerce/Kupon/Input Masa Berlaku'), expired)

WebUI.setText(findTestObject('Product Ecommerce/Kupon/Input Min Order'), minOrder)

WebUI.setText(findTestObject('Product Ecommerce/Kupon/Input Nilai Kupon'), nilai)

WebUI.click(findTestObject('Product Ecommerce/Kupon/Button Simpan'))

List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Product Ecommerce/Kupon/Data Semua Voucher'),10)

String dataKupon = ""

//deklarasi dua array
for(int i = 0 ; i<dataList.size(); i++) {
	text = dataList.get(i).text
	dataKupon = dataKupon + text
}

println dataKupon

assert dataKupon.contains(kodeKupon)
assert dataKupon.contains(jumlah)
assert dataKupon.contains(expired)
assert dataKupon.contains(minOrder)
assert dataKupon.contains(nilai)
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

jmlLama = WebUI.getText(findTestObject('Object Repository/Product Admin/Showing 1 to 10 of 55 entries'))

WebUI.click(findTestObject('Product Admin/Button Edit Product Fleksibel'))

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Verifikasi Halaman Product Baru'), 0)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Pemilik'), pemilik)

WebUI.click(findTestObject('Product Admin/TambahProduk/Pemilik Toko Koko'))

WebUI.selectOptionByValue(findTestObject('Product Admin/TambahProduk/Pilih Katagori'), katagori, false)

WebUI.selectOptionByValue(findTestObject('Product Admin/TambahProduk/Pilih Sub Katagori'), subKatagori, false)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Nama Produk'), namaProduk)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Satuan Produk'), satuan)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Berat gram'), berat)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Harga Modal'), hargaModal)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Harga Reseller'), hargaReseller)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Harga Konsumen'), hargaKonsumen)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Diskon'), diskon)

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Stok Awal'), stokAwal)

WebUI.click(findTestObject('Product Admin/TambahProduk/Input Pria Tag'))

WebUI.setText(findTestObject('Product Admin/TambahProduk/Input Cuplikan Textarea'), cuplikan)

WebUI.check(findTestObject('Product Admin/TambahProduk/Input Aktif product'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product Admin/Update Edit Keterangan'), keterangan)

WebUI.click(findTestObject('Product Admin/TambahProduk/Button Update Data'))

jmlBaru = WebUI.getText(findTestObject('Object Repository/Product Admin/Showing 1 to 10 of 55 entries'))
dataBaru = WebUI.getText(findTestObject('Object Repository/Product Admin/TambahProduk/Data Verifikasi Hapus Data'))

println(dataBaru)


assert dataBaru.contains(namaProduk) == true
assert jmlLama == jmlBaru

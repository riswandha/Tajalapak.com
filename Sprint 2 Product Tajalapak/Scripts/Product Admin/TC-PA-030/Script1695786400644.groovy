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
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.webui.driver.DriverFactory

HashMap<String,Object> data = WebUI.callTestCase(findTestCase('Product Admin/TC-PA-022'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Admin/Button Edit Product Fleksibel'))

WebUI.verifyElementPresent(findTestObject('Product Admin/TambahProduk/Verifikasi Halaman Product Baru'), 0)

Select select = new Select(DriverFactory.getWebDriver().findElement(By.xpath("//select[@name='a']")))
String katogoriEdit = select.getFirstSelectedOption().getText()

Select select1 = new Select(DriverFactory.getWebDriver().findElement(By.xpath("//select[@id='sub_kategori_produk']")))
String subKatagoriEdit = select1.getFirstSelectedOption().getText()

pemilikEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Pemilik'), 'value')
namaProductEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Nama Produk'),'value')
satuanEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Satuan Produk'),'value')
beratEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Berat gram'),'value')
hargaModalEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Harga Modal'),'value')
hargaResellerEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Harga Reseller'),'value')
hargaKonsumenEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Harga Konsumen'),'value')
diskonEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Diskon'),'value')
StokEdit = WebUI.getAttribute(findTestObject('Object Repository/Product Admin/TambahProduk/Input Diskon'),'value')

println pemilikEdit
println katogoriEdit
println subKatagoriEdit
println namaProductEdit
println satuanEdit
println hargaModalEdit
println hargaResellerEdit
println hargaKonsumenEdit
println diskonEdit
println StokEdit

assert pemilikEdit == data.get("dataPemilik");
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

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Produk'))

WebUI.verifyElementPresent(findTestObject('Product Ecommerce/Tambahkan Product/Verifikasi Halaman Tambahkan Product'), 0)

WebUI.selectOptionByValue(findTestObject('Product Ecommerce/Tambahkan Product/Pilih Katagori Produk'), '6', false)

WebUI.selectOptionByValue(findTestObject('Product Ecommerce/Tambahkan Product/Pilih Sub Katagori Produk'), '15', false)

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Nama Produk'), 'Baju Koko Kids 0 - 9 tahun')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Satuan'), 'Pcs')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Berat'), '100')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Harga Modal'), '10000')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Harga Jual'), '12000')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Diskon'), '1000')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Stok Awal'), '20')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Minimum Order'), '1')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Cuplikan'), 'Stylish dan Nyaman! Baju Koko Kids kami cocok untuk usia 0 - 9 tahun. Terbuat dari bahan berkualitas tinggi yang lembut di kulit anak-anak, baju ini sempurna untuk berbagai acara, termasuk lebaran.')

WebUI.check(findTestObject('Product Ecommerce/Tambahkan Product/Input Merek Pria'))

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Keterangan'), 'Desain Modern: Tampil modis dengan desain terkini yang cocok untuk anak-anak. Kenyamanan Sepanjang Hari: Bahan lembut dan nyaman sehingga anak-anak tetap bahagia sepanjang hari. Beragam Warna: Pilihan warna yang cerah dan menarik. Ukuran Sesuai: Tersedia dalam berbagai ukuran, mulai dari 0 hingga 9 tahun. Dapatkan tampilan yang trendi untuk si kecil dengan Baju Koko Kids kami. Pesan sekarang dan buat momen lebaran mereka lebih istimewa!')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Variasi 1 Nama Variasi'), 'Warna')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Variasi 1 Kolom 1'), 'Merah')

WebUI.setText(findTestObject('Product Ecommerce/Tambahkan Product/Input Variasi 1 Kolom 2'), 'Biru')

WebUI.uploadFile(findTestObject('Product Ecommerce/Tambahkan Product/Input File'), 'E:\\Pelatihan\\Xsis Academy\\Baju koko kids.jpg')

WebUI.click(findTestObject('Product Ecommerce/Tambahkan Product/Button Cancel'))

WebUI.verifyElementPresent(findTestObject('Product Ecommerce/Verifikasi Halaman Product Anda'), 0)


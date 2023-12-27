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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('https://10.9.2.63/ecommerce/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Search Product/Verify Page Tajalapak'), 0)

WebUI.setText(findTestObject('Search Product/Input Product'), merk)

WebUI.click(findTestObject('Search Product/button_Cari Product'))

//ambil semua element dari harga
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Search Product/Semua nama Produk'), 
    10)

//deklaasi array
String[] arrProdukName = new String[dataList.size()]

//deklarasi dua array
for (int i = 0; i < dataList.size(); i++) {
    text = dataList.get(i).text

    (arrProdukName[i]) = text.toLowerCase()
}

print(arrProdukName)

for (int i = 0; i < dataList.size(); i++) {
    assert (arrProdukName[i]).contains(merk)
}


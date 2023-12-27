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

WebUI.callTestCase(findTestCase('Product Admin/TC-PA-001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Product Admin/Input Search Product'), cariKata)

//ambil semua element dari harga
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Product Admin/Data Semua Product'), 
    10)

for (i = 0; i < dataList.size(); i += 7) {
    cekSearch = false

    nomor = dataList.get(i).getText()

    namaProduct = dataList.get(i + 1).getText()

    modal = dataList.get(i + 2).getText()

    reseller = dataList.get(i + 3).getText()

    konsumen = dataList.get(i + 4).getText()

    stok = dataList.get(i + 5).getText()

    satuan = dataList.get(i + 6).getText()

    berat = dataList.get(i + 7).getText()

    status = dataList.get(i + 8).getText()

    if (nomor.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (namaProduct.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (modal.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (reseller.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (konsumen.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (stok.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (satuan.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (berat.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
    
    if (status.toLowerCase().contains(cariKata.toLowerCase())) {
        cekSearch = true

        break
    }
}


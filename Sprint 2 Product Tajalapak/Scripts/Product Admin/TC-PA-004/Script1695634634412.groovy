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

WebUI.callTestCase(findTestCase('Product Admin/TC-PA-003'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product Admin/Button Sort No'))

//ambil semua element
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Product Admin/Data No Product'), 10)

//deklaasi dua array
Integer[] arrProdukNoOri = new String[dataList.size()]
Integer[] arrProdukNoSort = new String[dataList.size()]

//deklarasi dua array
for(int i = 0 ; i<dataList.size(); i++) {
	text = dataList.get(i).text
	arrProdukNoOri[i] = Integer.parseInt(text)
	arrProdukNoSort[i] = Integer.parseInt(text)
}

//sort array
Arrays.sort(arrProdukNoSort)

assert arrProdukNoOri == arrProdukNoSort
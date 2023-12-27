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

WebUI.callTestCase(findTestCase('Search Product/TC-SP-002'), [('merk') : 'a'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Search Product/Katagoti Elektronik'))

//ambil semua element dari harga
List<WebElement> dataList = WebUI.findWebElements(findTestObject('Object Repository/Search Product/Nama Product Elektronik'),
	10)

jumlah = WebUI.getText(findTestObject('Object Repository/Search Product/Jumlah Elektronik'))

angka1 = jumlah.replace("(", "")
angkaStr = angka1.replace(")", "")
println(angkaStr)
println(dataList.size())

assert Integer.parseInt(angkaStr) ==  dataList.size()
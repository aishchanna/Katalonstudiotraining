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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input__18u87m _3WuvDp'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/a_New to Flipkart Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input__2IX_2- VJZDxU'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/input__2IX_2- VJZDxU'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/span_Electronics'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping India  Buy Mobiles, El_731978/a_Mi'))

WebUI.click(findTestObject('Object Repository/Page_Mi Mobile Phones and Smartphones Onlin_ee90bb/div__24_Dny'))

WebUI.click(findTestObject('Object Repository/Page_Mi Mobile Phones and Smartphones Onlin_ee90bb/div_Add to Compare'))

WebUI.closeBrowser()


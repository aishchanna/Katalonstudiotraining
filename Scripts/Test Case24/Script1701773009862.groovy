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

WebUI.navigateToUrl('https://themeforest.net/search/demo?gad_source=1&gclid=Cj0KCQiAsburBhCIARIsAExmsu6lWmHEnu0eC3yGBpVo7EwaApZ6pQUIDxI7FeBtAx6a8eMdAxcgIsQaAlTvEALw_wcB')

WebUI.click(findTestObject('Object Repository/Page_Demo Website Templates  ThemeForest/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Demo Website Templates  ThemeForest/input_username'))

WebUI.click(findTestObject('Object Repository/Page_Demo Website Templates  ThemeForest/label_Username or Email'))

WebUI.click(findTestObject('Object Repository/Page_Demo Website Templates  ThemeForest/label_Password'))

WebUI.closeBrowser()


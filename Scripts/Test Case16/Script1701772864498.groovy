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

WebUI.navigateToUrl('https://www.strikingly.com/?utm_source=google-sem&utm_medium=cpc&utm_campaign=v2-s-in-computers-search-hi-website-en&utm_content=v2a-s-in-computers-search-hi-website-website-en&utm_term=demo%20website&gad_source=1&gclid=Cj0KCQiAsburBhCIARIsAExmsu64SS6AGWf55V7eJnHRa9t0iwJQPMTDLXft3QuowbzAgPWrAwyQ-LQaAiuKEALw_wcB')

WebUI.click(findTestObject('Object Repository/Page_How To Make a Website  Free Website Bu_f15e7a/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Strikingly/input_userlogin'))

WebUI.click(findTestObject('Object Repository/Page_Strikingly/input_userlogin'))

WebUI.click(findTestObject('Object Repository/Page_Strikingly/a_No account Sign up'))

WebUI.click(findTestObject('Object Repository/Page_Strikingly/input_userprofile_attributesfirst_name'))

WebUI.click(findTestObject('Object Repository/Page_Strikingly/input_useremail'))

WebUI.closeBrowser()


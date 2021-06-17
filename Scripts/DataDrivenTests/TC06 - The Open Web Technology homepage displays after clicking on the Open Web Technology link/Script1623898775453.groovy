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

WebUI.navigateToUrl('https://admin-helper-f21c1.web.app/login')

WebUI.setText(findTestObject('Page_AH  Login/txt_Username'), findTestData("UserData").getValue(2,2))

WebUI.setText(findTestObject('Page_AH  Login/txt_Password'), findTestData("UserData").getValue(3,2))

WebUI.click(findTestObject('Object Repository/Page_AH  Login/button_Login'))

WebUI.verifyElementVisible(findTestObject('Page_AH  Employees List/title_Employees List'))

WebUI.click(findTestObject('Page_AH  Employees List/link_Open Web Technology'))

WebUI.switchToWindowTitle('Digital Transformation Consulting | Open Web Technology - Go Digital')

WebUI.verifyElementVisible(findTestObject('Page_Digital Transformation Consulting  Ope_4db1bc/logo_OWT'))

WebUI.verifyElementVisible(findTestObject('Page_Digital Transformation Consulting  Ope_4db1bc/buttonLearn more'))




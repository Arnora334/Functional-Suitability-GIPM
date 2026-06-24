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

WebUI.navigateToUrl('https://gipm.destroidmous.my.id/login')

WebUI.setText(findTestObject('Profile/Page_Log in - GiPM/input_Email'), 'profiletest@gmail.com')

WebUI.setEncryptedText(findTestObject('Profile/Page_Log in - GiPM/input_Password'), 'dXxk+BXaN7HQCjo0oAFPiQ==')

WebUI.click(findTestObject('Profile/Page_Log in - GiPM/button_Log in'))

WebUI.switchToWindowTitle('Dashboard - GiPM')

WebUI.click(findTestObject('Profile/Page_Dashboard - GiPM/button_Profile Test'))

WebUI.click(findTestObject('Profile/Page_Dashboard - GiPM/a_Profile'))

WebUI.switchToWindowTitle('Profile - GiPM')

WebUI.setEncryptedText(findTestObject('Profile/Page_Profile - GiPM/input_Current Password'), 'dXxk+BXaN7HQCjo0oAFPiQ==')

WebUI.setEncryptedText(findTestObject('Profile/Page_Profile - GiPM/input_New Password'), 'z/uldadSn79nKKsjFnA9rg==')

WebUI.setEncryptedText(findTestObject('Profile/Page_Profile - GiPM/input_Confirm Password'), 'z/uldadSn79nKKsjFnA9rg==')

WebUI.click(findTestObject('Profile/Page_Profile - GiPM/button_Save'))


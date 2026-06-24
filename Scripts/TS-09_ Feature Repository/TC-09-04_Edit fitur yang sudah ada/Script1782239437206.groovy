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

WebUI.setText(findTestObject('Feature Repository/Page_Log in - GiPM/input_Email'), 'Arnor@gmail.com')

WebUI.setEncryptedText(findTestObject('Feature Repository/Page_Log in - GiPM/input_Password'), 'yjcyc3Nku24=')

WebUI.click(findTestObject('Feature Repository/Page_Log in - GiPM/button_Log in'))

WebUI.switchToWindowTitle('Dashboard - GiPM')

WebUI.click(findTestObject('Feature Repository/Page_Dashboard - GiPM/span_Feature Repository'))

WebUI.switchToWindowTitle('- GiPM')

WebUI.click(findTestObject('Feature Repository/Page_- GiPM/button_Edit'))

WebUI.setText(findTestObject('Feature Repository/Page_- GiPM/input_Nama Fitur'), 'Manajemen Tiket Proyek V2')

WebUI.click(findTestObject('Feature Repository/Page_- GiPM/button_Update Feature'))

WebUI.verifyTextPresent('Manajemen Tiket Proyek V2',false)


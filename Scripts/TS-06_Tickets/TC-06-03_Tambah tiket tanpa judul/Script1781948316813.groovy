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

WebUI.setText(findTestObject('Tickets/Page_Log in - GiPM/input_Email'), 'ArnorUser@gmail.com')

WebUI.setEncryptedText(findTestObject('Tickets/Page_Log in - GiPM/input_Password'), 'z5TAnfWOweQ6L+kcHRRLPw==')

WebUI.click(findTestObject('Tickets/Page_Log in - GiPM/button_Log in'))

WebUI.click(findTestObject('Tickets/Page_- GiPM/a_Tickets'))

//Opsi pilih Project
WebUI.selectOptionByValue(findTestObject('Tickets/Page_- GiPM/select_Pilih Project -Sistem Monitoring Inventar'), '23', false)

//Judul tiket
//WebUI.setText(findTestObject('Tickets/Page_- GiPM/input_border rounded px-3 py-2 w-full'), 'Penambahan Fitur Lupa Kata  Sandi')

WebUI.setText(findTestObject('Tickets/Page_- GiPM/textarea_border rounded px-3 py-2 w-full'), 'Sistem memerlukan fitur lupa ata sandi supaya bisa mereset ulang sandi.')

WebUI.click(findTestObject('Tickets/Page_- GiPM/button_Tambah Tiket'))

WebUI.delay(2)

WebUI.refresh()

WebUI.verifyTextNotPresent('supaya bisa mereset ulang sandi.', false)


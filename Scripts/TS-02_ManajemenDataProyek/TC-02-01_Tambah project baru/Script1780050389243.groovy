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

WebUI.setText(findTestObject('Project/Page_Log in - GiPM/input_Email'), 'Arnor@gmail.com')

WebUI.setEncryptedText(findTestObject('Project/Page_Log in - GiPM/input_Password'), 'yjcyc3Nku24=')

WebUI.click(findTestObject('Project/Page_Log in - GiPM/button_Log in'))

WebUI.click(findTestObject('Project/Page_Dashboard - GiPM/a_Projects'))

WebUI.click(findTestObject('Project/Page_- GiPM/label_Arnora'))

WebUI.click(findTestObject('Project/Page_- GiPM/label_ArnorDep'))

WebUI.click(findTestObject('Project/Page_- GiPM/label_ArnoraUser'))

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2'), 'Pengembangan sistem manajemen proyek berbasis App')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_2'), '05')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_3'), 'Pengembangan sistem manajemen proyek berbasis App untuk monitoring tugas, tiket, dan progres proyek.')

WebUI.click(findTestObject('Project/Page_- GiPM/input_Login - 21'))

WebUI.click(findTestObject('Project/Page_- GiPM/input_Logout - 3'))

WebUI.click(findTestObject('Project/Page_- GiPM/input_Edit profil - 6'))

WebUI.click(findTestObject('Project/Page_- GiPM/input_ganti password - 7'))

WebUI.click(findTestObject('Project/Page_- GiPM/input_CRUD manajemen user  role - 30'))

WebUI.click(findTestObject('Project/Page_- GiPM/input_CRUD Profil dan Identitas Desa - 13'))

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_4'), '120')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_5'), '8')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_7'), '500')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_10'), '15000000')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_9'), '300')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_13'), '5000000')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_14'), '120')

WebUI.setText(findTestObject('Project/Page_- GiPM/input_w-full border rounded px-3 py-2_15'), '50000')

WebUI.click(findTestObject('Project/Page_- GiPM/button_Simpan Project'))


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
import java.util.Arrays

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gipm.destroidmous.my.id/login')

WebUI.setText(findTestObject('Project/Page_Log in - GiPM/input_Email'), 'Arnor@gmail.com')

WebUI.setEncryptedText(findTestObject('Project/Page_Log in - GiPM/input_Password'), 'yjcyc3Nku24=')

WebUI.click(findTestObject('Project/Page_Log in - GiPM/button_Log in'))

WebUI.switchToWindowTitle('Dashboard - GiPM')

WebUI.click(findTestObject('Contract/Page_Dashboard - GiPM/span_Contracts'))

WebUI.selectOptionByValue(findTestObject('Contract/Page_- GiPM/select_Pilih User -AliArnoraArnorDepArnoraUserAr'), '4', 
    false)

WebUI.selectOptionByValue(findTestObject('Contract/Page_- GiPM/select_Pilih Project -Sistem Informasi Desa XSis'), '6', 
    false)

WebUI.click(findTestObject('Contract/Page_Dashboard - GiPM/div_GiPMArnoraPM MenuDashboardProjectsUsersContr'))

WebUI.switchToWindowTitle('- GiPM')


TestObject waktu = findTestObject(
    'Page_- GiPM/input_border rounded px-3 py-2 w-full_1'
)

WebUI.click(waktu)

def element = WebUI.findWebElement(waktu)

WebUI.executeJavaScript(
	"arguments[0].value='2026-06-10T11:30';",
	Arrays.asList(element)
)

WebUI.sendKeys(waktu, "061020261130A")

WebUI.click(findTestObject('Page_- GiPM/button_Tambah Kontrak'))



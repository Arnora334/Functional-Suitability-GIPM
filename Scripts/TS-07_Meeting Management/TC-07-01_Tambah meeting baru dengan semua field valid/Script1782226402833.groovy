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
import java.time.LocalDate
import java.time.format.DateTimeFormatter


WebUI.openBrowser('')

WebUI.navigateToUrl('https://gipm.destroidmous.my.id/login')

WebUI.setText(findTestObject('Page_Log in - GiPM/input_Email_1'), 'Arnor@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Log in - GiPM/input_Password_1'), 'yjcyc3Nku24=')

WebUI.click(findTestObject('Page_Log in - GiPM/button_Log in'))

WebUI.click(findTestObject('Page_Dashboard - GiPM/a_Meetings'))

WebUI.selectOptionByValue(findTestObject('Page_- GiPM/select_Pilih Project -Sistem Monitoring Inventar'), '23', false)

WebUI.setText(findTestObject('Page_- GiPM/input_border rounded px-3 py-2 w-full'), 'Sprint Review')

//// Isi tanggal hari ini
//String today = LocalDate.now().format(
//	DateTimeFormatter.ofPattern("MM/dd/yyyy")
//)
//
//TestObject waktu = findTestObject('Page_- GiPM/input_border rounded px-3 py-2 w-full_1')
//
//WebUI.setText(waktu, today)

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


//WebUI.setText(findTestObject('Page_- GiPM/input_border rounded px-3 py-2 w-full_1'), '2026-06-23T21:59')

WebUI.setText(findTestObject('Page_- GiPM/input_border rounded px-3 py-2 w-full_2'), 'client@test.com')

WebUI.setText(findTestObject('Page_- GiPM/textarea_border rounded px-3 py-2 w-full'), 'Progress sprint')

WebUI.setText(findTestObject('Page_- GiPM/textarea_border rounded px-3 py-2 w-full_1'), 'Hasil diskusi sprint')

WebUI.click(findTestObject('Page_- GiPM/button_Tambah Meeting'))

WebUI.verifyTextPresent('Monitoring Inventaris Berbasis Web', false)


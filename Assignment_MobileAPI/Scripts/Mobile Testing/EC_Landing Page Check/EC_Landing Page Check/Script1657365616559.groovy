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

Mobile.startApplication('C:\\Users\\095050\\Documents\\BootCamp Hacktiv8 x BFI\\KATALON\\Assignment\\Yusuf_Assignment03\\Assignment_MobileAPI\\APK\\ECommerce -SAMPLE-Android.apk', 
    true)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Landing Page/header_layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/trext header_layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/search header_layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/btn_recent layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/btn_category layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/btn_help layout'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/btn_Profile Layout'), 5)

Mobile.comment('dibawah ini untuk check object')

Mobile.verifyElementVisible(findTestObject('Landing Page/samsung galax_view'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/u17 usb-view'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/apple watch_view'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/mini digital speaker_view'), 5)

Mobile.swipe(300, 300, 500, 500)

Mobile.verifyElementVisible(findTestObject('Landing Page/led tv_view'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/dolce heels_view'), 5)

Mobile.verifyElementVisible(findTestObject('Landing Page/bracellet woman_view'), 5)


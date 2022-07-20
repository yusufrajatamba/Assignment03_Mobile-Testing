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

WebUI.callTestCase(findTestCase('Mobile Testing/EC_Landing Page Check/EC_Landing Page Check'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HELP/btn_help'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/how to order'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/payment'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/shipping'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/profile'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/contact us'), 5)

Mobile.tap(findTestObject('HELP/how to order'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/page how to order'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/page text how to order'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('HELP/payment'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/page how to order'), 5)

Mobile.verifyElementVisible(findTestObject('HELP/page text how to order'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('HELP/shipping'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('HELP/contact us'), 5)

Mobile.pressBack()

Mobile.pressBack()


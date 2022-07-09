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

Mobile.tap(findTestObject('Category/btn_category'), 5)

Mobile.tap(findTestObject('Category/btn_Fashions'), 5)

Mobile.tap(findTestObject('Category/bracelet'), 5)

Mobile.tap(findTestObject('Category/btn add to chart'), 5)

Mobile.setText(findTestObject('Category/text for gold'), '1', 5)

Mobile.tap(findTestObject('Category/btn_add for gold'), 5)

Mobile.tap(findTestObject('Category/check out for gold'), 5)

WebUI.callTestCase(findTestCase('Mobile Testing/Parent Folder for Checkout Page/CheckoutPage_for All'), [:], FailureHandling.STOP_ON_FAILURE)


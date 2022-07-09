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

Mobile.tap(findTestObject('Profile/btn_profile'), 5)

Mobile.tap(findTestObject('Profile/btn_edit'), 5)

Mobile.tap(findTestObject('Profile/btn_name'), 5)

Mobile.setText(findTestObject('Profile/set tex name'), 'Yusuf Raja Tamba', 5)

Mobile.tap(findTestObject('Profile/btn Ok'), 5)

Mobile.tap(findTestObject('Profile/btn_email'), 5)

Mobile.setText(findTestObject('Profile/Set text email'), 'yusuf.tamba@bfi.co.id', 5)

Mobile.tap(findTestObject('Profile/btn Ok'), 5)

Mobile.tap(findTestObject('Profile/btn_phone number'), 5)

Mobile.setText(findTestObject('Profile/set phone number'), '+628123455789', 5)

Mobile.tap(findTestObject('Profile/btn oke phone number'), 5)

Mobile.tap(findTestObject('Profile/btn address'), 5)

Mobile.setText(findTestObject('Profile/set addresss'), 'Jalan Curug Garden No B3/40', 5)

Mobile.tap(findTestObject('Profile/btn Ok'), 5)

Mobile.tap(findTestObject('Profile/back now'), 5)

Mobile.verifyElementText(findTestObject('Profile/check name'), 'Yusuf Raja Tamba')

Mobile.verifyElementText(findTestObject('Profile/check email'), 'yusuf.tamba@bfi.co.id')

Mobile.verifyElementText(findTestObject('Profile/phone check'), '+628123455789')

Mobile.verifyElementText(findTestObject('Profile/address check'), 'Jalan Curug Garden No B3/40')


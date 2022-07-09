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

Mobile.verifyElementVisible(findTestObject('Shop from landing page/shopping cart view'), 5)

Mobile.tap(findTestObject('Checkout Page/btn_checkout'), 5)

Mobile.verifyElementVisible(findTestObject('Checkout Page/frame layout'), 10)

Mobile.setText(findTestObject('Checkout Page/name text'), 'Yusuf Raja Tamba', 5)

Mobile.setText(findTestObject('Checkout Page/gmail text'), 'yusuf.tamba@bfi.co.id', 5)

Mobile.setText(findTestObject('Checkout Page/phone number'), '082276471331', 5)

Mobile.setText(findTestObject('Checkout Page/addres text'), 'Jalan Curug Garden B3/40', 5)

Mobile.selectListItemByLabel(findTestObject('Checkout Page/shipping'), 'TNT Express', 5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Checkout Page/comment area (1)'), 'Harap di Packing dengan Baik.', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Checkout Page/btn_proses Checkout'), 5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Checkout Page/aleert proses checkout'), 30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Checkout Page/btn_yes'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Checkout Page/congratulation alert'), 'Congratulation', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10)


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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open browser
WebUI.openBrowser("https://www.saucedemo.com/")
WebUI.maximizeWindow()


//=================================================================================================//
// // 1. Check when all fields are blank
WebUI.setText(findTestObject('Object Repository/UsernameObject'), "")
WebUI.setText(findTestObject('Object Repository/PasswordObject'), "")
WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
String errormessage1 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
WebUI.verifyEqual(errormessage1, "Epic sadface: Username is required") 
WebUI.delay(2)

////=================================================================================================//
//// 2. Check when username fields is blank and password field is incorrect
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "test2")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage2 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage2, "Epic sadface: Username is required")
//WebUI.delay(2)


//=================================================================================================//
//// 3. Check when username fields is incorrect and password field is blank
//WebUI.refresh()
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "test3")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage3 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage3, "Epic sadface: Password is required")
//WebUI.delay(2)

//=================================================================================================//
//// 4. Check when username fields & password field are incorrect
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "test4")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "test4")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage4 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage4, "Epic sadface: Username and password do not match any user in this service")
//WebUI.delay(2)

////=================================================================================================//
//// 5. Check when username fields is correct & password field is incorrect
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "standard_user")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "test5")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage5 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage5, "Epic sadface: Username and password do not match any user in this service")
//WebUI.delay(2)

////=================================================================================================//
//// 6. Check when username fields is incorrect & password field is correct
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "test6")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "secret_sauce")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage6 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage6, "Epic sadface: Username and password do not match any user in this service")
//WebUI.delay(2)

////=================================================================================================//
//// 7. Check when username fields & password are correct - standard_user
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "standard_user")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "secret_sauce")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Image_standard_user'), 10)
//WebUI.delay(2)
//WebUI.back()

////=================================================================================================//
//// 8. Check when username fields & password are correct - locked_out_user
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "locked_out_user")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "secret_sauce")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//String errormessage8 = WebUI.getText(findTestObject('Object Repository/MessageObject'))
//WebUI.verifyEqual(errormessage8, "Epic sadface: Sorry, this user has been locked out.")
//WebUI.delay(2)
//WebUI.back()

////=================================================================================================//
//// 9. Check when username fields & password are correct - problem_user
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "problem_user")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "secret_sauce")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//WebUI.verifyElementPresent(findTestObject('Object Repository/Image_problem_user'), 10)
//WebUI.delay(2)
//WebUI.back()

////=================================================================================================//
//// 10. Check when username fields & password are correct - performance_glitch_user
//WebUI.setText(findTestObject('Object Repository/UsernameObject'), "performance_glitch_user")
//WebUI.setText(findTestObject('Object Repository/PasswordObject'), "secret_sauce")
//WebUI.click(findTestObject('Object Repository/LoginButtonObject'))
//WebUI.waitForPageLoad(10, FailureHandling.STOP_ON_FAILURE)
//WebUI.delay(2)
//WebUI.back()


//=================================================================================================//
//Close browser	
//WebUI.closeBrowser()
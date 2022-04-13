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

WebUI.setText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ccef60'), 
    'nlaylyn@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/div_Facebook helps you connect and share wi_33762e'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook  log in or sign up/input_Facebook helps you connect and share _ab63fc'), 
    '7bGeI+pDonic16ppCvl4bw==')

WebUI.click(findTestObject('Object Repository/Page_Facebook  log in or sign up/button_Log In'))

WebUI.navigateToUrl('https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ5ODM0Mzc3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D')

WebUI.setText(findTestObject('Object Repository/Page_Log in to Facebook/input_Log in to Facebook_email'), '085257416373')

WebUI.click(findTestObject('Object Repository/Page_Log in to Facebook/a_Forgotten password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    'nlaylyn@yahoo.com')

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'))

WebUI.setText(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/input_Please enter your email address or mo_025e92'), 
    'asiyahlailin@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_Forgotten Password  Cant Log In  Facebook/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Please check your emails for a messag_6d8c97'), '689515')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Hide'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new_1'), '59R7O4G0nQ7G7YH1QzMuAg==')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'), '')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Hide'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new_1'), '7bGeI+pDonic16ppCvl4bw==')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

'negatif'
WebUI.setText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'), 'Lailin3103')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new'))

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Hide'))

'positif'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Facebook/input_Choose a new password_password_new_1'), 'UCyxKNRv5ULjDyvMKwguMeT/U/n77YgI')

WebUI.click(findTestObject('Object Repository/Page_Facebook/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/span_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_(20) Facebook/span_Selesai'))

WebUI.closeBrowser()


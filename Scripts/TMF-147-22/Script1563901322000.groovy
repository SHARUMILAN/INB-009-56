import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://qatrunkapps.sqlpower.ca/')

WebUI.setText(findTestObject('Page_Login - Liferay/input_Email Address__58_login'), '1334325_cimatest3@org.com')

WebUI.setEncryptedText(findTestObject('Page_Login - Liferay/input_Password__58_password'), 'P9ET2sDE0SE=')

WebUI.click(findTestObject('Page_Login - Liferay/button_Sign In'))

WebUI.click(findTestObject('Page_Home - Liferay/span_New Request'))

WebUI.click(findTestObject('Page_Login - Liferay/button4'))

WebUI.click(findTestObject('Page_Login - Liferay/button5'))

WebUI.click(findTestObject('Page_Login - Liferay/button6'))

WebUI.switchToWindowTitle('Table of Schedules')

WebUI.click(findTestObject('Page_Table of Schedules/a_Application Form'))

not_run: WebUI.switchToWindowTitle('Table of Schedules')

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button2'))

WebUI.selectOptionByValue(findTestObject('Page_Login - Liferay/button3'), 'Official liquidation', true)

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button13'))

not_run: WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Page_Login - Liferay/button13'), 'CAIS Kingdon Offshore Ltd. [#580554-24]', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Login - Liferay/button7'))

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Login - Liferay/Upload File'))

not_run: WebUI.delay(2)

WebUI.uploadFile(findTestObject('Page_Login - Liferay/Upload File'), RunConfiguration.getProjectDir() + '/test-files/Job Application/JobOffer (1).html')

WebUI.delay(2)

not_run: WebUI.uploadFile(findTestObject('Page_Login - Liferay/Upload File'), '')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Corporate Strategy/textarea'), 'Our mission is to empower every person and every organization on the planet to achieve more." ... Microsoft\'s mission statement expresses their belief in what people make possible. These beliefs and values are translated directly into their products and corporate culture.')

not_run: WebUI.click(findTestObject(null))

not_run: FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')

not_run: WebUI.verifyMatch(FilePath, 'C:\\fakepath\\Desert.jpg', false)

WebUI.click(findTestObject('Page_Login - Liferay/button8'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button9'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button11'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button10'))

WebUI.click(findTestObject('Page_Login - Liferay/button12'))

WebUI.uploadFile(findTestObject('Page_Login - Liferay/Button10'), RunConfiguration.getProjectDir() + '/test-files/Job Application/JobOffer (3).html')

WebUI.click(findTestObject('Page_Login - Liferay/button9'))

WebUI.uploadFile(findTestObject('Page_Login - Liferay/Button11'), RunConfiguration.getProjectDir() + '/test-files/Job Application/JobOffer (2).html')

WebUI.click(findTestObject('Page_Login - Liferay/button15'))

WebUI.click(findTestObject('Page_Login - Liferay/button16'))

WebUI.click(findTestObject('Page_Login - Liferay/button17'))

not_run: WebUI.click(findTestObject('Page_Login - Liferay/button10'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Corporate Strategy/textarea'), 'Our mission is to empower every person and every organization on the planet to achieve more." ... Microsoft\'s mission statement expresses their belief in what people make possible. These beliefs and values are translated directly into their products and corporate culture.')

not_run: WebUI.click(findTestObject('Object Repository/Page_Corporate Strategy/button1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Corporate Strategy/body_ProX_CorporateSC_2019-04-09'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Corporate Strategy/textarea_1'), 'Vision statements are future-based and meant to inspire and give direction to employees of the company rather than customers. ... "Your vision statement is where your company is going – it\'s all about your future.')

not_run: WebUI.click(findTestObject('Page_Corporate Scorecard/button3'))

not_run: int count


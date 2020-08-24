package org.automation.chatbot.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.automation.chatbot.base.DriverInstance;
import org.automation.chatbot.pages.ChatBot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



@SuppressWarnings("unused")

public class Testcasese_Validate_Chat_Bot extends DriverInstance
{
	
	@BeforeSuite
	public void serUpSuite() {
		//excel = new ExcelDataProvider();
		//config = new ConfigDataProvider();
		
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Chat_Bot.html");
		
        // Create object of ExtentReports class- This is main class which will create report
    ExtentReports extent = new ExtentReports();
    
        // attach the reporter which we created in Step 1
    extent.attachReporter(reporter);
    ExtentTest logger=extent.createTest("ChatBot_Download_MP");    
        // call createTest method and pass the name of TestCase- Based on your requirement
    logger.log(Status.FAIL, "DownloadLink11");

	}
	@Test (priority=0)
	public void ChatBot_test_Greeting_Message() throws Exception
	{
		ChatBot bot = new ChatBot(driver);
		bot.clickonboticon();
		Thread.sleep(2000);
		bot.clickonGetStarted();
		Thread.sleep(2000);
		driver.switchTo().frame("avaamoIframe");
		bot.clickonStartOver();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_Greeting();
		Thread.sleep(2000);
		bot.clickon_reset();
	}
	
	@Test (priority=1)
	public void ChatBot_Download_MP() throws Exception
	{
		ChatBot bot = new ChatBot(driver);
		bot.clickonboticon();
		Thread.sleep(2000);
		bot.clickonGetStarted();
		Thread.sleep(2000);
		driver.switchTo().frame("avaamoIframe");
		bot.clickonStartOver();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_DMP();
		Thread.sleep(2000);
		bot.clickon_reset();
	}

	@Test (priority=2)
	public void ChatBot_Validate_Test_Bot() throws Exception
	{
		ChatBot bot = new ChatBot(driver);
		bot.clickonboticon();
		Thread.sleep(2000);
		bot.clickonGetStarted();
		Thread.sleep(2000);
		driver.switchTo().frame("avaamoIframe");
		bot.clickonStartOver();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_Test_Bot();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_Test_Bot_Enterdetails();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_Test_Bot_Submit();
		Thread.sleep(2000);
		bot.clickon_reset();
	}
	@Test (priority=1)
	public void ChatBot_Validate_New_Test() throws Exception
	{
		ChatBot bot = new ChatBot(driver);
		bot.clickonboticon();
		Thread.sleep(2000);
		bot.clickonGetStarted();
		Thread.sleep(2000);
		driver.switchTo().frame("avaamoIframe");
		bot.clickonStartOver();
		Thread.sleep(2000);	
		bot.clickon_Bot_Text_Area_New_Test();
		Thread.sleep(2000);
		driver.switchTo().frame("webview_frame");
		bot.clickonGoogle();
		Thread.sleep(2000);
		bot.clickonClose();
		Thread.sleep(2000);
		bot.clickon_reset();
	}
	
}

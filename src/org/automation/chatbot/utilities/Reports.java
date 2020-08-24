package org.automation.chatbot.utilities;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports 
{

	@Test
	public void loginTest() throws IOException
	{    
            // Create Object of ExtentHtmlReporter and provide the path where you want to generate the report 
            // I used (.) in path where represent the current working directory
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/chatbot.html");
		
            // Create object of ExtentReports class- This is main class which will create report
	    ExtentReports extent = new ExtentReports();
	    
            // attach the reporter which we created in Step 1
	    extent.attachReporter(reporter);
	    
            // call createTest method and pass the name of TestCase- Based on your requirement
	    ExtentTest logger=extent.createTest("ChatBot_Download_MP");
	    ExtentTest logger1=extent.createTest("");
	    ExtentTest logger11=extent.createTest("ChatBot_test_Greeting_Message");
	    //ExtentTest logger=extent.createTest("");
	    ExtentTest logger111=extent.createTest("ChatBot_Validate_Test_Bot");
	    //ExtentTest logger=extent.createTest("");
	    ExtentTest logger1111=extent.createTest("ChatBot_Validate_New_Test");
	    // log method will add logs in report and provide the log steps which will come in report
	   logger1111.log(Status.INFO, "Chat bot display");
	   
	   logger1111.log(Status.PASS, "ChatBot_Download_MP");
	   
	   logger1111.log(Status.PASS, "ChatBot_test_Greeting_Message");

	   logger1111.log(Status.PASS, "ChatBot_Validate_Test_Bot");

	   logger1111.log(Status.PASS, "ChatBot_Validate_New_Test");

            // This will add another test in report
	    extent.flush();
	    	
	}
	
}
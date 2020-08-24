package org.automation.chatbot.base;

import org.automation.chatbot.utilities.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DriverInstance {
	
	public WebDriver driver;
	

	@BeforeSuite
	public void serUpSuite() {
		//excel = new ExcelDataProvider();
		//config = new ConfigDataProvider();
		
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter("./Reports/Chat_Bot1.html");
		
        // Create object of ExtentReports class- This is main class which will create report
    ExtentReports extent = new ExtentReports();
    
        // attach the reporter which we created in Step 1
    extent.attachReporter(reporter);
    ExtentTest logger=extent.createTest("ChatBot_Download_MP");    
        // call createTest method and pass the name of TestCase- Based on your requirement
    logger.log(Status.FAIL, "DownloadLink11");

	}

	
	@BeforeMethod
	public void initiateDriverInstance() throws Exception
	{
		if(utilities.fetchPropertyValue("browerName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(utilities.fetchPropertyValue("browerName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/gekodriver.exe");
			driver = new ChromeDriver(); 
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.get(utilities.fetchPropertyValue("applicationURL").toString());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
}	
	
	
	//@AfterMethod
	//public void closeDriverInstance()
	//{
	//	driver.quit();
	//}

	//@AfterMethod
	/*public void tearDownMethod(ITestresult result throws IOExceptoin)
	{
		if(result.getStatus()==ITestResult.FAILURE){
			Helper.captureScreenshot(driver);
		}
		report.flush();
	}
*/


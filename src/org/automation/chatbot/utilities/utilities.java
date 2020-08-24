package org.automation.chatbot.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utilities {
	
	public static Object fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key);
	}

	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream file = new FileInputStream("./Config/elements.properties");
		Properties property = new Properties();
		property.load(file);
		return property.get(key).toString();
	}
	public class Utility 
	{
	 
		public String getScreenshot(WebDriver driver)
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File src=ts.getScreenshotAs(OutputType.FILE);
			
			String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
			
			File destination=new File(path);
			
			try 
			{
				FileUtils.copyFile(src, destination);
			} catch (IOException e) 
			{
				System.out.println("Capture Failed "+e.getMessage());
			}
			
			return path;
		}
		
	}
}

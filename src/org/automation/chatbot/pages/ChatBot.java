package org.automation.chatbot.pages;

import org.automation.chatbot.utilities.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.FileWriteMode;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChatBot {

//	private WebDriver driver;
	//public WeatherUI(WebDriver driver)
//	{
	//	this.driver = driver;
	//}
	//public void clickonMenuBar() throws Exception
//	{
	//	driver.findElement(By.className(utilities.fetchLocatorValue("weather_menubardots_class"))).click();
	//}
	
	
	
WebDriver driver;
	public ChatBot(WebDriver driver)
	{
		this.driver = driver;
	}
	//public void clickonboticon() throws Exception
	
	public void clickonboticon() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("avaamo_icon"))).click();
	}

	public void clickonGetStarted() throws Exception
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("get_Started"))).click();
	}
	public void clickonStartOver() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("start_over"))).click();
			
	}
	public void clickonDownloadmp() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("download_mp"))).click();
			
	}
	public void clickonDownloadLink() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("download_link"))).click();
			
	}
	public void clickon_Bot_Text_Area_Greeting() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys("Good Morning");
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys(Keys.ENTER);	
	}
	public void clickon_Bot_Text_Area_DMP() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys("I want to buy a new policy");
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys(Keys.ENTER);	
		driver.findElement(By.xpath("//a[contains(.,'Download') and @type='web_page']")).click();

	}
	public void clickon_Send() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("send"))).click();
			
	}
	public void clickon_reset() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys("reset");
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys(Keys.ENTER);	
			
	}
	/*
	driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys("Good Morning");
	driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys(Keys.ENTER);
	Thread.sleep(5000);
	//driver.close();
	//driver.findElement(By.xpath("//div[@class=('//div[@class=('ptr locale-trans send')]")).click();
	driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys("I want to buy a new policy");
	driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys(Keys.ENTER);
	//driver.close();	*/

	
	public void clickon_Bot_Text_Area_Test_Bot() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys("Test Bot");
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys(Keys.ENTER);
		
	}
	
	public void clickon_Bot_Text_Area_Test_Bot_Enterdetails() throws IOException 
	{
	
	//driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_inside_form_full_name"))).sendKeys("Durga Prasad");
			driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_inside_form_address"))).sendKeys("Address");
	}		
	
	public void clickon_Bot_Text_Area_Test_Bot_Submit() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_inside_submit"))).click();
		
	}
	public void clickon_Bot_Text_Area_New_Test() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys("New Test");
		driver.findElement(By.xpath(utilities.fetchLocatorValue("bot_text_area"))).sendKeys(Keys.ENTER);	
	}
	
	public void clickonGoogle() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("Google"))).click();
		driver.findElement(By.xpath(utilities.fetchLocatorValue("get_Close"))).click();
			
	}
	public void clickonClose() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("get_Close"))).click();
			
	}
	public void clickonCall() throws IOException 
	{
		driver.findElement(By.xpath(utilities.fetchLocatorValue("Call"))).click();
			
	}	
}
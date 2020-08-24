package org.automation.chatbot.testcases;

import java.util.List;

import org.automation.chatbot.utilities.utilities;
import org.checkerframework.checker.units.qual.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.runtime.model.Timestamp;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBot_Ira {

	@SuppressWarnings("unused")
	public static <IWait, IWebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://c6.avaamo.com/web_channels/444588bc-92fe-477f-87c1-88a92946346a/demo.html?theme=avm-messenger&banner=true&demo=true&banner_text=%20&banner_title=This%20is%20how%20the%20chat%20agent%20shows%20up");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='avaamo__icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Get Started')]")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("avaamoIframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Start Over')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(.,'Download Motor Policy')]")).click();
		Thread.sleep(2000);
		//CLick on Download link
		driver.findElement(By.xpath("//a[contains(.,'Download') and @type='web_page']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys("Good Morning");
		driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys("I want to buy a new policy");
		driver.findElement(By.xpath("//div[@class=('textarea-wrap alignItemsCenter')]//textarea")).sendKeys(Keys.ENTER);
	
	}

}

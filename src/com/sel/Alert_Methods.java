package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Methods {
	
public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("timerAlertButton")).click();
		
        WebDriverWait w=new WebDriverWait(driver, 6);
        w.until(ExpectedConditions.alertIsPresent());
		
//		FluentWait f=new FluentWait(driver);
//		f.withTimeout(7, TimeUnit.SECONDS);
//		f.pollingEvery(10, TimeUnit.MILLISECONDS);
//		f.ignoring(Exception.class);
//		f.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

	//THIS IS THE CODE TO HANDLE ALERTS IN SELENIUM
		
		
}

}

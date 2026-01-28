package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecute {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/dashboard.xhtml");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement browser = driver.findElement(By.xpath("//span[text()='Browser']"));
		
		js.executeScript("arguments[0].click()", browser);
		
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		js.executeScript("arguments[0].setAttribute('value','hello')", textbox);
		
		WebElement inter = driver.findElement(By.xpath("//span[text()='Interview Preparation']"));
		
		WebElement label = driver.findElement(By.xpath("//label[text()='2022 - All Rights Reserved']"));
		
		js.executeScript("arguments[1].scrollIntoView(true)", inter ,label );
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(false)", textbox);
		
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;')", textbox);

}
}
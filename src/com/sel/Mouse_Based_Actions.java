package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Set;

public class Mouse_Based_Actions {
	
public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		
		ch.addArguments("--version");
		
		WebDriver driver=new ChromeDriver(ch);
			
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();

		Actions a=new Actions(driver);
		
		WebElement best = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		
		a.contextClick(best).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> set = driver.getWindowHandles();
		for (String id : set) {
			String title = driver.switchTo().window(id).getTitle();
			if (title.contains("Best")) {
				driver.switchTo().window(id).close();
			}
		}
		
		
}
}
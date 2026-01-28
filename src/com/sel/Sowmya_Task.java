package com.sel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sowmya_Task {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://magento.softwaretestingboard.com/");
		
		d.manage().window().maximize();

	    d.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		
		d.findElement(By.id("email")).sendKeys("sowmya.revathiraghavan@gmail.com");
		
		d.findElement(By.id("pass")).sendKeys("Srujan@14");
		
		d.findElement(By.id("send2")).click();
		
		Thread.sleep(2500);
		
		d.findElement(By.xpath("(//a[@role='menuitem'])[2]")).click();
		
		d.findElement(By.xpath("//a[text()='Hoodies & Sweatshirts']")).click();
		
        Thread.sleep(3000);
		
		d.findElement(By.xpath("(//div[text()='S'])[7]")).click();
		
		d.findElement(By.xpath("(//div[contains(@class,'swatch-option color')])[19]")).click();
		
		d.findElement(By.xpath("(//button[@title='Add to Cart'])[7]")).click();
		
		Thread.sleep(1500);
		
		d.findElement(By.xpath("//a[@class='action showcart']")).click();
		
		d.findElement(By.xpath("//button[text()='Proceed to Checkout']")).click();
		
		Thread.sleep(10000);
		
		d.findElement(By.xpath("(//input[@class='radio'])[1]")).click();
		
		d.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
		
		WebElement order = d.findElement(By.xpath("(//input[@type='checkbox']//following::button[@type='submit'])[2]"));
//
//		boolean b = order.isEnabled();
//		System.out.println(b);
//		
		order.submit();
		
		
}
	
	

}

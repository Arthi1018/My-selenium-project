package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaf {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node017si7fofvy3rd1ew8xa52ebcc5115593.node0");
		
		driver.manage().window().maximize();
		
		WebElement single = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		
		driver.switchTo().frame(single);
		
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		
		System.out.println(list.size());

}
}
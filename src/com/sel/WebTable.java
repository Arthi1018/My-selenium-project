package com.sel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://courses.letskodeit.com/practice");
		
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		System.out.println("================================");
		
		List<WebElement> list2 = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		Iterator<WebElement> iterator = list2.iterator();
		while (iterator.hasNext()) {
			WebElement element = iterator.next();
			System.out.println(element.getText());
		}
		System.out.println("====================================");
		
		List<WebElement> list3 = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		for (int i = 0; i < list3.size(); i++) {
			WebElement element = list3.get(i);
			System.out.println(element.getText());
		}
		
		System.out.println("==========================");
		
		WebElement element = driver.findElement(By.xpath("//table/tbody/tr[3]/td[3]"));
		System.out.println(element.getText());
		
		System.out.println("=============================");
		List<WebElement> list4 = driver.findElements(By.tagName("th"));
		for (WebElement webElement : list4) {
			System.out.println(webElement.getText());
		}
		
		
}
}
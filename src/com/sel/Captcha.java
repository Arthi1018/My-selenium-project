package com.sel;

import java.util.Collections;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Captcha {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arthiha\\eclipse-workspace\\Selenium\\Cd1\\chromedriver.exe");
		
		ChromeOptions ch=new ChromeOptions();
		
		ch.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
		WebDriver driver=new ChromeDriver(ch);
		
		driver.get("https://adactinhotelapp.com/Register.php");
		
		driver.manage().window().maximize();
		
		String str = JOptionPane.showInputDialog("Enter the captcha for further process");
		
		driver.findElement(By.name("captcha")).sendKeys(str);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

}
}
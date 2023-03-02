package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paithiyam {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
	WebDriver DS = new ChromeDriver();
	
	DS.manage().window().maximize();
	
	DS.get("https://demo.automationtesting.in/Alerts.html");
	
	WebElement ST = DS.findElement(By.xpath("//button[@onclick='alertbox()']"));
	
	ST.click();
	
	DS.switchTo().alert().accept();
	
	WebElement ST1 = DS.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	ST1.click();
	
	WebElement ST2 = DS.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	ST2.click();
	
		
		
	}

}

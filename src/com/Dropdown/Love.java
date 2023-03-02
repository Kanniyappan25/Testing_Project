package com.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Love {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
		WebDriver SD = new ChromeDriver();
		
		SD.manage().window().maximize();
		
		SD.get("https://letcode.in/dropdowns");
		WebElement News = SD.findElement(By.id("fruits"));
		
		Select s = new Select(News);
		s.selectByIndex(2);
		
		
		
		
		
	}
}

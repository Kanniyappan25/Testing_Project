package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");

		WebDriver SK = new ChromeDriver();

		SK.get("https://www.Facebook.com/");

		WebElement Vj = SK.findElement(By.id("email"));

		Vj.sendKeys("9791200397");

		WebElement sk = SK.findElement(By.name("pass"));
		
		
		WebElement findElement = SK.findElement(By.name("login"));
		
		findElement.submit();
		
		
	}

}

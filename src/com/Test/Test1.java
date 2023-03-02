package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	
	dr.manage().window().maximize();
	
	dr.get("https://www.facebook.com/");
	
	String title = dr.getTitle();
	System.out.println("Title:"+ title);
	
	String currentUrl = dr.getCurrentUrl();
	System.out.println("currentUrl:"+currentUrl);
}
}

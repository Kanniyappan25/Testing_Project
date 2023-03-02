package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
		WebDriver DS = new ChromeDriver();
		
	DS.get("https://www.facebook.com/");	
	
	TakesScreenshot ts = (TakesScreenshot)DS;	
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File loct = new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\FB.png");
	
	FileUtils.copyFile(src, loct);
		
		
		
		
		
	}
	
	
	
	
}

package com.Dropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollup {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
		WebDriver DS = new ChromeDriver();
		
		DS.manage().window().maximize();
		
		DS.get("https://www.myntra.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor)DS;
		
		Js.executeScript("window.scrollBy(0,6000)");
		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot)DS;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File loct = new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Myntra.png");
		
		FileUtils.copyFile(src, loct);
		
		WebElement XP = DS.findElement(By.xpath("//p[text()=' USEFUL LINKS ']"));
		
		Js.executeScript("arguments[0].scrollIntoView();", XP);
		
		TakesScreenshot ts1 = (TakesScreenshot)DS;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		
		File loct1 = new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Myntra.1.png");
		
		FileUtils.copyFile(src1, loct1);
		
	System.out.println("DONE");
		
	}

}

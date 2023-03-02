package com.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_SK {



		public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
		WebDriver KK = new ChromeDriver();
		
		KK.manage().window().maximize();
		
		KK.get("https://demo.automationtesting.in/Frames.html");
		
		KK.findElement(By.partialLinkText("Iframe with in ")).click();

		WebElement iframe1 = KK.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		
		KK.switchTo().frame(iframe1);
		
		WebElement iframe2 = KK.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		KK.switchTo().frame(iframe2);
		
		Thread.sleep(5000);
		
		KK.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Everyone");
		KK.switchTo().defaultContent();
		
		Thread.sleep(5000);
		
		KK.findElement(By.linkText("Single Iframe")).click();

		Thread.sleep(5000);
		
		KK.findElement(By.linkText("Home")).click();
		
		System.out.println("Process Done");
	}
	}



package com.Dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame_DS {
	





			public static void main(String[] args) {
				
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
			
			WebDriver DS = new ChromeDriver();
			
			DS.manage().window().maximize();
			
			DS.get("https://demo.automationtesting.in/Frames.html");
			
			DS.findElement(By.partialLinkText("Iframe with in ")).click();

			WebElement iframe1 = DS.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
			
			DS.switchTo().frame(iframe1);
			
			WebElement iframe2 = DS.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
			DS.switchTo().frame(iframe2);
			
			DS.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi Everyone");
			DS.switchTo().defaultContent();
			
			DS.findElement(By.linkText("Single Iframe")).click();

			DS.findElement(By.linkText("Home")).click();
			
			System.out.println("Process Done");
		}
		}


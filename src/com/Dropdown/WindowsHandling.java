package com.Dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");

		WebDriver KK = new ChromeDriver();

		Actions ac = new Actions(KK);

		Robot r = new Robot();

		KK.manage().window().maximize();

		KK.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		KK.get("https://www.amazon.in/");

		WebElement bs = KK.findElement(By.linkText("Best Sellers"));

		ac.moveToElement(bs).perform();
		ac.contextClick(bs).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Done");

		WebElement m = KK.findElement(By.linkText("Mobiles"));

		ac.moveToElement(m).perform();
		ac.contextClick(m).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Done");

		WebElement ts = KK.findElement(By.linkText("Today's Deals"));

		ac.moveToElement(ts).perform();
		ac.contextClick(ts).perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("Done");
		
		String g = KK.getWindowHandle();
		
		Set<String> ss = KK.getWindowHandles();
		
		for(String s : ss) {
			
		String title =	KK.switchTo().window(s).getTitle();
			System.out.println(title);
		}}}
		
		//String re = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
	//for (String s1 : ss) {
		
		//if (KK.switchTo().window(s1).getTitle().equals(re)) {
			//break;


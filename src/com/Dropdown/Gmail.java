package com.Dropdown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		
		WebDriver Mail = new ChromeDriver();
		Mail.manage().window().maximize();
		JavascriptExecutor J = (JavascriptExecutor) Mail;
		Mail.get("https://accounts.google.com/signup/v2/webcreateaccount?biz=false&cc=IN&continue=https%3A%2F%2Faccounts.google.com%2F&dsh=S487090959%3A1669018933423439&flowEntry=SignUp&flowName=GlifWebSignIn&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=ARgdvAvJ3J8qoQLz3ttRMZ_7FiOSslOU_osv3og_GNUWfMYPzG5qGMNuWE7tedTu_YPM-rZ00Hbk_g");
		J.executeScript("document.getElementById('firstName').value='Paithiyam';");
		J.executeScript("document.getElementById('lastName').value='KS';");
		J.executeScript("document.getElementById('username').value='paithiyamks1825';");
		
		
	}
}

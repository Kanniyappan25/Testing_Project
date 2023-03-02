package com.project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Adactin {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91979\\eclipse-workspace\\SK_sle\\Driver\\chromedriver.exe");
		WebDriver vj = new ChromeDriver();
		vj.manage().window().maximize();
		vj.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		vj.get("https://adactinhotelapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) vj;

		File src1 = ((TakesScreenshot) vj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,
				new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Mini_Project.png"));
		System.out.println("Home Page ScreenShot Taken");

		vj.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/form/table/" + "tbody/tr[2]/td[2]/input"))
				.sendKeys("kanniyappan1825");

		vj.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/" + "form/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("Karthik.1");
		vj.findElement(By.id("login")).click();
		
		File src2 = ((TakesScreenshot) vj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2,
				new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Mini_Project_Login.png"));
		System.out.println("Login Successful ScreenShot Taken");


		WebElement loc = vj.findElement(By.id("location"));
		Select loc1 = new Select(loc);
		loc1.selectByIndex(8);

		WebElement loc2 = vj.findElement(By.id("hotels"));
		Select loc3 = new Select(loc2);
		loc3.selectByIndex(3);

		WebElement loc4 = vj.findElement(By.id("room_type"));
		Select loc5 = new Select(loc4);
		loc5.selectByIndex(2);

		WebElement loc6 = vj.findElement(By.id("room_nos"));
		Select loc7 = new Select(loc6);
		loc7.selectByIndex(1);

		js.executeScript("document.getElementById('datepick_in').value='24/02/2023';");
		js.executeScript("document.getElementById('datepick_out').value='25/02/2023';");

//		vj.findElement(By.id("datepick_in")).sendKeys("06/12/2022");
//		vj.findElement(By.id("datepick_out")).sendKeys("06/12/2022");

		WebElement loc8 = vj.findElement(By.id("adult_room"));
		Select loc9 = new Select(loc8);
		loc9.selectByIndex(2);

		WebElement loc10 = vj.findElement(By.id("child_room"));
		Select loc11 = new Select(loc10);
		loc11.selectByIndex(1);
	
		File src3 = ((TakesScreenshot) vj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3,
				new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Mini_Project_Detail.png"));
		System.out.println("Details Entry ScreenShot Taken");

		vj.findElement(By.id("Submit")).click();
		vj.findElement(By.id("radiobutton_0")).click();
		vj.findElement(By.id("continue")).click();
		vj.findElement(By.id("first_name")).sendKeys("Kanniyappan");
		vj.findElement(By.id("last_name")).sendKeys("Karthik");
		vj.findElement(By.id("address")).sendKeys("CHENNAI");
		vj.findElement(By.id("cc_num")).sendKeys("3216549873216549");

		WebElement loc12 = vj.findElement(By.id("cc_type"));
		Select loc13 = new Select(loc12);
		loc13.selectByIndex(3);

		WebElement loc14 = vj.findElement(By.id("cc_exp_month"));
		Select loc15 = new Select(loc14);
		loc15.selectByIndex(11);

		WebElement loc16 = vj.findElement(By.id("cc_exp_year"));
		Select loc17 = new Select(loc16);
		loc17.selectByIndex(12);

		vj.findElement(By.id("cc_cvv")).sendKeys("123");

	
		File src4 = ((TakesScreenshot) vj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4,
				new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Mini_Project_Basic_Detail.png"));
		System.out.println("Basic Details Entry ScreenShot Taken");

		vj.findElement(By.id("book_now")).click();
		vj.findElement(By.id("my_itinerary")).click();

		vj.findElement(By.xpath("//*[@id=\"check_all\"]")).click();
	
		File src5 = ((TakesScreenshot) vj).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src5,
				new File("C:\\Users\\91979\\eclipse-workspace\\SK_sle\\SS\\Mini_Project_Room_Selected.png"));
		System.out.println("Basic Room Selected ScreenShot Taken");

		vj.findElement(By.id("logout")).click();
		System.out.println("Hotel Room Booking is successful... :)");

	
}
























//vj.findElement(By.linkText("New User Register Here")).click();
//vj.findElement(By.name("username")).sendKeys("VijaySekar");
//vj.findElement(By.name("password")).sendKeys("Vijay@123");
//vj.findElement(By.name("re_password")).sendKeys("Vijay@123");
//vj.findElement(By.name("full_name")).sendKeys("Vijay Unguessable");
//vj.findElement(By.name("email_add")).sendKeys("Vijay123@gmail.com");
//Scanner vj1 = new Scanner(System.in);
//String capture = vj1.nextLine();
//vj.findElement(By.name("captcha")).sendKeys(capture);
//vj.findElement(By.id("tnc_box")).click();
//WebElement sub = vj.findElement(By.id("Submit"));
//sub.submit();


}

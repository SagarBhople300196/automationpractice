package day14keybordops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardops2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter url
		driver.get("https://demo.actitime.com/login.do");
		//login in actitime application using enter key
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		
		
		

	}

}

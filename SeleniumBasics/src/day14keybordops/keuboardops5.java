package day14keybordops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keuboardops5 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		//to enter required application URL 
	     driver.get("https://www.flipkart.com/");


			// using Escape of keyboard to avoid login popup
			WebElement element = driver.findElement(By.xpath("//body"));
			element.sendKeys(Keys.ESCAPE);
			
			Thread.sleep(1500);
			
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		
			
	}

}

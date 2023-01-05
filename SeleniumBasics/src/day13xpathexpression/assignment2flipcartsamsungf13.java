package day13xpathexpression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2flipcartsamsungf13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_samsung");
		
		
		WebElement price2 = driver.findElement(By.xpath("//div[div[div[a[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']]]]/div[1]/div[3]/div[1]/div"));

		System.out.println("SAMSUNG Galaxy F13 (Nightsky Green, 64 GB) price :"+price2.getText());
		
		
	}
}

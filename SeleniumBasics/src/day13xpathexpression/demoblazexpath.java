package day13xpathexpression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoblazexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demoblaze.com");
		
		
		driver.findElement(By.cssSelector("a[onclick=\"byCat('phone')\"]")).click();
		//div[h4[a[text()='Samsung galaxy s6']]]/h5
		WebElement price1 = driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]/h5"));
		
		System.out.println("samsung galaxy s6 price :"+price1.getText());
		
	}

}

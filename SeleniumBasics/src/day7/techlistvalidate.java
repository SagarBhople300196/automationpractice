package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistvalidate {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();  
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.techlistic.com");
	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.manage().window().setSize(new Dimension(450,600));
	
	driver.manage().window().maximize();
	Thread.sleep(1500);
	
	
	driver.findElement(By.className("dropbtn")).click();
	Thread.sleep(1500);
	driver.findElement(By.className("item-view version-1-3-0")).click();
	Thread.sleep(1500);
	
	
	//driver.navigate().back();
	//Thread.sleep(1500);
	//driver.navigate().forward();
	//Thread.sleep(2000);
	
}
	

}

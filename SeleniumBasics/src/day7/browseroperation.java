package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseroperation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(450,600));
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(1500);
		
		driver.navigate().to("http://www.google.com");
		
		
		
		

	}

}

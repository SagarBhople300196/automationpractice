package day7;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonvalidation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver kdriver = new ChromeDriver();
		kdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		kdriver.get(" https://www.amazon.in/");
		
		kdriver.manage().window().maximize();
		Thread.sleep(1500);
		
		//kdriver.manage().window().setSize(new Dimension(450,600));
		//Thread.sleep(1500);
		
		System.out.println("page title ; "+kdriver.getTitle());
		
		kdriver.findElement(By.linkText("Mobiles")).click();
		
		
		System.out.println("after click on mob page title ; "+kdriver.getTitle());
		
		kdriver.navigate().back();
		Thread.sleep(1500);
		System.out.println("after back on home page title ; "+kdriver.getTitle());
		kdriver.close();
	}
}
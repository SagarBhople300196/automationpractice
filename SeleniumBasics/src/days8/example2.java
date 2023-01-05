package days8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		
		// set required browser driver executable path using System.setProperty(key,value)
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				// create instance of required browser class
				WebDriver driver = new ChromeDriver();
				// Maximize browser
				driver.manage().window().maximize();
				// implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://demosite.executeautomation.com/Login.html");
				driver.findElement(By.name("UserName")).sendKeys("execution");
				driver.findElement(By.name("Password")).sendKeys("admin");
				//driver.findElement(By.name("Login")).click();//click won't work here
				driver.findElement(By.cssSelector("input[name='Login']")).click();
			}
	}



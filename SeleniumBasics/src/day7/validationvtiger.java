package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class validationvtiger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		System.out.println("page title :"+driver.getTitle());
		driver.findElement(By.className("buttonBlue")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Home"));
		
		System.out.println("after login page title: "+driver.getTitle());
		
		driver.findElement(By.className("addButton")).click();
		Thread.sleep(1500);
		driver.findElement(By.partialLinkText("Funnel")).click();
	
	     Thread.sleep(1500);
	     driver.findElement(By.className("addButton")).click();
	     
	     
	     driver.findElement(By.linkText("Overdue Activities")).click();
	     
	     Thread.sleep(1500);
	     
	     driver.findElement(By.className("addButton")).click();
	     System.out.println("after login page title: "+driver.getTitle());
	}     
	     
	     
}


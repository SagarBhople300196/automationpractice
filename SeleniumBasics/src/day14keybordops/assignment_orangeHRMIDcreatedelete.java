package day14keybordops;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_orangeHRMIDcreatedelete {
	

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 //username pass
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	//click login
	driver.findElement(By.className("orangehrm-login-button")).click();
	// click on PIM
	driver.findElement(By.xpath(" //span[text()='PIM']")).click();
	//click on add button
	driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
	//enter your name 
	
	//List<WebElement> a=driver.findElements(By.cssSelector("--name-grouped-field"));
	
	//  a.get(2).sendKeys("sagar");

	driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Sagar");
	//enter last name
	driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Bhople");
	//enter your id
	WebElement inputid=driver.findElement(By.cssSelector("input[class=\"oxd-input oxd-input--active\"]:nth-child(1)"));
	
	inputid.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),"1006");
	
	//inputid.sendKeys("1005");
	
	Thread.sleep(4000);
	//click on save button
	
	driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	//click on PIM button
	
	driver.findElement(By.cssSelector("a[class=\"oxd-main-menu-item active\"]")).click();
	Thread.sleep(2000);
	
	//enter id
	
	driver.findElement(By.cssSelector("input[class=\"oxd-input oxd-input--active\"]:nth-child(1)")).sendKeys("1006"); 
	
	Thread.sleep(2000);
	
	//click on search button
	
	driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
	
	//click on edit button
	
	driver.findElement(By.cssSelector("button[type=\"button\"]:nth-of-type(2)")).click();
	
	//click on job
	
	
	driver.findElement(By.cssSelector("div[role=\"tab\"]:nth-of-type(6)")).click();
	
	
	//driver.findElement(By.cssSelector("div[class=\"oxd-select-text-input\"]")).click();
	
	driver.findElement(By.cssSelector(".oxd-grid-item.oxd-grid-item--gutters .oxd-select-text--after:nth-child(2) .oxd-icon.bi-caret-down-fill.oxd-select-text--arrow:nth-child(1)")).click();
	
	//driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]/i")).click();
	
		
	
	
	
	
		//	.oxd-select-dropdown>div>span
		//	setTimeout(function(){debugger;}, 5000)
	
	}
}

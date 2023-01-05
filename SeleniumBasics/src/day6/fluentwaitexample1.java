package day6;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentwaitexample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver fdriver =new ChromeDriver();
		fdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		fdriver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title :"+fdriver.getTitle());
		
        fdriver.findElement(By.id("username")).sendKeys("admin");
        fdriver.findElement(By.name("pwd")).sendKeys("manager");
        fdriver.findElement(By.id("loginButton")).click();
        
        FluentWait wait=new FluentWait(fdriver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(5))
        		.ignoring(NoSuchElementException.class);
        		//implement condition for wait, poling works like 5,10,15 and 20
        		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
        	
        		//click on logout link
        		fdriver.findElement(By.id("logoutLink")).click();
        
        
        
        
        
	}

}

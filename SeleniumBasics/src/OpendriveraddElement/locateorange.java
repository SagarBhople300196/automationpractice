package OpendriveraddElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateorange {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        WebDriver bdriver = new ChromeDriver();
        bdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       bdriver.get("https://opensource-demo.orangehrmlive.com/");
        
		String pageTitle=bdriver.getTitle();
        System.out.println("page title is :"+pageTitle);
        System.out.println("page title validation :"+pageTitle.equals("OrangeHRM"));
        System.out.println("url is :"+bdriver.getCurrentUrl());
        String sourceCode=bdriver.getPageSource();
		System.out.println("Page source code is: "+sourceCode);
		System.out.println("Source code lenght: "+sourceCode.length());
		WebElement usernameInputField = bdriver.findElement(By.name("username"));
		usernameInputField.sendKeys("Admin");
		WebElement passwordInputField = bdriver.findElement(By.name("password"));
		passwordInputField.sendKeys("admin123");
		WebElement loginBtn = bdriver.findElement(By.className("orangehrm-login-button"));
		loginBtn.click();
		
		//driver.close();
        

	}

}

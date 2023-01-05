package OpendriveraddElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Opendemositefirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		
		FirefoxDriver sdriver = new FirefoxDriver();
		sdriver.get("https://demosite.executeautomation.com/Login.html");
		
		String pageTitle=sdriver.getTitle();
        System.out.println("page title is :"+pageTitle);
        System.out.println("page title length is :"+pageTitle.length());
       
        System.out.println("url is :"+sdriver.getCurrentUrl());
        System.out.println("page title validation :"+sdriver.equals(""));
		

		WebElement usernameInputField = sdriver.findElement(By.name("UserName"));
		usernameInputField.sendKeys("execution");
		WebElement passwordInputField = sdriver.findElement(By.name("Password"));
		passwordInputField.sendKeys("admin");
		WebElement loginBtn = sdriver.findElement(By.name("Login"));
		loginBtn.submit();
	    //sdriver.close(); 
        
	}

}

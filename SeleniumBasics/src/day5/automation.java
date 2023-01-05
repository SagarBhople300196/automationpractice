package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		WebDriver cdriver = new ChromeDriver();
		
		cdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		cdriver.get(" https://demo.automationtesting.in/Register.html");
		 
		String pageTitle=cdriver.getTitle();
        System.out.println("page title is :"+pageTitle);
        System.out.println("page title validation :"+pageTitle.equals("OrangeHRM"));
        System.out.println("url is :"+cdriver.getCurrentUrl());
        String sourceCode=cdriver.getPageSource();
		System.out.println("Page source code is: "+sourceCode);
		
		
		//cdriver.close();
        
		 
		
		
		
		
	}

}

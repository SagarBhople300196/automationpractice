package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver Udriver =new FirefoxDriver();
		
		Udriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		Udriver.get(" https://www.amazon.in/");
		
		String pageTitle=Udriver.getTitle();
		 System.out.println("page title is :"+pageTitle);
	        System.out.println("page title validation :"+pageTitle.equals("OrangeHRM"));
	        System.out.println("url is :"+Udriver.getCurrentUrl());
	        String sourceCode=Udriver.getPageSource();
			System.out.println("Page source code is: "+sourceCode);
			Udriver.close();

		
		
		
		

	}

}

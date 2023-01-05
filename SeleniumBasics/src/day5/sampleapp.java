package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleapp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver hdriver = new ChromeDriver();
		hdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		hdriver.get("http://sampleapp.tricentis.com/101/");
		String pageTitle=hdriver.getTitle();
		 System.out.println("page title is :"+pageTitle);
	        System.out.println("page title validation :"+pageTitle.equals("OrangeHRM"));
	        System.out.println("url is :"+hdriver.getCurrentUrl());
	        String sourceCode=hdriver.getPageSource();
			System.out.println("Page source code is: "+sourceCode);
			hdriver.close();

	}

}

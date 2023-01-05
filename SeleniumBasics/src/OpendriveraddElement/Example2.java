package OpendriveraddElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
         
		String pageTitle=driver.getTitle();
         System.out.println("page title is :"+pageTitle);
         System.out.println("page title validation :"+pageTitle.equals("Register"));
         System.out.println("url is :"+driver.getCurrentUrl());
         String sourceCode=driver.getPageSource();
 		System.out.println("Page source code is: "+sourceCode);
 		System.out.println("Source code lenght: "+sourceCode.length());
 		driver.close();
         
	}

}

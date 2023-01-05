package myassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.amazon.in");
        
        driver.findElements(By.cssSelector("#searchDropdownBox")).get(3).click();
        
        
        
        driver.findElement(By.cssSelector(".nav-fill .nav-right")).click();
        
        
	}

}

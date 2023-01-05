package day14keybordops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardops3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//to enter required application URL 
		driver.get("http://demo.automationtesting.in/Register.html");
		//identify first name input field
		
		WebElement firstname =driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		// type first name as sagar and use ctrl+a
		firstname.sendKeys("sagar",Keys.chord(Keys.CONTROL,"a"));
		// in first name use ctrl+c
		firstname.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']"))
		.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field

		
		
		
		
		
		
		
	}

}

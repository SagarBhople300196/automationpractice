package days8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
		System.out.println("Option count is: " + categories.size());
		List<String> expectedCat = new ArrayList<String>();
		
		expectedCat.add("CATEGORIES");
		expectedCat.add("Phones");
		expectedCat.add("Laptops");
		expectedCat.add("Monitors");
		
		for (int i = 0; i < categories.size(); i++) {
			WebElement cat = categories.get(i);
			System.out.println("********* Element of List is: " + cat.getText() + "*********");
			System.out.println(cat.isDisplayed());
			System.out.println(cat.isEnabled());
		System.out.println(cat.getText().equals(expectedCat.get(i)));

		
		
		
		}

	}

}

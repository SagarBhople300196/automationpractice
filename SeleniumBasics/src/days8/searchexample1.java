package days8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class searchexample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// Maximize browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

      driver.findElement(By.name("q")).sendKeys("selenium testing");
      List<WebElement> sugg=driver.findElements(By.cssSelector("ul>li>div>:nth-child(2)>:first-child>span"));
		System.out.println("Suggestion count: "+sugg.size());
		for(int i=0;i<sugg.size();i++) {
			
			
			System.out.println(sugg.get(i).getText());
				
		}
		sugg.get(1).click();
		
	}

}

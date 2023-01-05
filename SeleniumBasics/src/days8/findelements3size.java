package days8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements3size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		List<WebElement> phones = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));

		System.out.println("Number of Phones present on Home page: "+phones.size());
		for(WebElement element:phones) {
			System.out.println(element.getText());
		}
	}

}

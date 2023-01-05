package days8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://gsmarena.com");
		
		List<WebElement> phone=driver.findElements(By.cssSelector(".brandmenu-v2>ul>*"));
		phone.get(0).click();
		
		List<WebElement> pagination=driver.findElements(By.cssSelector("nav-pages>*"));
		System.out.println("no of pages :"+pagination.size());
		
          for(int i=0;i<pagination.size();i++) {
			
			
			System.out.println(pagination.get(i).getText());
				
		
		
}
		

	}

}

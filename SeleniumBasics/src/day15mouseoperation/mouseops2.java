package day15mouseoperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseops2 {

	public static void main(String[] args) throws InterruptedException {
		
		String chromexpath =System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",chromexpath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		
		Actions act = new Actions(driver);
		//to do hover over the Home option 
		
	//	act.moveToElement(mainMenu.get(2)).perform();
		//do to hover in all mainmenu options */
		for(int i=0;i<mainMenu.size();i++) {
		WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();			
			Thread.sleep(1000);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

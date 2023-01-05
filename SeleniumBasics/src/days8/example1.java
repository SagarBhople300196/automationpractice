package days8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		//links present in page
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Links count: "+links.size());
		List<WebElement> inputFields=driver.findElements(By.tagName("input"));
		System.out.println("inputFields count: "+inputFields.size());
		
		List<WebElement> classObject=driver.findElements(By.cssSelector(".ng-pristine"));
		System.out.println("classObject count: "+classObject.size());
		//in order to get specific element from the List use get(index)
		classObject.get(1).sendKeys("admin");
		classObject.get(2).sendKeys("manager");
		classObject.get(3).sendKeys("Deccan Pune");
		classObject.get(4).sendKeys("abc@gmail.com"); 
	}

}

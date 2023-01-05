package day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actitimetaskcreatdelete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.actitime.com");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		//click on task button
		driver.findElement(By.id("container_tasks")).click();
		// click on
		driver.findElement(By.cssSelector(".ellipsis")).click();
		
		driver.findElement(By.cssSelector(".createNewTasks")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".projectSelector .selectedItem")));
		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();
		
		//click on project
		List<WebElement> projectList=driver.findElements(By.cssSelector(".projectSelector .searchItemList>div"));
		projectList.get(3).click();
		//enter tasl name as Testing
		driver.findElement(By.cssSelector(" input[placeholder=\"Enter task name")).sendKeys("Testing");
		//click on deadline
		driver.findElement(By.cssSelector(".x-btn-text")).click();

		//click on next month 
		driver.findElement(By.cssSelector("a[title=\"Next Month (Control+Right)\"]")).click();	
		//click on date
		List<WebElement> projectList1=driver.findElements(By.cssSelector(".x-date-inner .x-date-date"));
		projectList1.get(20).click();
		
		//click on 
		driver.findElement(By.cssSelector(".taskTableContainer .value.ellipsis")).click();

		
		driver.findElements(By.cssSelector(".taskTableContainer  .typeOfWorkList>div>div")).get(8).click();
		
		//List<WebElement> projectList2=driver.findElements(By.cssSelector(".typeOfWorkButton .value.ellipsis "));
		//projectList2.get(5).click();
	

		
		//.billingTypeCell .value.ellipsis
		
		
		

	}

}

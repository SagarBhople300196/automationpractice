package day9;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebookdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://facebook.com");
		
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.titleContains("Create New Account"));
		driver.findElement(By.partialLinkText("Create")).click();
		
		WebElement day = driver.findElement(By.id("day"));
		//create instance of select class and pass above element in constructor
		Select selectday = new Select(day);
		
		System.out.println("day field is visible or not :"+day.isDisplayed());
		//check day field is enabled or not
		System.out.println("day field is enabled or not :"+day.isEnabled());
		//check day field is multiselected or not
		System.out.println("multiselected or not :"+selectday.isMultiple());
		
		//get default value of day field
		
		System.out.println("default value :"+selectday.getFirstSelectedOption().getText());
		//change day in day field
		day.sendKeys("8");
		//updated day
		System.out.println("updated day value :"+selectday.getFirstSelectedOption().getText());
		
		List<WebElement> dayoption= selectday.getOptions();
		
		System.out.println("DAY OPTION : :"+dayoption.size());
		for (int i=0; i<dayoption.size(); i++) {
		System.out.println(dayoption.get(i).getText());
		
	}
		
		
		System.out.println("*******************************************************************************");
		
		WebElement month = driver.findElement(By.id("month"));
		//create instance of select class and pass above element in constructor
		Select selectmonth = new Select(month);
		
		System.out.println("month field is visible or not :"+month.isDisplayed());
		//check day field is enabled or not
		System.out.println("day field is enabled or not :"+month.isEnabled());
		//check day field is multiselected or not
		System.out.println("multiselected or not :"+selectmonth.isMultiple());
		
		//get default value of day field
		
		System.out.println("default value :"+selectmonth.getFirstSelectedOption().getText());
		//change day in day field
		month.sendKeys("feb");
		//updated day
		System.out.println("updated day value :"+selectmonth.getFirstSelectedOption().getText());
		
		List<WebElement> monthoption= selectmonth.getOptions();
		
		System.out.println("DAY OPTION : :"+monthoption.size());
		for (int i=0; i<monthoption.size(); i++) {
		System.out.println(monthoption.get(i).getText());
		
	}
		
	System.out.println("*******************************************************************************");
		
		WebElement year = driver.findElement(By.id("year"));
		//create instance of select class and pass above element in constructor
		Select selectyear = new Select(year);
		
		System.out.println("day field is visible or not :"+year.isDisplayed());
		//check day field is enabled or not
		System.out.println("day field is enabled or not :"+year.isEnabled());
		//check day field is multiselected or not
		System.out.println("multiselected or not :"+selectyear.isMultiple());
		
		//get default value of day field
		
		System.out.println("default value :"+selectyear.getFirstSelectedOption().getText());
		//change day in day field
		year.sendKeys("1996");
		//updated day
		System.out.println("updated day value :"+selectyear.getFirstSelectedOption().getText());
		
		List<WebElement> yearoption= selectyear.getOptions();
		
		System.out.println("DAY OPTION : :"+yearoption.size());
		for (int i=0; i<yearoption.size(); i++) {
		System.out.println(yearoption.get(i).getText());
		

		}
		
		
		
		
		
	}	
		
	}	
	
	



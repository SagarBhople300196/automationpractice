package day7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uicomponentvalidation {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver kdriver = new ChromeDriver();
		kdriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		kdriver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement firstNameInputField = kdriver.findElement(By.className("ng-touched"));
		System.out.println("First name input field visible or not? "+firstNameInputField.isDisplayed());
		System.out.println("First name input field editable or not? "+firstNameInputField.isEnabled());
		String firstNameInputFieldValue=firstNameInputField.getAttribute("placeholder");
		System.out.println("Default value validation status: "+firstNameInputFieldValue.equals("First Name"));
		
		WebElement maleRadiobtn = kdriver.findElement(By.name("radiooptions"));
		System.out.println("male radio button visible or not? "+maleRadiobtn.isDisplayed());
		System.out.println("male radio button functionalor not? "+maleRadiobtn.isEnabled());
		
		System.out.println("male radio button default selection status? "+maleRadiobtn.isSelected());
		maleRadiobtn.click();
		System.out.println("after male radio button default selection status? "+maleRadiobtn.isSelected());
		
		WebElement submitBtn=kdriver.findElement(By.id("submitbtn"));
		
		System.out.println("Submit button visible or not? "+submitBtn.isDisplayed());
		System.out.println("Submit button functional or not? "+submitBtn.isEnabled());	
		String actualButtonName=submitBtn.getText().trim();//text has additional spaces, to remove that use trim()
		System.out.println("Submit button name validation status? "+actualButtonName.equals("Submit"));
	}


		
		
	}


 
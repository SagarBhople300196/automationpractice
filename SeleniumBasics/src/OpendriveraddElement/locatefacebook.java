package OpendriveraddElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatefacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver bdriver = new ChromeDriver();
		bdriver.get("https://www.facebook.com");
		
		WebElement usernameInputField = bdriver.findElement(By.name("email"));
		usernameInputField.sendKeys("sagar");
		WebElement passwordInputField = bdriver.findElement(By.name("pass"));
		passwordInputField.sendKeys("bhople");
		WebElement loginBtn = bdriver.findElement(By.name("login"));
		loginBtn.click();
	    //bdriver.close();

	}

}

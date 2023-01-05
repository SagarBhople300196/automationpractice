package OpendriveraddElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locateelementactitime {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
		WebElement usernameInputField = driver.findElement(By.id("username"));
        usernameInputField.sendKeys("admin");
		WebElement passwordInputField = driver.findElement(By.name("passward"));
		passwordInputField.sendKeys("manager");
        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        loginBtn.click();
        driver.close();
	}

}

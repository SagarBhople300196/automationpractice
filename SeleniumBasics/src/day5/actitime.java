package day5;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class actitime {

		public static void main(String[] args) {
			
			
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Login page title: "+driver.getTitle());
			 
			driver.findElement(By.id("username")).sendKeys("admin");
			
			driver.findElement(By.name("pwd")).sendKeys("manager");
	
			driver.findElement(By.id("loginButton")).click();
			
			WebDriverWait wait=new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
			
			System.out.println("Home page title: "+driver.getTitle());
			
			//driver.findElement(By.id("logoutLink")).click();
			
		
			
			//driver.close();
		}
	}


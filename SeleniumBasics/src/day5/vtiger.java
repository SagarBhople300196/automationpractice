package day5;
        import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class vtiger {

			public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				System.out.println("Login page title: "+driver.getTitle());
				 
				WebElement username=driver.findElement(By.id("username"));
				username.clear();
				username.sendKeys("admin");
				
				WebElement pwd=driver.findElement(By.name("password"));
				pwd.clear();
				pwd.sendKeys("Test@123");
				
				driver.findElement(By.className("buttonBlue")).click();
				
				
				//driver.close();
			}
		}
	
	



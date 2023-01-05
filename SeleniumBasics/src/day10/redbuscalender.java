package day10;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbuscalender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.redbus.in");
		
		//click pune
		driver.findElement(By.cssSelector("input[data-message=\"Please enter a source city\"]\r\n" + 
				"")).sendKeys("Pune");
		//click option in pune
		List<WebElement> a = driver.findElements(By.cssSelector(".autoFill.homeSearch>*"));

		
		      a.get(2).click();
		      // click goa
		      
		      driver.findElement(By.cssSelector("input[data-message=\"Please enter a destination city\"]")).sendKeys("Goa");
		      // search option in goa
		      List<WebElement> b = driver.findElements(By.cssSelector(".autoFill.homeSearch>*"));
		      b.get(2).click();

		      driver.findElement(By.cssSelector("#onward_cal")).click();	      
		      driver.findElement(By.cssSelector(".next>button")).click();
		    //click on calender date  
		      List<WebElement> c = driver.findElements(By.cssSelector(".rb-monthTable.first.last>tbody>tr:nth-of-type(4)>*"));
		      c.get(2).click();
        // click on search button
		      driver.findElement(By.cssSelector("#search_btn")).click();
		      
		      //click on 6 am
		      List<WebElement> d = driver.findElements(By.cssSelector(".dept-time.dt-time-filter .custom-checkbox"));
		      d.get(0).click();
		      
		   
		   //  click on ac 
		      List<WebElement> e = driver.findElements(By.cssSelector(".list-chkbox .custom-checkbox"));
		     
		      e.get(2).click();
		     // search all buses 
		      
		      List<WebElement> f = driver.findElements(By.cssSelector(".travels.lh-24.f-bold.d-color"));
		      
		      System.out.println("Suggestion count: "+f.size());
				for(int i=0;i<f.size();i++) {
					
					
					System.out.println(f.get(i).getText());
					
				}
		      
			   
		      
		      
		      
		
		
		
		
		
		
		
		
	}

}

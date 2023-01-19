package actiTimeTestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebpageorangeHRM.orangeLoginPage;
import actiTimePages.ActiTimeLoginPage;
import actiTimePages.Deletepage;
import actiTimePages.Editpage;
import actiTimePages.EnterTimeTrackPage;
import actiTimePages.TaskListpage;
import utilities.SeleniumUtility;

public class ActitimeScripts extends SeleniumUtility {
	
	ActiTimeLoginPage getActiTimeLoginPage;
	EnterTimeTrackPage getEnterTimeTrackPage;
	TaskListpage getTaskListpage;
	Editpage getEditpage;
	Deletepage getDeletepage;
	
	@BeforeTest
	public void startactitime() {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		getActiTimeLoginPage=new ActiTimeLoginPage(driver);
		getEnterTimeTrackPage=new EnterTimeTrackPage(driver);
		getTaskListpage=new TaskListpage(driver);
		getEditpage=new Editpage(driver);
		getDeletepage=new Deletepage(driver);
		getActiTimeLoginPage.loginOperation("admin", "manager");
		
		
		
	}
	
	@Test
	public void createTaskActitime() {
		getEnterTimeTrackPage.clickOnTask();
		getTaskListpage.creatTask("testing");
	}	
	@Test	
	public void editTaskActitime() {
		getTaskListpage.editTask();
		getEditpage.EnterEstimatedTime("11:00");
			
	}
	
	@Test
	public void deleteTaskActitime() {
		getTaskListpage.selectCheckBox();
		getDeletepage.deleteTaskMethod();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		@AfterTest
		public void ends() {
			
			//	tearDown();
				
			//}

}
}
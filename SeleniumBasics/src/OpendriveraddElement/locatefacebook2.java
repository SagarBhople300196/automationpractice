package OpendriveraddElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatefacebook2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver bdriver = new ChromeDriver();
		bdriver.get("https://www.facebook.com");
		
		String p1 =  bdriver.getCurrentUrl();
		String Title = bdriver.getTitle();
		System.out.println("page title is :"+Title);
        System.out.println("page title verification :"+Title.equals("facebook"));
       // System.out.println("page title verification :"+Title.equals("log in or sign upFacebook – log in or sign up");
        System.out.println("length of title is :"+Title.length());
        String srccode =  bdriver.getPageSource();
        System.out.println("length of sourcecode :"+srccode.length());
        //   bdriver.close();
	}

}

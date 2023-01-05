package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class properties2 {

	public static void main(String[] args) throws IOException {
		

		FileInputStream fis= new FileInputStream(".\\Prop1.properties\\property1.properties");
		
		//create an instance of properties class
		Properties prop= new Properties();
		
		//call load method of properties class to load property file
		
		prop.load(fis);
		
		//use string key property to get key value from property file
	
		System.out.println(" get username value :"+prop.getProperty("password"));
		
	    prop.setProperty("position","IBM");
	    prop.setProperty("mob no","8600646122");
	    //TO SAVE changes get the file location and pass it to fileoutputstream class
		
		FileOutputStream fos = new FileOutputStream(".\\\\Prop1.properties\\\\property1.properties");
		
		prop.store(fos,"added company name");
		
		// flush the content into property line
		fos.flush();
		
		//close property file instance
		
		fos.close();
		
		System.out.println("values updated");

	}

}

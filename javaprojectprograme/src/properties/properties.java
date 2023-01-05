package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws IOException {
		
         //property file location
		String filelocation="F:\\programmejava2022\\javaprojectprograme\\Prop1.properties\\property1.properties";
		
		//create instance of fileinputstream class and pass file location on its constructor
		
		FileInputStream fis= new FileInputStream(filelocation);
		
		//create an instance of properties class
		Properties prop= new Properties();
		
		//call load method of properties class to load property file
		
		prop.load(fis);
		
		//use string key property to get key value from property file
		String userName = prop.getProperty("username"); 
		System.out.println(" get username value :"+userName);
		System.out.println(" get username value :"+prop.getProperty("password"));
		
		System.out.println(" get id value :"+prop.getProperty("id"));
		
		System.out.println(" get emailaddress value :"+prop.getProperty("emailid"));
		
		
		
		
		
		
		
	}

}

package day15mouseoperation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateops1 {

	public static void main(String[] args) {
		// date class will give you the current system date
		
		Date d1 = new Date();
		//SimpleDateFormat will help to get date in specific fromat
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MMM/yyyy");
		
		// with the help of SimpleDateFormate you can convert your date into your required format
        System.out.println(s.format(d1));
	}

}

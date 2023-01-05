package array;

import java.util.ArrayList;

public class arraylistexample2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		 
			  System.out.println("INITIAL LIST "+al);
			  System.out.println("INITIAL LIST "+al.isEmpty());
			  al.add("ravi");
			  al.add("vijay");
			  al.add("Ajay");
			  System.out.println("after invoking LIST "+al);
			  al.add(1,"gaurav");
			  System.out.println(" after invoking (index 1)INITIAL LIST "+al);
			  
			  ArrayList al2 = new ArrayList();
			  al2.add("sonu");
			  al2.add("hanumat");
			  System.out.println(" LIST of al2 "+al2);
			  System.out.println(" LIST before adding al2 "+al);
	         al.add(al2);
	         System.out.println(" LIST after adding al2 "+al);
	         al.add(1,al2);
	         System.out.println(" LIST after index add "+al);
	         
	         
	         
	}
}

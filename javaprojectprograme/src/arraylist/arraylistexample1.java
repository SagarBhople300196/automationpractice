package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arraylistexample1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println("*********************************************" );
        Collections.sort(list);
        System.out.println("Elements of list: " + list.size());
        System.out.println("Elements of list: " + list);
        System.out.println("traversing through lambada expresssion" );
        
        list.forEach(obj ->{
        	System.out.println(obj);
        });
        
        System.out.println("traversing list through ieterator " );
        Iterator itr = list.iterator();
        
	  while(itr.hasNext()) {
		  System.out.println(itr.next());
		  System.out.println(itr.hasNext());
		  
		  System.out.println("******with used iterator object*********");
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
	  }
		  System.out.println("******with new iterator object*********");
		  Iterator itr2 = list.iterator();
		  while(itr2.hasNext()) {
			  System.out.println(itr2.next());
		  } 
	  }
	}
}

package arraylist;

import java.util.ArrayList;

public class arraylistexample0 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("1254");
		list.add("banana");
		list.add("null");
		list.add('C');
		list.add("15.26");
		list.add("true");
		list.add(new arraylistexample0());
		list.add("banana");
      System.out.println("size of list "+list.size());
      System.out.println("size of list "+list);
      System.out.println("traversing list through for loop ");
      for(int i=0;i<list.size();i++) {
      System.out.println(list.get(i));
      }
      System.out.println("trversing the list from for each loop");
      for(Object fruit: list) {
    	  System.out.println(fruit);
      }
      System.out.println("retuern "+list.get(1));
      
      list.set(1,"dates");
      System.out.println("size of list "+list.size());
      System.out.println("size of list "+list);
      
	}

}

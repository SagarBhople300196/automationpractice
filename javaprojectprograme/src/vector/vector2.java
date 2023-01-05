package vector;

import java.util.Vector;

public class vector2 {

	public static void main(String[] args) {
		Vector<String> vcr = new Vector<String>();
      vcr.add("tiger");
      vcr.add("lion");
      vcr.add("dog");
      vcr.add("elephant");
      vcr.add("tiger2");
      vcr.add("tiger2");
      vcr.add("tiger2");
      System.out.println("vector element are vec :"+vcr);
      System.out.println("vector element are vec :"+vcr.capacity());
      vcr.add("rat");
      System.out.println("vector element are vec :"+vcr);
      System.out.println("vector element are vec :"+vcr.capacity());
      vcr.add("cat");
      System.out.println("vector element are vec :"+vcr);
      System.out.println("vector element are vec :"+vcr.capacity());
      
      vcr.add("lion");
      vcr.add("ox");
      System.out.println("vector element are vec :"+vcr);
      System.out.println("vector element are vec :"+vcr.capacity());
      for(String str: vcr) {
    	  System.out.println(str);
      }
      
      
      
	}

}

package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class arraylistexample3 {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ajay");
		al.add("anuj");
		al.add("gaurav");
        System.out.println("an initial list "+al);
        System.out.println("remove vijay "+al.remove("vijay"));
        System.out.println("after removing vijay "+al);
        System.out.println("remove index0 "+al.remove(0));
        System.out.println("after removing index 0 "+al);
        System.out.println("remove vijay "+al.remove("vijay"));
        System.out.println("**********************************");
        ArrayList <String> al2 = new ArrayList<String>();
        
        al2.add("ravi");
        al2.add("hanumat");
        System.out.println("an initial list "+al2);
        al.addAll(al2);
        System.out.println("after adding al2 "+al);
        al.removeAll(al2);
        System.out.println("an initial list "+al);
        al.removeIf(str ->str.contains("ajay"));
        System.out.println("after rermoving list "+al);
        al.clear();
        System.out.println("after clear "+al);
        System.out.println("********************************");
        ArrayList <String> al3 = new ArrayList<String>();
        al3.add("ravi");
		al3.add("vijay");
		al3.add("ajay");
		al3.add("hanumat");
		ArrayList <String> al4 = new ArrayList<String>();
		al4.add("ravi");
		al4.add("hanumat");
		al4.add("pune");
		System.out.println("list al1 "+al3);
		System.out.println("list al2 "+al4);
		al3.retainAll(al4);
		 System.out.println("after retailall "+al3);
		 System.out.println("itering the element after retaining al2 ");
		 Iterator itr = (Iterator) al3.iterator(); 
		while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
		}
		
		List l1 = new  ArrayList();
		
		l1.add("pune");
		l1.add("pune");
		l1.add("123");
		l1.add("pune");
		l1.add("null");
		System.out.println(l1);
		
		
		
		
	}

}

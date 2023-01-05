package arraylist;

import java.awt.List;
import java.util.ArrayList;

public class example1 {

	public static void main(String[] args) {
		//ArrayList list1 = new ArrayList();
		//or
		ArrayList ls1 = new ArrayList();
		ls1.add("java");
		ls1.add(new example1());
		ls1.add(25);
		System.out.println("list member :"+ls1);
		
		ls1.add(1,"pune");
		System.out.println("updayted list member :"+ls1);
		System.out.println("1st index element get :"+ls1.get(1));
		System.out.println("list member size :"+ls1.size());
		for(int i=0;i<ls1.size();i++) {
			System.out.println("list element index :"+i+" :"+ls1.get(i));
		}
		System.out.println("**************** for each loop *******************");
		for(Object obj :ls1) {
			System.out.println(obj);
		}
	}

}

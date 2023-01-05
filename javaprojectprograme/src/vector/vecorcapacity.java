package vector;

import java.util.Vector;

public class vecorcapacity {

	public static void main(String[] args) {
		Vector<String> vctr = new Vector<String>();
		System.out.println("vector capacity "+vctr.capacity());
		System.out.println("vector size "+vctr.size());
		vctr.setSize(2);
		System.out.println("vector size "+vctr.size());
		System.out.println("vector element "+vctr);
		vctr.addElement("sunday");
		vctr.addElement("monday");
		System.out.println("vector capacity"+vctr);
		System.out.println("vector capacity "+vctr.size());
		vctr.addElement("wednesday");
		
		System.out.println("vector capacity"+vctr.size());
		System.out.println("vector capacity"+vctr);
		
		
		
		
		
		
		
	}

}

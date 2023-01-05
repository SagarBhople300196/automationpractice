package wrapperclass;

public class unboxingoperation1 {

	public static void main(String[] args) {
		Double doubleobj = 25000.00;
		System.out.println("doubleobj :"+doubleobj);
		double salary = doubleobj.doubleValue();
		System.out.println(salary);
		System.out.println(salary==doubleobj);
		
		Boolean b = true;
		boolean b1 = b.booleanValue();
		
		Character c1 = new Character('a');
		char c2 = c1.charValue();
		
		Integer i = 25;
		double d = i.doubleValue();
		
		
		
	}

}

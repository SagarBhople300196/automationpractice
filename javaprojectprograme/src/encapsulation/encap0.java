package encapsulation;

class demo {
	private int age=25;
	private double salary= 25000;
	//getter method use for encaplusation
	public int getage () {
		return age;
	}
	public double getsalary() {
		return salary;
	}
	
	//setter method
	public void setage(int e) {
		 age=e;
	}
	public void setsalary(double d) {
	     salary=d;
	}
}

public class encap0 {

	public static void main(String[] args) {
		demo d1 = new demo();
		d1.getage();
		System.out.println("private value outside of class getage "+d1.getage());
		System.out.println("private value outside of class getage "+d1.getsalary());
		d1.setage(28);
		d1.setsalary(550000);
		System.out.println("updated private value outside of class getage "+d1.getage());
		System.out.println("private value outside of class getage "+d1.getsalary());
	}

}

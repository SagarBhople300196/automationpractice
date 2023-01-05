package finalkeyword;

public class finalkeyword2 {
	final int empId=101;
	double salary= 12000;
	
	void run () {
		System.out.println("empid :"+empId);
	}
	

	public static void main(String[] args) {
		finalkeyword2 v1 = new finalkeyword2();
		v1.run();
		System.out.println("salary :"+v1.salary);
	}

}

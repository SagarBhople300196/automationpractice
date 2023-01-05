package method;

public class method4 {
	static double salary=2000.26;
	static int empId= 2002;
	public static int getempId() {
		System.out.println("printempid is running,,,,");
		return empId;
	}
	public static double getsalary() {
	System.out.println("printsalary is running,,,,");
	return salary;
	}

	public static void main(String[] args) {
		System.out.println(getempId());
		System.out.println(getsalary());
	
	}

}

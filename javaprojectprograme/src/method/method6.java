package method;

public class method6 {
	 double x=10, y=20, z=30;
	 boolean checksameornot(int a, int b) {
		 return (a==b);
		 
	 }
    static void display() {
	method6 m2 = new method6();
	System.out.println("input the first number : "+ m2.x);
	System.out.println("input the second number : "+ m2.y);
	System.out.println("input the third number : "+ m2.z);
}
    public void average(double p, double q, double r) {
    	
		double res=(p+q+r)/3;
		System.out.println("average value is :"+res);
	}

	public static void main(String[] args) {
		System.out.println("i am method6 class");
		method6 m1 = new method6();
		System.out.println("input the first number : "+ m1.x);
		System.out.println("input the second number : "+ m1.y);
		System.out.println("input the third number : "+ m1.z);
		m1.average(10, 10, 10);
		
	}	
	
}

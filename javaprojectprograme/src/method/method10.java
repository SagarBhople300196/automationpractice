package method;

public class method10 {
	public int mymethod(int num1, int num2) {
		
		System.out.println("first mymethod class demo");
		return num1+num2;
	}
	public int Mymethod(int var1, int var2) {
		System.out.println("second mymethod class demo");
		return var1-var2;
	}

	public static void main(String[] args) {
		method10 m1= new method10();
		System.out.println(m1.mymethod(10,20 ));
		System.out.println(m1.Mymethod(40,20 ));
		
	}

}

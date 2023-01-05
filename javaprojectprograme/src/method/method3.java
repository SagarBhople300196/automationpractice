package method;

public class method3 {

	public static void main(String[] args) {
		System.out.println("addition1 "+addition(25,15));
		System.out.println("*********************");
		System.out.println("additon2 "+method3.addition(40.50,60.50));
		System.out.println("***********************");
		double sum=addition(25,25);
		System.out.println("addition :"+sum);

	}
	public static double addition(double num1, double num2) {
		System.out.println("first num is :"+num1);
		System.out.println("second num is :"+num2);
		double res=num1+num2;
		return res;
		
	}

}

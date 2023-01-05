package simpleprogram;

public class swaptwonum {

	public static void main(String[] args) {
		int num1=80, num2=50, temp;
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
	//	temp = num1;
	//	num1 = num2;
	//  num2= temp;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("num1 :"+num1);
		System.out.println("num2 :"+num2);
	}

}

package scannerclass;

import java.util.Scanner;

public class scannerexample3 {

	public static void main(String[] args) {
		String s = "this is basicjava";
		Scanner scan = new Scanner(s);
		System.out.println("boolean :"+scan.hasNext());
		System.out.println("string :"+scan.nextLine());
		scan.close();
		System.out.println("*******enter your details*******");
		Scanner in = new Scanner(System.in);
		System.out.println("enter your name");
		String name = in.next();
		System.out.println("enter your name "+name);
		int i = in.nextInt();
		System.out.println("age "+i);
		System.out.println("enter your salary");
		double d = in.nextDouble();
		System.out.println("my salary is "+d);
	}

}

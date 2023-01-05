package scannerclass;

import java.util.Scanner;

public class scannerexample1 {
	
	public static void main(String[] args) {
		int age=25;
		System.out.println("age "+age);
		
		Scanner obj = new Scanner(System.in);
		int pin;
		double salary;
		char grade;
		boolean status;
		System.out.println("enter pin no.");
		pin=obj.nextInt();
		System.out.println("enter SALARY.");
		salary=obj.nextDouble();
		System.out.println("enter grade");
		grade=obj.next().charAt(0);
		System.out.println("enter status");
		status=obj.nextBoolean();
		System.out.println("*****************************************");
		System.out.println(age+" "+salary+" "+pin+" "+grade+" "+status+" ");
		
		System.out.println("enter your name");
		String name=obj.next();
		System.out.println("my name is "+name);
	
		
		
	
		
		
		
		
		


	}

}

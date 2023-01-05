package exceptionhandling;

import java.util.Scanner;

public class exceptionhandling2 {

	public static void main(String[] args) {
		System.out.println("program starts");
		Scanner scn=new Scanner(System.in);
		 System.out.println(" enter array size :");
		 int size=scn.nextInt();
		 int[] empId = new int[size];
		 try {
			 System.out.println(empId[3]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
		 }
		
		 System.out.println("program enda here ");
		

	}

}

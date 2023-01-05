package exceptionhandling;

import java.util.Scanner;

public class exceptionhandling1 {

	public static void main(String[] args) {
	System.out.println("program starts");	
      int  i,j,k;
      
      Scanner scn = new Scanner(System.in); 
      System.out.println("enter first num1 :");
      i=scn.nextInt();
      System.out.println("enter first num2 :");
      j=scn.nextInt();
      try {
    	  k=i/j;
    	  System.out.println("res :"+k);
           
      }catch(ArithmeticException obj) {
    	  System.out.println("exception handle :"+obj);
      }
      System.out.println("program ends here");
      
      
      
      
	}

}

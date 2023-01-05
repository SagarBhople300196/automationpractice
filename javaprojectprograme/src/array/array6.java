package array;

import java.util.Arrays;

public class array6 {

	public static void main(String[] args) {
		int[] num1 = {5,2,55,80,100,20,3};
		for(int a:num1) {
			System.out.println(a);
		}
		Arrays.sort(num1);
		System.out.println("******num1 after sorting******");
		for(int a:num1) {
			System.out.println(a);
		}
		System.out.println("******copy of array******");
		int copyarray[]= Arrays.copyOf(num1, 10);
		for(int num:copyarray) {
			System.out.println(num);
		}
			System.out.println("******copy of range array******");
			int[] num2= Arrays.copyOfRange(num1, 0, 5);
			for(int a:num2) {
				System.out.println(a);
			}
		
		

	}

}

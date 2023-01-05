package array;

import java.util.Arrays;

public class mularra4 {

	public static void main(String[] args) {
		int arr[]= {33,3,4,5};
		for(int i : arr) {
              System.out.println(i);
		}
		
		System.out.println("printing clone of array");
		int carr[]=arr.clone();
		for(int i : arr) {
			 System.out.println(i);
		}
		 System.out.println("are both equal arr and carr");
		 System.out.println(Arrays.equals(arr, carr));
		 System.out.println("************************");
		 int newcopiedarray[]=Arrays.copyOf(arr,arr.length);
		 for(int i:newcopiedarray) {
			 System.out.println(i);
		 }
		 System.out.println("**************************");
		 int newarrayrange[]=Arrays.copyOfRange(arr,0,3);
		 for(int i :newarrayrange) {
		 System.out.println(i);
		 }
		 System.out.println("********************");
		 System.out.println("comparing newcopiedarray and newarrayrange "+Arrays.equals(newcopiedarray, newarrayrange));
		 System.out.println("*******************************");
		 Arrays.sort(arr);
		 System.out.println("after array sorting");
		 for(int i : arr) {
			 System.out.println(i);
		 }
	}

}

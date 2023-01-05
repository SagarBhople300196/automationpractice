package array;

public class array3 {

	public static void main(String[] args) {
		int[] numbers= { 2,-9,0,5,12,-25,22,9,8,12};
		double sum=0;
		double avarage;
		for(int number : numbers) {
			sum = sum + number;
		}
       int arraylength = numbers.length;
       avarage = sum /arraylength;
       System.out.println("sum :"+ sum);
       System.out.println("average :"+ avarage);
	}

}

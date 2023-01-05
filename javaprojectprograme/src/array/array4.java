package array;
class array{
	static void min(int arr[]) {
		int min = arr[0];
		for(int i=1; i<arr.length;i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
		}
		System.out.println("min number in array is :"+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max number in array is :"+max);
			
	}
}

public class array4 {

	public static void main(String[] args) {
		int a[]= {33,13,4,50,15,1};
		array.min(a);
		array.max(a);
	}

}

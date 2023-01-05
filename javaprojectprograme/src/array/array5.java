package array;

class arra1 {
		static int[] getarray() {
			return new int[] {10,30,50,90,60 };
		}
		static int getnum() {
			return (10+31);
		}
}
		public class array5 {

	public static void main(String[] args) {
		int arr[] = arra1.getarray(); 
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}

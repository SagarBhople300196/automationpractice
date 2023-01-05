package array;

public class mularray2 {

	public static void main(String[] args) {
		int arr[][]= {{1, 2, 3},{4, 5}, {7, 8, 9, 4}};
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
            System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
          char[] arrchar[]= {{'A','B'},{'C','D','E'},{'X','Y','Z'}};
          for(int i=0;i<arrchar.length; i++) {
  			for(int j=0; j<arrchar[i].length;j++) {
              System.out.println(arrchar[i][j]+" ");
  			}
  			System.out.println();
          }
	}

}

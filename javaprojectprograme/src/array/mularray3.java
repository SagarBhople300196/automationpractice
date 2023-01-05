package array;

public class mularray3 {

	public static void main(String[] args) {
		char[] copyFrom= {'a','b','c','d','e','f','g','h','i','j','k','l'};
		char[] copyTo= new char[7];
          System.arraycopy(copyFrom, 2 ,copyTo, 0, copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.println(copyTo[i]); 
		}

	}

}

package method;

public class evennum {
    static boolean isEven(int num) {
		
		if(num%2==0) {
			System.out.println("given numer is : "+num);
		    return true;
		}else {
			return false;
		}
		
	}
		public static void main(String[] args) {
			System.out.println(isEven(25));
		
	}

}

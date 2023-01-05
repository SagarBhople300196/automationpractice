package forwhileloop;

public class fortestreversenum {

	public static void main(String[] args) {
		int num=123456, rev=0;
		for (; num !=0; num=num/10 ) {
			int rem= num%10;
			rev=rev*10+rem;
			
			System.out.println("reverse number is :"+rev);
		}

	}

}

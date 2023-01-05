package whileloop;

public class countinteger {

	public static void main(String[] args) {
		int num=1234, count=0;
		
		while(num !=0) {
			num /=10;
			++count;
		}
			System.out.println("count: "+ count );
		 
		
		
	}

}

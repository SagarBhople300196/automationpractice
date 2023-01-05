package forwhileloop;

public class forfactorofpositivenum {
	public static void main(String[] args) {
		int num=75;
		for (int i = 0; i <=num; ++i) {
			if (i==0) {
				continue;
				
			} else 
				if(num % i == 0) {
				System.out.println(i + ", ");
			}
		}
		
	}

}

package whileloop;

public class whileprimenumber {

	public static void main(String[] args) {
		int num=31,i=2;
		boolean flag = false;
		while ( i<=num/2) {
			i++;
			if (num % i ==0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number");
		else 
			System.out.println(num + " is not a prime number");
	}

}

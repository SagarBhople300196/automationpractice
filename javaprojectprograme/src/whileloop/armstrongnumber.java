package whileloop;

public class armstrongnumber {

	public static void main(String[] args) {
		int num=153,temp,rem=0;
		double sum=0;
		temp=num;
		while (temp>0) {
			rem=temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
		}
		if(num==sum) {
			System.out.println("given number is armstrong number ");
		} else {
			System.out.println("given number is not armstrong number ");
		}
	}

}

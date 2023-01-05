package forwhileloop;

public class forarmstrongnum {

	public static void main(String[] args) {
		int num=153,temp,rem=0;
		double sum=0;
		for (temp=num; temp>0;temp=temp/10) {
			rem=temp%10;
			sum=sum+rem*rem*rem;
		}
		if(num==sum) {
			System.out.println("given number is armstrong number ");
		} else {
			System.out.println("given number is armstrong number ");
		}

	}

}

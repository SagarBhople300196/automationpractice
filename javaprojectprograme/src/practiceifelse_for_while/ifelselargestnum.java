package practiceifelse_for_while;

public class ifelselargestnum {

	public static void main(String[] args) {
		int num1=7, num2=5, num3=4;
		if(num1>=num2 && num1>=num3) {
			System.out.println("largest number is : " +num1 );
		} else if (num2>=num1 && num2>=num3) {
			System.out.println("largest number is : " +num2 );
		}else
			System.out.println("largest number is : " +num3 );
	}

}

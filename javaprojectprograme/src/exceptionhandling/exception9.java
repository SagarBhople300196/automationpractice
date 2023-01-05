package exceptionhandling;

public class exception9 {

	
		public int divideNum(int m, int n) throws ArithmeticException
		{
			int div = m / n;
			return div;
		}

		// main method
		public static void main(String[] args) {
			exception9 obj = new exception9();
		//	System.out.println(obj.divideNum(45, 0));
			try {
				System.out.println(obj.divideNum(45, 7));
			} catch (ArithmeticException e) {
				System.out.println("\nNumber cannot be divided by 0");
			}
			System.out.println("Rest of the code..");
		}
	

	}



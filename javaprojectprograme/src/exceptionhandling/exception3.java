package exceptionhandling;

public class exception3 {


		public static void validateAge(int age) {
			if (age < 18) {
				// throw Arithmetic exception if not eligible to vote
				throw new ArithmeticException("Person is not eligible to vote");
			} else {
				System.out.println("Person is eligible to vote!!");
			}
		}
		// main method
		public static void main(String args1[]) {
			System.out.println("Prgram starts from here");
			// calling the function
			validateAge(19);
			System.out.println("rest of the code...");
		
	
		}

	}





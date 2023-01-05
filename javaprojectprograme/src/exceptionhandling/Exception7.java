package exceptionhandling;

class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  

public class Exception7 {

	public static void validateAge(int age) throws UserDefinedException {
		if (age < 18) {
			// throw Arithmetic exception if not eligible to vote
			throw new UserDefinedException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	public static void main(String args[]) {
	System.out.println("Main method started");
		try {
			validateAge(15);
		} catch (UserDefinedException e) {
			//e.printStackTrace();
			System.out.println("Exception found: "+e);
		}
		System.out.println("Rest of the code..");
	}
}




	

	 



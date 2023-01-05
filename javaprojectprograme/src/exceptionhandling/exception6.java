package exceptionhandling;

public class exception6 {
	
	class sagarexception extends Exception {
		public sagarexception(String str) {
			super(str);
		}
	}
	public class exceptionhandling12 {
		public void validateAge(int age) throws sagarexception {
			if(age<18) {
			//throw new sagarexception
			System.out.println("sagar exception says,you are not aligible for vote");	
			} else {
			System.out.println("person is eligible to vote");	
			}
		}
	}

	public static void main(String[] args) throws sagarexception {
		System.out.println("main method"); 
         validateAge(15);
         System.out.println("rest of the code ");
	}

	private static void validateAge(int i) {
		// TODO Auto-generated method stub
		
	}

	//private static void validateage(int i) {
		
		
	}

	
		
	



package stringclass;

public class example6 {

	public static void main(String[] args) {
		String str1 = "Dhanoripune";
		for(int i=0; i<str1.length();i++) {
			System.out.println((i)+" "+str1.charAt(i));
			
		}
		System.out.println("******************************");
		for(int i=str1.length()-1;i>=0 ;i--) {
			System.out.println((i)+" "+str1.charAt(i));
			
		}
		System.out.println("******************************");
		String temp="";
		for(int i=str1.length()-1; i>0;i--) {
		temp = temp +str1.charAt(i);
	}
		System.out.println("str1 :"+str1);
		System.out.println("temp :"+temp);
		System.out.println(reverseString("DhanoriPune"));
	}

	private static char[] reverseString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	}


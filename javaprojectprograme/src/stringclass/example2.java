package stringclass;

public class example2 {

	public static void main(String[] args) {
		String s1 = new String("banglore");
		String s2 = new String("mumbai");
		String s3 = new String("banglore");
        System.out.println("string s1 :"+s1);
        System.out.println("string s2 :"+s2);
        System.out.println("string s3 :"+s3);
        System.out.println("compare  s1 and s2 object based on address :"+(s1==s2));
        System.out.println("compare  s3 and s2 object based on address :"+(s3==s2));
        System.out.println("compare  s1 and s3 object based on address :"+(s1==s3));
        System.out.println("*************************************************");
        System.out.println("compare  s1 and s2 object based on address :"+s1.equals(s2));
        System.out.println("compare  s3 and s2 object based on address :"+s3.equals(s2));
        System.out.println("compare  s1 and s3 object based on address :"+s1.equals(s3));
	}

	}



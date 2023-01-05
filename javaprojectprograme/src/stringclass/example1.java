package stringclass;

public class example1 {

	public static void main(String[] args) {
		String s1 = "banglore";
		String s2 = "mumbai";
		String s3 = "banglore";
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

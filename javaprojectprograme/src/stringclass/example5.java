package stringclass;

public class example5 {

	public static void main(String[] args) {
		String s1 = "mumbai";
		String s2 = "mumbai";
		String s3 = "banglore";
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println("s3 :"+s3);
		System.out.println("char count:"+s1.length());
		System.out.println("char count:"+s2.length());
		System.out.println("char count:"+s3.length());
		System.out.println("compare s1 and s2 using equals :"+s1.equals(s2));
		System.out.println("compare s1 and s2 using == :"+(s1==s2));
		System.out.println("*************************************");
		System.out.println("compare s2 and s3 using equals :"+s2.equals(s3));
		System.out.println("compare s2 and s3 using == :"+(s2==s3));
		System.out.println("*************************************");
		System.out.println("compare s3 and s1 using equals :"+s3.equals(s1));
		System.out.println("compare s3 and s1 using == :"+(s3==s1));
		System.out.println("*************************************");
		String s4 = new String("mumbai");
		System.out.println("s4 :"+s4);
		System.out.println("compare s1 and s4 using equals :"+s1.equals(s4));
		System.out.println("compare s1 and s4 using == :"+(s1==s4));
		System.out.println("*************************************");
		String s5 = new String("mumbai");
		System.out.println("s5 :"+s5);
		System.out.println("compare s4 and s5 using equals :"+s4.equals(s5));
		System.out.println("compare s4 and s5 using == :"+(s4==s5));
		System.out.println("*************************************");
		String s6 = new String("hydrabad");
		System.out.println("s6 :"+s6);
		System.out.println("compare s1 and s6 using equals :"+s1.equals(s6));
		System.out.println("compare s1 and s6 using == :"+(s1==s6));
		
		
	}
	
	}



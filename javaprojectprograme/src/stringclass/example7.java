package stringclass;

public class example7 {

	public static void main(String[] args) {
		String s1 = "I am from MH, I am working in tcs, I working as QA delivery head";
		System.out.println("actual string  :"+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("**********************************");
         String s2 = "i am from UP";
         System.out.println("actual string :"+s2);
         String[] strAry2 =s2.split(" ",3);
         for(String s:strAry2) {
         System.out.println(s);
         
         }
         System.out.println("**********************************");
         String s3 = "i am from Pune";
         System.out.println("actual string :"+s3);
         String[] str =s3.split(" ");
         String temp="";
         
         
         for(int i=str.length-1;i>0;i--) {
         temp=temp+" "+str[i];
         }
         System.out.println("reverse statement :"+temp);  
         System.out.println("************************************");
         String s4 = "          i am sagar      ";
         System.out.println("actual string "+s4);
         System.out.println("actual string length :"+s4.length());
         System.out.println("actual string without spaces :"+s4.trim());
         System.out.println("actual string length without spaces :"+s4.trim().length());
         System.out.println("************************************");
         String s5 = "      i   am          sagar     ";
         System.out.println("actual string :"+s5);
         System.out.println("actual string length :"+s5.length());
         
         
}
	

}

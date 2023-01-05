package stringclass;

public class stringsampleprogram1 {

	public static void main(String[] args) {
		String s1 = "corejavabasics";
        System.out.println("actual length :"+s1.length());
        System.out.println("character at 3rd position :"+s1.charAt(2));
        System.out.println("substring from index 3 :"+s1.substring(3));
        System.out.println("substring from index 2 to 5 :"+s1.substring(2,5));
        System.out.println("substring from index 4 to 8  :"+s1.substring(4,8));
        String s2 = "core";
        String s3 = "javabasics";
        System.out.println("first value :"+s2);
        
        System.out.println("second value :"+s3);
        System.out.println("concanated string :"+s2.concat(s3));
        System.out.println("after concanated string :"+s2);
        System.out.println("after concanated string:"+s3);
        String p1 = "pune";
        String p2 = "mumbai";
        String x1 = s2.concat(s3);//corejavabasic
        String x2 = p1.concat(p2);//punemumbai
        String x3 = p1+p2;//punemumbai
        String x4 = x1.concat(x2);//corejavabasicpunemumbai
        String s5 = "learn share learn share";
        System.out.println("s5 size  :"+s5.length());
        System.out.println("index of share starts from :"+s5.indexOf("share"));
        String s6 = "Selenium";
        String s7 = "selenium";
        String s8 = "Selenium";
        System.out.println("checking equality of s6 and s7 "+s6.equals(s7));
        System.out.println("checking equality of s6 and s8 "+s6.equals(s8));
        System.out.println("checking equality of s6 and s7 with ignore case "+s6.equalsIgnoreCase(s7));
        String word1 = "CoreJava";
        System.out.println("convert in lowercase  :"+word1.toLowerCase());
        String word2 = "CoreJava";
        System.out.println("convert in uppercase  :"+word2.toUpperCase());
        String word4 = "    Learn Share Learn    ";
        System.out.println("Actual String: "+word4);//    Learn Share Learn    
        System.out.println("Actaul lenght is: "+word4.length());
        System.out.println("After trim String: "+word4.trim());//Learn Share Learn
        System.out.println("After trim lenght is:" + word4.trim().length());//Learn Share Learn
        String str1 = "CoreJavaBasic";
        System.out.println("Original String: " + str1);//CoreJavaBasic
        String str2 = str1.replace('a' ,'x') ;
        System.out.println("Replaced a with x -> " + str2);
        String str3=str1.replace("Java", "Net");
        System.out.println("Replaced 'Java' with 'Net' -> " + str3);
        String str4=str1.replaceFirst("a", "W");
        System.out.println("Replaced first 'a' with 'W' -> " + str4);
        String str5=" ";
        System.out.println("str5 is empty or not: "+str5.isEmpty());
        
        String str6=new String();
        System.out.println("str6 is empty or not: "+str6.isEmpty()); 
        
        
        
        
	}

}

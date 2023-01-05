package stringclass;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		String s1 = "coreJavaBasic";
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(7));
		for(int i=0; i<s1.length();i++) {
			System.out.println("char index :"+i+": "+s1.charAt(i));
		}
		System.out.println("***********************************");
		String s2 = "hi ia sagar from sungaon";
		for(int i=0; i<s2.length();i++) {
			System.out.println("char index :"+i+": "+s2.charAt(i));
		}
		String name;
		Scanner scn = new Scanner(System.in);
        System.out.println("enter your name");
        name=scn.next();
        System.out.println(" your name is "+name);
        String[] names = new String[5];
        for(int i=0;i<names.length;i++) {
        	System.out.println("enter emp name :");
        	names[i]=scn.next();
        }
        for(String n:names) {
        	System.out.println(n);
        }
	}

}

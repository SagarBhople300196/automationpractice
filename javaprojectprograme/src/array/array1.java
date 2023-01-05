package array;

public class array1 {

	public static void main(String[] args) {
	int a[]=new int[5];
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	System.out.println("***************after initilization****");
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	
    System.out.println("array element counts :"+a.length);
    System.out.println("*********normal for loop*********");
      for(int i=0;i<a.length;i++)
      {
    	  System.out.println(a[i]);
      }
      System.out.println("**********for each loop*******");
    	for(int num: a) {
    		  System.out.println(num);
    	}
    	char[] getarray=new char[4];
    	 getarray[0]='A';
    	 getarray[0]='B';
    	 getarray[0]='C';
    	 getarray[0]='D';
    	 
    	 char[] getarray2 = {'A','B','C','D'};
    	 char[] getarray3 = new char[]{'A','B','C','D'};
    	 
    	  System.out.println("**********for each loop*******");
    	  for(char num: getarray3) {
    		  System.out.println(num);    	  }
    	}

}
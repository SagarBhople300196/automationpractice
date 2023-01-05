package array;

public class array2 {

	public static void main(String[] args) {
		int age[] = {12,4,25,2,5};
		  System.out.println("access element ");
		  System.out.println("first element: "+ age[0]);
		  System.out.println("second element: "+ age[1]);
		  System.out.println("third element: "+ age[2]);
		  System.out.println("fourth element: "+ age[3]);
		  System.out.println("fifth element: "+ age[4]);
		  System.out.println("array size: "+ age.length);
		  System.out.println("************using for loop");
		  for(int i=0; i<age.length; i++) {
			  if(age[i]==25) {
				  System.out.println(age[i]);
				  break;
			  }else {
				  System.out.println(" age is not 25");
			  }
		  }
		  System.out.println("************using for each loop");  
	for(int a : age) {
		if(a==25) {
			  System.out.println(a);
			  break;
		}else {
			System.out.println(" age is not 25");
			
		}
	}
	}

}

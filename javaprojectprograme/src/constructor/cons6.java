package constructor;


  
  class c{
	  double i=10.0;

		c(double j) {
			i=j;
			
			System.out.println("class c is runnimg");
		}
  }
  public class cons6 {
	public static void main(String[] args) {
		System.out.println("main method is started");
		c a1=new c(13.57);
	System.out.println("constuctor c global variable is : "+a1.i);
	System.out.println("===========================================");	
	c a2= new c(1000.1);
	System.out.println("constuctor c global variable is : "+a2.i);
	System.out.println("main method is ended" );
		
	

	}
}


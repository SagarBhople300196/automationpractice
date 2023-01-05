package constructor;

public class cons7 {

	public static void main(String[] args) {
		System.out.println("main method is started");
		b c1=new b();
		System.out.println("constuctor b global variable is : "+c1.i);
	}
}
	class b{
		int i=19;
		b(){
			i=30;
			//System.out.println("constructor b is running");
		}
	}
	



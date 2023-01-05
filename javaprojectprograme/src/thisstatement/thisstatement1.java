package thisstatement;

class A1{
	A1 () {
		this(12);
		System.out.println("hello zero para");
	}
    A1 (double b){
    	
		System.out.println("hello double para "+b);
    }
   A1(int x) {
	   this(10.2);
		System.out.println("hello int para "+x);
   }
}


public class thisstatement1 {

	public static void main(String[] args) {
		A1 Y1= new A1();
		//A1 Y2= new A1(10.5);
	//	A1 Y3= new A1(20);

	}

}

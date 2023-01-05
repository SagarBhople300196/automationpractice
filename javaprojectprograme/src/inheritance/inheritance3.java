package inheritance;

class fourwheeler{
	public void vehicle() {
		System.out.println("i have 4 wheel");
	}
}
 class car extends fourwheeler{
	 public void type() {
		 System.out.println("i am car");
	 }
 }
 class maruti extends car{
	 public void company() {
		 System.out.println("name is maruti");
	 }
 }

public class inheritance3 {

	public static void main(String[] args) {
		maruti v1= new maruti();
		v1.vehicle();
		v1.type();
		v1.company();

	}

}

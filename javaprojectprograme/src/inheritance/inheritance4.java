package inheritance;
class vehicle{
	public void wheels() {
		System.out.println("i have wheels");
	}
}
class bike extends vehicle{
	public void countbikewh() {
		System.out.println("i am bike and has 2 wheel");
	}
}
class car1 extends vehicle{
	public void countcarwh() {
	System.out.println("i am car and has 4 wheel");
}
}
class truck extends vehicle{
	public void counttruckwh() {
		System.out.println("i am truck and has 6 wheel");
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		truck a1 =new  truck();
		a1.wheels();
		a1.counttruckwh();
		System.out.println("**********************************");
		car1 b1 = new car1();
		b1.wheels();
		b1.countcarwh();
		System.out.println("***********************************");
		bike c1 = new bike();
		c1.wheels();
		c1.countbikewh();
		
		

	}

}

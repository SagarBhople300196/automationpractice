package overriding;
class animal2 {
	public void move() {
		System.out.println("animal can move");
	}
	void display() {
		System.out.println("i am display of animal2");
	}
}
class dog2 extends animal2 {
	
	public void move() {
		super.move();
		System.out.println("dog can walk and bark");
		display();
	}
}

public class overriding2 {

	public static void main(String[] args) {
		animal2 v1 = new dog2();
		v1.move();

	}

}

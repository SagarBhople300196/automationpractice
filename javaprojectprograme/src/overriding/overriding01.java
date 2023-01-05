package overriding;

class animal {
	public void move () {
		System.out.println("animal can move");
	}
		}
	class dog extends animal {
		public void move() {
			System.out.println("dog can walk and run");
		}
		void bark() {
			System.out.println("dog can bark");
		}
	}


public class overriding01 {

	public static void main(String[] args) {
		animal d1 = new animal();
		d1.move();
		dog v1 = new dog();
		v1.move();
		v1.bark();
		animal a1 = new dog();
		a1.move();
		
		
	}

}

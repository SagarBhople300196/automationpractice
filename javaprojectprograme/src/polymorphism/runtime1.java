package polymorphism;
class animal{
	void eat() {
		System.out.println("animal eat");
	}
}
class herbivores extends animal {
	void eat() {
		System.out.println("herbivores eat");
	}
}
class omnivores extends animal {
	void eat() {
		System.out.println("omnivores eat");
	}
}
class carnivores extends animal {
	void eat() {
		System.out.println("carnivores eat");
	}
}

public class runtime1 {

	public static void main(String[] args) {
		animal a1 = new animal();
		a1.eat();
		animal a2 = new herbivores();
		a2.eat();
		animal a3 = new omnivores();
		a3.eat();
		animal a4 = new carnivores();
		a4.eat();

	}

}

package overriding;

class parent {
	static void m1() {
		System.out.println("parent class m1");
		
	}
	void m2() {
		System.out.println("parent class m2");
	}
}
class child extends parent {
	static void m1() {
		System.out.println("child class m1");
	}
	public void m2 () {
		System.out.println("child class m2");
	}
}

public class overriding4 {

	public static void main(String[] args) {
	parent v1 = new child();
		v1.m1();
		v1.m2();
		

	}

}

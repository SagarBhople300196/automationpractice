package overriding;

class parent1 {
	void show () {
		System.out.println("parent class show");
	}
}
class child1 extends parent1 {
	void show() {
		super.show();
		System.out.println("child class show");
	}
}
 class grandfather extends child1 {
	 void show() {
		 super.show();
			System.out.println("grandfather class show");
	 }
 }
public class overriding5 {

	public static void main(String[] args) {
		parent1 v1 = new grandfather();
				v1.show();
	}

}

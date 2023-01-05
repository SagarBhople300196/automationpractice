package overriding;
class man{
	void eat() {
		System.out.println("man can eating");
	}
}
	class boy extends man {
		public void eat () {
			System.out.println("boy can eating");
		}
	}

		public class overriding3 {
			public static void main(String[] args) {
				boy b1 = new boy();
				b1.eat();
			}
		}


package overriding;


	class fruitA {
		int fruitAge;
		fruitA() {
			System.out.println("i am fruit constructor");
			fruitAge=7;
		}
		public void taste () {
			System.out.println(" fruitS are sweet");
		}
	}
	class mango extends fruitA {
		int fruitAge;
		mango() {
			System.out.println("i am mango constructor");
			fruitAge=5;
			}
		public void taste () {
			System.out.println("mango are tart in taste");
		}
		public void shape ( ) {
			System.out.println("mango are round in shape");
		}
		
		
	}
	public class overriding1 {
	public static void main(String[] args) {
		mango m1 = new mango ();
		m1.shape();
		m1.taste();
		System.out.println(m1.fruitAge);
		fruitA f1 = new fruitA();
		f1.taste();
		System.out.println(f1.fruitAge);
		

	}

}

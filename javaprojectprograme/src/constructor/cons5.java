package constructor;
 class A  {
	int i=10;
	A(){
	System.out.println("running class A constructor");
	}
	void display() {
		System.out.println("i am display of class A");
		}
	}
	class X {
		int j=10;
	
	X() {
		System.out.println("running class X constructor");
	}
	void display() {
		System.out.println("i am display of class X");
	}
	}
		public class cons5 {
			void display() {
				System.out.println("i am display od class cons5");
			}
		
		public static void main(String args[]) {
				
			System.out.println("main class is started ");
			A a1= new A();
			a1.display();
			System.out.println("class A global variable i : "+a1.i);
			X x1= new X();
			x1.display();
			System.out.println("class X global variable j : "+x1.j);
			cons5 c1= new cons5();
			c1.display();
			System.out.println("main class is ended ");
		
	}
}

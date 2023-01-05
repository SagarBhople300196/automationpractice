package Thiskeywords;


	class sagar{
		void m() {
			System.out.println("hello m");
		}
		void n() {
			System.out.println("hello n");
			this.m();
		}
	}
	public class thiskey5 {
		void method1() {
			System.out.println("hello method 1");
		}
		void method2() {
			System.out.println("hello method 2");
			this.method1();
		}

	public static void main(String[] args) {
		thiskey5 d1 = new thiskey5();
		d1.method2();
		d1.method1();
		sagar w1= new sagar();
		w1.m();
		w1.n();
	}

}

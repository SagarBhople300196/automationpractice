package nonprimitive_derivedcasting;

class A {
	void test1() {
		System.out.println("running test1");
	}
}
class B extends A {
	void test2() {
	System.out.println("running test2");
}
}
class C extends B {
	void test3() {
		System.out.println("running test3");
	}
}

public class explicitupcasting1 {

	public static void main(String[] args) {
		C c1 = new C();
		B b1 = (B)c1; //explicit upcasting
		c1.test3();
		c1.test1();
		c1.test2();
		A a1= (A)b1;// explicit upcasting
		a1.test1();
		
		C c2= (C)b1;
		c2.test1();
		c2.test2();
		c2.test3();
		
		

	}

}

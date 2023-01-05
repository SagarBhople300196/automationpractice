package inheritance;

class A {
	
	
	static int a= 10;
	     int b= 20;
	     double c =30.5;
}
class B {
	
	static int x= 40;
    int y= 50;
    double z =60.5;
	}
class C {
	static int p= 70;
    int q= 80;
    double r =90.5;
}

public class inheritance0 {
	public static void main(String[] args) {
		System.out.println("class A static member "+A.a);
		System.out.println("class B static member "+B.x);
		System.out.println("class C static member "+C.p);
		A a1 = new A();
		System.out.println("class A non static member "+a1.b);
		System.out.println("class A non static member "+a1.c);
		B b1 = new B();
		System.out.println("class B non static member "+b1.y);
		System.out.println("class B non static member "+b1.z);
		C c1 = new C();
		System.out.println("class C non static member "+c1.q);
		System.out.println("class C non static member "+c1.r);
	}

}

package inheritance;

class A1 {
	
	
	static int a= 10;
	     int b= 20;
	     double c =30.5;
}
class B1 extends A1 {
	
	static int x= 40;
    int y= 50;
    double z =60.5;
	}
class C1 extends B1 {
	static int p= 70;
    int q= 80;
    double r =90.5;
}

public class inheritance1 {
	public static void main(String[] args) {
		System.out.println("class A static member "+A1.a);
		System.out.println("class B static member "+B1.x);
		System.out.println("class C static member "+C1.p);
		C1 a1 = new C1();
		System.out.println("with class c refer non static member "+a1.b );
		System.out.println("with class c refer non static member "+a1.c );
		System.out.println("with class c refer non static member "+a1.y );
		System.out.println("with class c refer non static member "+a1.z );
		System.out.println("with class c refer non static member "+a1.q );
		System.out.println("with class c refer non static member "+a1.r );
		System.out.println("********************************* ");
	     B1 b1= new B1();
	 	System.out.println("with class c refer non static member "+b1.b );
		System.out.println("with class c refer non static member "+b1.c );
		System.out.println("with class c refer non static member "+b1.y );
		System.out.println("with class c refer non static member "+b1.z );
		

	}

}

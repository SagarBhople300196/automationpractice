package polymorphism;
class shapes{
	public void area() {
		System.out.println("find area");
	}
	public void area(int r) {
		System.out.println("circle area :"+3.14*r*r);
	}
	public void area(double b, double h) {
		System.out.println("triangle area :"+0.5*b*h);
	}
	public void area(int l, int b ) {
		System.out.println("rectangle area :"+l*b);
	}
}

public class overloading {

	public static void main(String[] args) {
		shapes s1 = new shapes();
		s1.area();
		s1.area(10);
		s1.area(20,30.0);
		s1.area(6,5);
		

	}

}

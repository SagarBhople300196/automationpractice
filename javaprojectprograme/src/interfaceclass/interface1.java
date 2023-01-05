package interfaceclass;

interface drawable {
	int salary= 25000;
	void draw();
}
class rectangle1 implements drawable {
	public void draw() {
		System.out.println("draw rectangle");
	}
}
class circle2 implements drawable{
	public void draw() {
		System.out.println("draw circle");
	}
}

public class interface1 {

	public static void main(String[] args) {
		System.out.println("interface variable salary "+ drawable.salary);
		rectangle1 r1 = new rectangle1();
		r1.draw();
		circle2 c1 = new circle2();
		c1.draw();
		drawable d1 = new rectangle1();
		d1.draw();

	}

}

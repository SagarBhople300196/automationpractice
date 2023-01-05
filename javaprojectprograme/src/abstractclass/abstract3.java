package abstractclass;

abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	public void draw() {
		System.out.println("rectangle shape");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("circle shape");
	}
}
public class abstract3 {

	public static void main(String[] args) {
		shape r1 = new rectangle();
		r1.draw();
		shape c1 = new circle();
		c1.draw();
		
	}

}

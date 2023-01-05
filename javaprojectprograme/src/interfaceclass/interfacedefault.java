package interfaceclass;
interface drawable2{
	void draw();
	default void msg() {
		System.out.println("default method");
	}
	static int cube(int x) {
		return x*x*x;
	}
}
class rectangle4 implements drawable2{
	public void draw() {
		System.out.println("hello rectangle");
	}
}

public class interfacedefault {

	public static void main(String[] args) {
		drawable2 d1 = new rectangle4();
		d1.draw();
		d1.msg();
		System.out.println(drawable2.cube(3));

	}

}

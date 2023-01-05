package interfaceclass;

interface printable {
	int age=30;
	void print();
	void print1();
}

interface showable {
	public void show();

	public void print();

	public void print1();
}


public class interface3 implements printable,showable {
	public static int age= 25;
	public void print() {
		System.out.println("hello print ");
	}
	public void show() {
		System.out.println("welcome show ");
	}

	public static void main(String[] args) {
		interface3 i1 = new interface3();
		i1.print();
		i1.show();
		System.out.println("age "+printable.age);
		System.out.println(interface3.age);

	}

}

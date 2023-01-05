package interfaceclass;
interface printable2 {
	void print();
}
interface showable2 extends printable2 {
	void show();
}


public class interface5 implements showable2{
	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		interface5 n1 = new interface5();
		n1.print();
		n1.show();
		showable2 s1 = new interface5();
		s1.show();
		s1.print();

	}

}

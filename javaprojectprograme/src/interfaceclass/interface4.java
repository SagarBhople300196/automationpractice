package interfaceclass;

interface printable1 {
	void print1();
}
interface showable1 {
	void print1();
}


 public class interface4 implements printable,showable {
	public void print1() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		interface4 b1 = new interface4();
		b1.print1();
		printable p1 = new interface4();
		p1.print1();
		
	   showable s1 = new interface4();
	   s1.print1();
		
		

	}


		
	}

}

package nonprimitive_derivedcasting;
class parent {
	void myhome() {
		System.out.println("parent home");
		
	}
}
class child extends parent {
	void mycar() {
	System.out.println("child car");
}
}

public class casting {

	public static void main(String[] args) {
		child c1 = new child();
		c1.mycar();
		c1.myhome();
		parent p1 = new parent();
		p1.myhome();
		System.out.println("*************************");
		parent n1 = new child();
		n1.myhome();
		System.out.println("*************************");
		child c2 = new child();
		c2.myhome();
		c2.mycar();
		System.out.println("*************************");
		parent c3 = c2;
		c3.myhome();
		//c3.mycar();
	}

}

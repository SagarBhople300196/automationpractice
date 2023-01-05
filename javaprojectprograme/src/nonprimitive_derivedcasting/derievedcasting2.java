package nonprimitive_derivedcasting;

class jd {
	public void printme1() {
		System.out.println("jd printme method");
	}
	void display() {
		System.out.println("jd display method");
	}
}
class java extends jd {
	public void printme2() {
		System.out.println("java printme method");
	}
	void display() {
		System.out.println("java display method");
	}
}
class android extends java {
	
	public void printme3() {
		System.out.println("android printme method");
	}
	void display() {
		System.out.println("android display method");
	}
}

public class derievedcasting2 {

	public static void main(String[] args) {
		jd j1 = new android();
		j1.printme1();
		j1.display();
		System.out.println("****************************");
		java j2 = (java)j1;
		j1.printme1();
		j2.printme2();
		j2.display();
		System.out.println("*********************");
		android a1 = (android)j1;
		a1.printme1();
		a1.printme2();
		a1.printme3();
		a1.display();
		

	}

}

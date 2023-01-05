package Thiskeywords;

public class thiskey6 {
	int age;
	void call() {
		System.out.println("i am call method");
	}
	void n(int age) {
		System.out.println("local variable : "+ age);
		System.out.println("global variable : "+ this.age);
	this.call();
	System.out.println("this keyword value is : "+ this);
	}

	public static void main(String[] args) {
	thiskey6 v1 = new thiskey6();
		v1.n(10);
	}

}

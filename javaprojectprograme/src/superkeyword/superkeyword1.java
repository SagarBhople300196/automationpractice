package superkeyword;

class animal2 {
	void eat() {
		System.out.println("eat() of class animal");
	}
}
class dog extends animal2 {
	void eat() {
		System.out.println("eat() of class dog");
	}
	void bark() {
		System.out.println("bark() of class dog");
	}
	void work () {
		super.eat();
		bark();
		eat();
		
		System.out.println("work() of class dog");
	}
}

public class superkeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              dog b1 = new dog();
              b1.work();
	}

}

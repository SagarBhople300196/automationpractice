package interfaceclass;

interface animal1{
	int age= 12;
	public void animalsound();
	public void sleep();
}
class pig3 implements animal1{
	public void animalsound() {
		System.out.println("pig sound wee wee");
	}
	public void sleep() {
		System.out.println("ZZzz");
	}
}

public class interface6 {

	public static void main(String[] args) {
		pig3 p1 = new pig3();
		p1.animalsound();
		p1.sleep();
		System.out.println(animal1.age);
		
	}

}

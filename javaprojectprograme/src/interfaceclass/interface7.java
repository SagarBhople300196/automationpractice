package interfaceclass;

interface animal4{
	void animalsound();
	void sleep();
}

interface reptile {
	void colour();
	
}
class pig8 implements animal4 {
	public void animalsound() {
		System.out.println("pig sound wee wee");
	}
	public void sleep() {
		System.out.println("Zzzzz");
	}
}
class dog3 extends pig8 implements reptile {
	public void animalsound() {
		System.out.println("dog says bho bho");
	}
	public void colour() {
		System.out.println("colour blue");
	}
	
}

public class interface7 {

	public static void main(String[] args) {
		pig8 p1 = new pig8();
		p1.animalsound();
		p1.sleep();
		dog3 d1 = new dog3();
		d1.animalsound();
		d1.colour();

	}

}

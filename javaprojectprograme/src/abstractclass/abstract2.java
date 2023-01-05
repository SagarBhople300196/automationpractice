package abstractclass;

abstract class bike1 {
	abstract void run();
	void speed (int spd) {
		System.out.println("bike speed "+spd);
		}
	}
class honda extends bike1 {
	void run() {
		System.out.println("honda running safely ");
	}
	void speed(int spd) {
		System.out.println("honda speed "+spd);
		super.speed(120);
	}
	void colour() {
		System.out.println("honda colour black");
	}
}
public class abstract2 {

	public static void main(String[] args) {
		honda h1 = new honda();
		h1.run();
		h1.speed(60);
		h1.colour();
        bike1 b2 = new honda();
        b2.run();
        b2.speed(20);
	}

}

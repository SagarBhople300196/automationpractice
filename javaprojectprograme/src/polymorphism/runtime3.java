package polymorphism;
class car1 {
	void run(){
		System.out.println("car running");
	}
}
class innova extends car1{
	void run() {
		System.out.println("innova  running at 120km");
	}
}

public class runtime3 {

	public static void main(String[] args) {
		//car1 c = new car1();
		//c.run();
		car1 c1 = new innova();
		c1.run();
	}

}

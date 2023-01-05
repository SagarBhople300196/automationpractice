package polymorphism;
class vehicle{
	void run() {
		System.out.println("vehicle is moving");
	}
}
class car extends vehicle {
	void run() {
		System.out.println("car is moving");
	}
}
public class overriding {

	public static void main(String[] args) {
		car c1 = new car();
		c1.run();
		vehicle v1 = new car();
		v1.run();
		car c2 = (car)v1;
		c2.run();
		vehicle c3 = (vehicle)v1;
		c3.run();
		

	}

}

package exceptionhandling;

public class exception5 {
	public static void signaltimeout(long time) {
		System.out.println("signal started");
		if (time > 1000) {
			try {

				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("signal over");
	}

	System.out.println("signal ends");

	}

	public static void main(String[] args) {
		System.out.println("i am main");
		signaltimeout(500);
		System.out.println("signl over ended"); 



	}
}

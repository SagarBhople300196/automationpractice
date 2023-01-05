package exceptionhandling;

public class exception4 {

	
		public static void signaltimeout(long time) throws InterruptedException {
			System.out.println("signal started");
			
			if(time>1000) {
				Thread.sleep(time);
			}
			else {  
				System.out.println("signal over");
			}
			System.out.println("signal ends");
		}
		public static void main(String[] args) {
			
			System.out.println("i am main");
			
			try {
				signaltimeout(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("rest of the code");
	}

}

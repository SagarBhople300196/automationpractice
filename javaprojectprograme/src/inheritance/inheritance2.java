package inheritance;

import java.applet.Applet;

class fruit {
	fruit() {
		System.out.println("i am fruit cons");
	}
	public void taste() {
		System.out.println("fruits are sweet");
	}
}
	class apple extends fruit{
		apple(){
		System.out.println("i am apple cons");
		}
		public void shape () {
			System.out.println("apple is round");
		}
}

public class inheritance2 {
	

	public static void main(String[] args) {
		apple c1= new apple();
		c1.taste();
		c1.shape();
	}

}

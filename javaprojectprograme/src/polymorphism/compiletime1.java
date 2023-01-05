package polymorphism;

public class compiletime1 {

	
		static void sum(int a, int b) {
			int c = a+b;
          System.out.println("addition "+c);
		}
		 static void sum(int d, int f, int g) {
			int h=d+f+g;
			System.out.println("addition "+h);
		}
		public static void main(String[] args) {
			compiletime1.sum(10,20,30);
	}

}

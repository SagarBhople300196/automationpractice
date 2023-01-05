package method;

public class method8 {
	public void square() {
		System.out.println("no parameter method called");
	}
	public void square(int number) {
		int square=number*number;
		System.out.println("method with ionteger argumentcalled :"+square);
		}
	public void square(float number) {
		float square=number*number;
		System.out.println("method with float argument called :"+square);
		}

	public static void main(String[] args) {
		method8 obj = new method8();
		obj.square(2.5f);
		obj.square();
		obj.square(5);
		
	}

}

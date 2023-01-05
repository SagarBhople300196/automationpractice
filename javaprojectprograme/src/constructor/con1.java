package constructor;

public class con1 {
	con1() {
		System.out.println("this is a zero pra const");
		}
	con1(int num1, int num2) {
		System.out.println("this is a int int paramiterised const");
		
	}
	con1(double a,int b) {
		System.out.println("this is a double int paramiterised const");
	}
	con1(float c, double d){
		System.out.println("this is a float double paramiterised const");
	}
	
	public static void main(String[] args) {
		con1 c1 = new con1();
		con1 c2 = new con1(20,10);
		con1 c3 = new con1(10.5,30);
		con1 c4 = new con1(30f,40d);
	}

}

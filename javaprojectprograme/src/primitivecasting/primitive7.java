package primitivecasting;

class sample3{
	double y=20;
	double test2() {
		System.out.println("running test1");
		return 5;
		
	}
}

public class primitive7 {

	public static void main(String[] args) {
		sample3 v1 = new  sample3();
		int res= (int)v1.test2();
		System.out.println("return values "+res);
	}

}

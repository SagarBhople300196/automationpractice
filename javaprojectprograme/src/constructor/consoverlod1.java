package constructor;

public class consoverlod1 {
	consoverlod1() 
	{
		System.out.println("zero parametarised constructor");
		System.out.println("having no parameter");
	}
	consoverlod1(int a) {
		System.out.println(" parametarised constructor");
		System.out.println("having int parameter");
	}
	consoverlod1(int b, double c) {
		System.out.println(" parametarised constructor");
		System.out.println("having int double parameter");
	}
	consoverlod1(float d, double e) {
		System.out.println(" parametarised constructor");
		System.out.println("having float double parameter");
	}
	public static void main(String[] args) {
		consoverlod1 v1= new consoverlod1(0.05f,0.13);
		consoverlod1 v2= new consoverlod1(5,0.13);
		consoverlod1 v3= new consoverlod1(0);
		consoverlod1 v4= new consoverlod1();
	}

}

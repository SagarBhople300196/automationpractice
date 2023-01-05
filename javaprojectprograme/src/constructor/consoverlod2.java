package constructor;

public class consoverlod2 { 
	int age=25;
	double salary=23004;
	consoverlod2(){
		System.out.println("===============zero parameterised constructor started ===========");
		System.out.println("having no parameter");
		System.out.println("===============zero parameterised constructor ends ===========");
		
	}
	consoverlod2(int a){
		System.out.println("===============int parameterised constructor started ===========");
		System.out.println("having int parameter");
		age=25;
		System.out.println("===============int parameterised constructor ends ===========");
	}
	consoverlod2(double b, float c){
		System.out.println("===============double,float parameterised constructor started ===========");
		System.out.println("having double float  parameter");
		System.out.println("===============double float  parameterised constructor ends ===========");
		
	}
	consoverlod2(){
		
	}
	consoverlod2(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

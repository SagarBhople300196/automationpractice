package Thiskeywords;

public class thiskey7 {
	int variable=12;
	int age=26;
	void method (int variable) {
//		System.out.println(" local variable : "+variable);
//		System.out.println(" global variable : "+this.variable);
		this.variable=variable;
//		System.out.println(" local variable : "+variable);
//		System.out.println(" global variable : "+this.variable);
	}
	void method() {
		 int variable=6;
		//System.out.println(" local variable : "+variable);
		
	}

	public static void main(String[] args) {
		thiskey7 v1= new thiskey7();
		v1.method(40);
		System.out.println("v1 for with para :"+v1.variable);
		v1.method();
		System.out.println("v1 for without para"+v1.variable);
		
		//System.out.println(" global variable : "+v1.variable);
		thiskey7 v2= new thiskey7();
		v2.method();
		System.out.println(" v2 for without para : "+v2.variable);
	}

}

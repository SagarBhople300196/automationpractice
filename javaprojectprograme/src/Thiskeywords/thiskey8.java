package Thiskeywords;

public class thiskey8 {

	
		int variable=51;
		void method(int variable) {
			System.out.println(" local variable : "+variable);
			 variable=10;
			 System.out.println(" local variable : "+variable);
			 System.out.println(" instance variable : "+this.variable);;
			 this.variable=variable;
			 System.out.println(" local variable : "+variable);
			 System.out.println(" instance variable : "+this.variable);
		}
		void method() {
			int variable=40;
			 System.out.println(" instance variable : "+this.variable);
			 System.out.println(" local variable : "+variable);
             this.variable=variable;
             System.out.println(" local variable : "+variable);
             System.out.println(" instance variable : "+this.variable);
	}
		public static void main(String[] args) {
			thiskey8 b1= new thiskey8();
			b1.method(20);
			b1.method();
			 System.out.println(" instance variable : "+b1.variable);
			 thiskey8 b2 = new thiskey8();
			 System.out.println(" local variable : "+b2.variable);
		}

}

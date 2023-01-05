package inheritance;
class A2{
	void msg () {
	System.out.println("hello");
}
}
class B2 {
	void msg () {
		System.out.println("good morning");
	}
}
 
 class inheritance5 extends A2,B2 {
	inheritance5 (){
		super();
		
	}

	public static void main(String[] args) {
		inheritance5 c1 = new inheritance5();
		c1.msg();

	}

}

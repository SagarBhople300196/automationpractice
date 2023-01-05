package inheritance;
class grandfather{
	grandfather(){
		System.out.println("i am grandfather constructor");
	}
	void myhome() {
		System.out.println("i am home of grandfather");
	}
}
class father extends grandfather{
	father(double d){
		super();
		System.out.println("i am father constructor");
	}
	void car() {
		System.out.println("i am car of father");
	}
}
class child extends father {
	child(int i){
		super(10.2);
		System.out.println("i am child cons");
	}
	void bike () {
		System.out.println("i am bike of child");
	}
}

public class inheritance6 {

	public static void main(String[] args) {
		child c1= new child(20);
		c1.myhome();
		c1.car();
		c1.bike();
		System.out.println("i*************************************");
		father b1=c1;
		b1.myhome();
		b1.car();
		System.out.println("***************************************");
		grandfather n1=c1;
		n1.myhome();
		System.out.println("*************************************");
		grandfather n2 = new grandfather();
		
		

	

}
}

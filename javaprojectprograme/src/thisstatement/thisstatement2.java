package thisstatement;

class student{
	student() {
		this(30.2f);
		System.out.println("this is zerp para :");
	}
	student(float b){
		this(40.50);
		System.out.println("this is float para :"+b);
	}
	student(double c){
		System.out.println("this is double para :"+c);
	}
}
public class thisstatement2 {

	public static void main(String[] args) {
		student v1 = new student();
	}

}

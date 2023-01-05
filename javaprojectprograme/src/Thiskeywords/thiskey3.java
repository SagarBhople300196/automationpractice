package Thiskeywords;

public class thiskey3 {
	int rollno;
	float fee;

	public static void main(String[] args) {
		thiskey3 b1 = new thiskey3(101, 52000f);
		b1.display();
	}

	thiskey3(int rollno, float fee) {

		System.out.println("local variable : " + rollno);
		System.out.println("local variable : " + fee);
		System.out.println("global variable : " + this.rollno);
		System.out.println("global variable : " + this.fee);
		this.rollno = rollno;
		this.fee = fee;
		System.out.println("local variable : " + rollno);
		System.out.println("local variable : " + fee);
		System.out.println("global variable : " + this.rollno);
		System.out.println("global variable : " + this.fee);

	}

	void display() {
		System.out.println(rollno + " " + fee);
	}
}

class keyword {

}

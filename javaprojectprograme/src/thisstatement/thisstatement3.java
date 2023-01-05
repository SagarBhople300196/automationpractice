package thisstatement;
class student1 {
	int rollno;
	float fee;
student1(int rollno){
	this.rollno=rollno;
	}
		student1(int rollno, float fee) {
	   this( rollno);
		this.fee =fee;
	
	}
		void display() {
			System.out.println(rollno+" "+fee);
		}
}

public class thisstatement3 {

	public static void main(String[] args) {
		System.out.println("***********creating s1 object************** :");
		student1 m1 = new student1(100001,60000f);
		System.out.println(m1.rollno+"    "+m1.fee);
		System.out.println("***********creating s2 object************** :");
		student1 m2 = new student1(102,20000);
		System.out.println(m2.rollno+"    "+m2.fee);
		System.out.println("***********display************** :");
	    m1.display();
	    m2.display();
	}

}

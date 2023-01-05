package Thiskeywords;

public class thiskey2 {
	int rollno=101;
	float fee=2303.3f;
	thiskey2(int rollno, float fee)
	{
		
System.out.println( "local variable : "+rollno);
System.out.println( "local variable : "+fee);
System.out.println( "global variable : "+this.rollno);
System.out.println( "global variable : "+this.fee);
this.rollno=rollno;
this.fee=fee;
System.out.println( "local variable : "+rollno);
System.out.println( "local variable : "+fee);
System.out.println( "global variable : "+this.rollno);
System.out.println( "global variable : "+this.fee);

	}
	void display() {
		System.out.println( rollno + " " +fee);
	}
}
	class A{
		
	public static void main(String[] args) {
		thiskey2 b1= new thiskey2(101,52000f);
				b1.display();
	}
	}



package objectclass1;

class demo1{
	void display() {
		 System.out.println("i am display ");
	}
	
}

public class objectclass1 extends demo1{
	int lastroll=100;
	int rollno;
	
	objectclass1()
	{
		rollno=lastroll;
		lastroll++;
	}

	public static void main(String[] args) {
		objectclass1 s = new objectclass1();
		 System.out.println(s);
		 System.out.println(s.toString());
		 demo1 d1 = new demo1();
		 System.out.println(d1.toString());
		 demo1 d3 = new demo1();
		 System.out.println(d3);
		 demo1 d2 = new objectclass1();
		 System.out.println(d2);
		 
		 

	}

}

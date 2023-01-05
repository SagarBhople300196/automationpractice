package objectclass1;

class demo2{
	void display() {
		 System.out.println("i am display");
	}
}

public class objectclass2 extends demo2 {
	int lastroll=200;
	int rollno;
	objectclass2()
	{
		rollno=lastroll;
		lastroll++;
	}

	public static void main(String[] args) {
		objectclass2 v = new objectclass2();
		 System.out.println(v);
		 System.out.println(v.toString());
		 System.out.println(v.hashCode());
		 demo2 d = new demo2();
		 System.out.println(d);
		 System.out.println(d.toString());
		 System.out.println(d.hashCode());
		
		

	}

}

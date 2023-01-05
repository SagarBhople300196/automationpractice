package objectclass1;

class demo3{
	void display() {
		System.out.println("i am display of demo3 ");
	}
}

public class objectclass3 extends demo3 {
	
	static int lastroll=300;
	    int rollno;
	    objectclass3()
	    {
	    	rollno=lastroll;
	    	lastroll++;
	    }
	    @Override
	    void display() {
	    	System.out.println("i am display of objectclass");
	    }
	    @Override
	    public int hashCode() {
	    	return rollno;
	    }
	    

	public static void main(String[] args) {
		objectclass3 c = new objectclass3();
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println("hashcode() value from objectclass2 "+c.hashCode());
		c.display();
		demo3 d = new demo3();
		System.out.println(d.toString());
		System.out.println("hashcode() value from demo "+d.hashCode());

	}

}

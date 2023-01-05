package objectclass1;

class demo4{
	void display() {
		System.out.println("hello");
	}
}

public class obectclass4 extends demo4{

	

		static int last_roll = 100;
		int roll_no;
		// Constructor
		obectclass4()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }
		@Override
		public int hashCode() {
			return 505;
		}
		@Override
	    public String toString()
	    {
	        return "BasicCoreJava";
	    }
		// Driver code
		public static void main(String args[]) {
			obectclass4 s = new obectclass4();
			// Below two statements are equivalent
			System.out.println(s.hashCode());
			System.out.println(s);
			 demo4 t1=new demo4();
			 System.out.println(t1);
			 System.out.println(t1.hashCode());
	}

}

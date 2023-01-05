package nonprimitive_derivedcasting;

class pune {
	void deccan() {
		System.out.println("i am in deccan");
	}
}
class mumbai extends pune {
	void kurla() {
		System.out.println("i am in kurla");
	}
}

public class upcasting1 extends mumbai {
	void mycity() {
		System.out.println("i am in city");
	}

	public static void main(String[] args) {
		
         upcasting1 u1 = new upcasting1(); 
         mumbai m1 = new upcasting1();//implicit upcasting
         mumbai m2= u1;
         
         pune p1 = new upcasting1();
         pune p2 = (pune)u1;//explicit upcasting
         p2.deccan();//
         
         
	}

}

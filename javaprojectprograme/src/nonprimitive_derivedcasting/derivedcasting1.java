package nonprimitive_derivedcasting;
class member {
	long phone;
	void chat() {
		System.out.println("chatiing in whatsup");
	}
}
class admin extends member {
	void addnumber () {
		System.out.println("add number in whatsup");
	}
}

public class derivedcasting1 {

	public static void main(String[] args) {
		member mem = new admin();
		mem.phone=86;
		mem.chat();
		admin a1= (admin)mem;
		a1.chat();
		a1. addnumber();
		System.out.println(a1.phone);
		
		

	}

}

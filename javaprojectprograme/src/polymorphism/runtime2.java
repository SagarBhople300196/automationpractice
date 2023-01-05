package polymorphism;
class hillstation {
	void location() {
      System.out.println("location in");
	}
	void famousfor() {
		 System.out.println("famous for");
	}
}
class manali extends hillstation {
	
	void location() {
	      System.out.println("location in himachal pradesh");
		}
		void famousfor() {
			 System.out.println("famous for advenchar sport ");
		}
}
class masoori extends hillstation {

	void location() {
	      System.out.println("location in uttarakhand");
		}
		void famousfor() {
			 System.out.println("famous for educational; institution");
		}
}
class gulmarg extends hillstation {

	void location() {
	      System.out.println("location in jand k");
		}
		void famousfor() {
			 System.out.println("famous for skiing ");
		}
}

public class runtime2 {

	public static void main(String[] args) {
		hillstation h1 = new hillstation();
		h1.location();
		h1.famousfor();
		System.out.println("***********************");
		hillstation h2 = new manali();
		h2.location();
		h2.famousfor();
		System.out.println("***********************");
		hillstation h3 = new masoori();
		h3.location();
		h3.famousfor();
		System.out.println("***********************");
		hillstation h4 = new gulmarg();
		h4.location();
		h4.famousfor();
		
	}

}

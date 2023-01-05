package interfaceclass;
interface Bank{
	float rateofinterest();
}
 class SBI2 implements Bank{
	public float rateofinterest() {
		return 7.75f;
	}
}
 class PNB1 implements Bank {
	 public float rateofinterest() {
		 return 8.5f;
	 }
 }

public class interface2 {

	public static void main(String[] args) {
		SBI2 s1 = new SBI2();
		System.out.println("SBI ROI "+ s1.rateofinterest());
		PNB1 P1 = new PNB1();
		System.out.println("PNB ROI "+ P1.rateofinterest());
		Bank b1 = new SBI2();
		System.out.println(" ROI "+ b1.rateofinterest());
		

	}

}

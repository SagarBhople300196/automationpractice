package abstractclass;

abstract class RBIbank{
	abstract double getrateofinterestforhomeloan();
	final void loan() {
		System.out.println("loan as per RBI");
	}
}
class SBI extends RBIbank{
	double getrateofinterestforhomeloan() {
		return 6.75;
	}
}
class PNB extends RBIbank{
	double getrateofinterestforhomeloan() {
		return 7.5;
	}
}

public class abstract4 {

	public static void main(String[] args) {
		PNB p1 = new PNB();
		System.out.println("PNB rate of interest is  "+ p1.getrateofinterestforhomeloan() + "%");
		p1.loan();
        SBI s1 = new SBI ();
        System.out.println("SBI rate of interest is  "+ s1.getrateofinterestforhomeloan() + "%"); 
        s1.loan();
        RBIbank r1 = new SBI ();
        System.out.println(" RBI reference but object of SBI rate of interest is  "+ r1.getrateofinterestforhomeloan() + "%");
	}

}

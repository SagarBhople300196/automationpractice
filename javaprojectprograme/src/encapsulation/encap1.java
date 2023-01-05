package encapsulation;

class demo2 {
	private int ssn;
	private int empage;
	
	public int getssn() {
		return ssn;
	}
	public int getempage() {
		return empage;
	}
	
	public void setssn(int ssn) {
		this.ssn=ssn;
	}
	public void setempage(int empage) {
		this.empage=empage;
	}
}

public class encap1 {

	public static void main(String[] args) {
		demo2 w1 = new demo2();
		System.out.println("ssn "+w1.getssn());
		System.out.println("empage "+w1.getempage());
		
	}

}

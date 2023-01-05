package finalkeyword;

public class finalkeyword4 {
	
	int cube(final int n) {
		System.out.println(n);
		//n=n+2;
		return n*n*n;
		
	}

	public static void main(String[] args) {
		finalkeyword4 c1 = new finalkeyword4();
		
		System.out.println("cube :"+c1.cube(2));
	}

}

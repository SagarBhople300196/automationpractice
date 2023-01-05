package finalkeyword;

public class finalkeyword3 {
	
	final int speedlimit;
	finalkeyword3(){
		speedlimit=70;
		System.out.println("speedlimit");
	}

	public static void main(String[] args) {
		finalkeyword3 v1 = new finalkeyword3 ();
		
		System.out.println("speedlimit :"+v1.speedlimit);
	}

}

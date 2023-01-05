package forwhileloop;

public class forfactornegativenum {
	public static void main(String [] args) {
		int num=-8;
		for(int i=num; i<= Math.abs(num); ++i) {
			if (i==0) {
				continue;
			} else
				if(num % i==0) {
					System.out.print(i + ", ");
				}
			}
		}
	}



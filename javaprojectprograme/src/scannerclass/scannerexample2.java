package scannerclass;

import java.util.Scanner;

public class scannerexample2 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your address");
		String address = obj.nextLine();
		System.out.println("enter your address :"+address);
	}

}

package wrapperclass;

public class boxingoperation2 {

	public static void main(String[] args) {
		char c1 = 'a';
		Character cobj1 = new Character(c1);
		System.out.println(c1==cobj1);
		
		Character cobj2 = new Character('z');
		
		Character cobj3 = 'h';
		System.out.println(c1);
		System.out.println(cobj1);
		System.out.println(cobj2);
		System.out.println(cobj3);
		
		boolean b = true;
		Boolean bobj1 = new Boolean(b);
		System.out.println(b==bobj1);
		
		
	}

}

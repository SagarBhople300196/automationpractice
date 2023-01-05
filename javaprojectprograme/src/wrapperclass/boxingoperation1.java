package wrapperclass;

public class boxingoperation1 {

	public static void main(String[] args) {
		int age = 20;
		System.out.println("age :"+age);
        Integer obj = 45;
        System.out.println("obj :"+obj);
        Integer intobj1 = new Integer(age);
        System.out.println("intobj1 :"+intobj1);
        System.out.println(age==intobj1);
        Integer intobj2 = new Integer(50);
        System.out.println("intobj2 :"+intobj2);
        Integer intobj3 = 30;
        System.out.println("intobj3 :"+intobj3);
        
        char c1 = 'z';
        Character xyz=c1;
        Character cobj2 = new Character(c1);
        System.out.println(c1);
        System.out.println(xyz);
        System.out.println(cobj2);
        
	}

}

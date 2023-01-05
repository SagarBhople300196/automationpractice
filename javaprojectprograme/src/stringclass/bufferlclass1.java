package stringclass;

public class bufferlclass1 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("original stringbuffer value :"+sb);
        sb.append("java");
        System.out.println(sb);
        sb.insert(5, "pune");
        System.out.println(sb);
        sb.replace(1,3,"XXX");
        System.out.println(sb);
        sb.delete(1,4);
        System.out.println(sb);
        StringBuffer s1 = new StringBuffer("Banglore is known for IT");
        s1.reverse();
        System.out.println(s1);
        System.out.println("****************************************");
        StringBuffer s2 = new StringBuffer();
        System.out.println(s2.capacity());//default 16
        s2.append("hello");
        System.out.println(s2.capacity());
        s2.append("JAVA IS MY FAVOURITE LANGUAGE");
        System.out.println(s2.capacity());
        s2.append("I AM FROM AUTOMATION AREA");
        System.out.println(s2.capacity());
        
        
        
	}

}

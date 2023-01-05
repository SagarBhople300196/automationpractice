package encapsulation;



class example extends Exception {
	public example(String str) {
		super(str);
	}
}

    public class exception8 {
    	public static void validateAge(int age) {
    		if(age<18) {
    		try {
    			throw new example("person is not eligible to vote");
    		}catch(example e) {
    			System.out.println("exception found "+e);
    		}
    		}else {
    			System.out.println("person is eligible for vote ");
    			
    		}
    	}
	

	public static void main(String[] args) {
		System.out.println("method started ");
		validateAge(15);
		System.out.println("rest of the code ");
		

	}

}




	

	



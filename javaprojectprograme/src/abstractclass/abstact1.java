package abstractclass;

abstract class animal {
	public abstract void animalsound();
	
	void sleep() {
		System.out.println("sleep() of class animal");
	}
}
  class pig extends animal {

	@Override
	public void animalsound() {
		System.out.println("pig says wee wee");
		}
	 }
  class dog8 extends animal {
	  public void animalsound() {
	  System.out.println("dog says bho bho bho");
  }
  }

public class abstact1 {

	public static void main(String[] args) {
		pig p1 = new pig();
		p1.animalsound();
		p1.sleep();
		dog8 d1 = new dog8();
		d1.animalsound();
		d1.sleep(); 
	}

}

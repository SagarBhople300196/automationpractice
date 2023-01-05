package SYSTEMCLASS;
class training {
training(){
	System.out.println("Training class const");
}
void manualTesting() {
	System.out.println("I am from manual Testing");
}
void automationTesting() {
	System.out.println("I am from Automation Testing");
}
}
public class systemclass2 {
static training t1=new training();
public static void main(String args[]) {
	training t2=new training();
	t2.manualTesting();
	t2.automationTesting();
	//accessing static member
	systemclass2.t1.manualTesting();
	systemclass2.t1.automationTesting();
	System.out.println("Hi, I am shailesh");
	System.err.println("Hi, I am Pune");

}

}

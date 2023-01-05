package stringclass;

public final class immutableclass {
	final String name;
	final double salary;
	immutableclass(String name,double salary){
		this.name=name;
		this.salary=salary;
		}

public String getName() {
	return name;
}
public double getSalary() {
	return salary;
}
	
	

	public static void main(String[] args) {
		immutableclass obj=new immutableclass("Pune",656535);
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
//		obj.name="nbjh";
//		obj.salary=356565;
		
		immutableclass obj2=new immutableclass("Mumbai",2454);
		System.out.println(obj2.getName());
		System.out.println(obj2.getSalary());
		

	}

}

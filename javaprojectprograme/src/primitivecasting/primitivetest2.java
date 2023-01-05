package primitivecasting;

public class primitivetest2 {

	public static void main(String[] args) {
	int salary = 33000;
    double salarydouble = (double)salary;
    float salaryfloat = (float)salary;
    System.out.println("********************explicit widening************");
    System.out.println("salary: "+salary+"\nsalarydouble :"+salarydouble+"\nsalaryfloat :"+salaryfloat);
    System.out.println("********************emplicit widening************");
    double salarydouble2= salary;
    float salaryfloat2= salary;
    System.out.println("salary: "+salary+"\nsalarydouble2 :"+salarydouble+"\nsalaryfloat2 :"+salaryfloat);
    
    double salarydb= 3500000.678d;
    int salaryint= (int)salarydb;
    float salaryft= (float)salarydb;
    System.out.println("********************explicit widening************");
    System.out.println("salary: "+salarydb+"\nsalarydouble :"+salaryint+"\nsalaryft :"+salaryft);
	}

}

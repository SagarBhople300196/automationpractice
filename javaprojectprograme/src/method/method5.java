package method;

public class method5 {
	
	static double x=5, y=8, z=9;
	
	public static double average(double a, int b, int c) {
		return (a+b+c)/3;
		
	}
	public static double average() {
		return (x+y+z)/3;
	}
	
        public static double addition(double a, double b) {
    	double res =a+b;
    			return res;
    	
    	
    }
        public static void main(String [] args) {
    		System.out.println("Average "+average());
    		System.out.println("Average "+method5.average(12,17,15));
    		System.out.println("Average "+method5.average(10,70,50));
    		System.out.println(addition(30,40));
    		
    	}
	
    	
    }

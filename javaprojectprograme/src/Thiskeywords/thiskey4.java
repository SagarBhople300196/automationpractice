package Thiskeywords;

public class thiskey4 {
  int rollno;
  float fee;
   thiskey4(int rollno, float fee)
   {
	   rollno=rollno;
	   fee=fee;
   }
	   void display()
	   {
		   System.out.println(rollno +" "+fee);
	   }
   }
   class student{
	   
   
	public static void main(String[] args) {
		thiskey4 v1= new thiskey4(101,20000f);
		v1.display();
	}
   }
   



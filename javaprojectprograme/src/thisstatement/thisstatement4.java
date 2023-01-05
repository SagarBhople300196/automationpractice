package thisstatement;
 class student2{
	 int rollno;
	 float fee;
	 
	 student2(int rollno) {
		 this.rollno=rollno;
	 }
	 student2(int rollno, float fee){
		 this(rollno);
		 this.fee=fee;
	 }
	 void display() {
		 System.out.println(rollno+"  "+fee);
	 }
 }

public class thisstatement4 {

	public static void main(String[] args) {
		student2 v1 =new student2(111);
		student2 v2 =new student2(222,12000f);
		v1.display();
		v2.display();
        
	}

}
package blocks;

public class TotalRecall {

	
		static int age=25;
		double salary=45000.36;
		
		void display() {
			System.out.println("I am display ");
		}
		
		static int callMe() {
			System.out.println("I am callMe ");
			return 10;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TotalRecall v1 = new TotalRecall();
			v1.display();
             callMe();
		}

	}


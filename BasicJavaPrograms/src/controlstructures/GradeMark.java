package controlstructures;

public class GradeMark {

	public static void main(String[] args) {
		int mark = 80;
			
		if(mark >= 40 && mark <= 59) {
			System.out.println("Pass");
		}
		
		else if(mark >= 60 && mark <= 69) {
			System.out.println("Merit");
		}
		
		else if(mark > 70) {
			System.out.println("Distinction");
		}
		
		else {
			System.out.println("Fail");
		}
	}
}

package main;

public class CompareStringDemo {

	public static void main(String[] args) {
		String s1 = "Jim";
		String s2 = "jacob";
		if(s1.compareTo(s2) < 0) {
			System.out.println(s1 + " is before " + s2);
		}
		else if(s1.compareTo(s2) == 0) {
			System.out.println(s1 + " is the same as " + s2);
		}
		else if(s1.compareTo(s2) > 0) {
			System.out.println(s1 + " is after " + s2);
		}

	}

}

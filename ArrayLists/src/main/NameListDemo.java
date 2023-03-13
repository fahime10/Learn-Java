package main;

import java.util.ArrayList;
import lib.Name;
import java.util.Scanner;

public class NameListDemo {
	
	public static void main(String[] args) {
		ArrayList<Name> register = new ArrayList<>();
		
		register.add(new Name("Fahim", "Ahmed"));
		try (Scanner sc = new Scanner(System.in)) {
			for(int i = 0; i < 4; i++) {
				System.out.println("Input first name: ");
				String firstName = sc.nextLine();
				
				System.out.println("Input last name: ");
				String lastName = sc.nextLine();
				System.out.println();
				
				Name fullName = new Name(firstName, lastName);
				
				register.add(fullName);
			}
		}
		
		for(Name s: register) {
			System.out.println(s);
		}
		
		
		boolean exists = register.stream().anyMatch(nm -> nm.getFamilyName().equals("Smith"));
		
		if(exists == true) {
			System.out.println("\nSmith found");
		} else {
			System.out.println("Smith not found");
		}
		
		
			register.stream().filter(n -> (n.getFirstName().length() + n.getFamilyName().length()) > 10).forEach(n ->
			System.out.println(n));
			
			
			System.out.println(register.contains(new Name("Fahim", "Ahmed")));
			
			
			
	}

}

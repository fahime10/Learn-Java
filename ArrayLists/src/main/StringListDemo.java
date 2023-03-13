package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import lib.Name;

public class StringListDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		//ArrayList<String> list = new ArrayList<>();
		
		list.add("Hello");
		list.add("World");
		list.add("Planet");
		list.add("Earth");
		
		list.set(3, "Mars");
		list.remove(0);
		list.remove("World"); //Object o to remove
		
		for(String s: list) {
			System.out.print(s.toUpperCase() + " ");
		}
		
		System.out.println();
		
		for(String t: list) {
			System.out.print(t.toLowerCase() + " ");
		}
		
		
		ArrayList<Name> list2 = new ArrayList<>();
		
		Name n = new Name("Joe", "Bloggs");
		list2.add(n);
		
		list2.add(new Name("Joe", "Bloggs"));
		
		System.out.println("\n" + list2);
	}
}

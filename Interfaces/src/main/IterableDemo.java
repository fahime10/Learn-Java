package main;

import lib.polymorphism.Die;
import lib.polymorphism.MultipleDice;

public class IterableDemo {

	public static void main(String[] args) {
		MultipleDice m = new MultipleDice(4);
		
		for(int i = 0; i < m.getSize(); i++) {
			System.out.println(m);
		}
		
		for(Die n: m) {
			System.out.println(n.toString());
		}
	}
}

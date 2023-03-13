package main;

import lib.OrderLine;
import java.util.ArrayList;

public class OrderListDemo {

	public static void main(String [] args) {
		ArrayList<OrderLine> orders = new ArrayList<OrderLine>();
		int totalCost = 0;
		
		orders.add(new OrderLine("Milk", 100, 30));
		orders.add(new OrderLine("Apple", 70, 20));
		orders.add(new OrderLine("Chocolate", 100, 3));
		orders.add(new OrderLine("Biscuit", 120, 5));
		
		for(OrderLine o: orders) {
			System.out.println(o);
			totalCost += o.getCost();
		}
		
		System.out.println();
		
		System.out.println("The total cost is £" + totalCost/100);
		
		
		int total = orders.stream().mapToInt(i -> {return i.getCost();}).sum();
		
		System.out.println(total);
		
	}
}

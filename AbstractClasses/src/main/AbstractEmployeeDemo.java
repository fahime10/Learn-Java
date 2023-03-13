package main;

import java.util.ArrayList;
import java.util.List;
import lib.employees.*;


public class AbstractEmployeeDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new OvertimeEmployee(65, 7.5, 5, 15));
		//employees.add(new FlexiEmployee(65, 7.5, -5));
		//employees.add(new BonusEmployee(65, 7.5, 50));

	}

}

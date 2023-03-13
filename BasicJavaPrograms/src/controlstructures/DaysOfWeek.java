package controlstructures;

public class DaysOfWeek {

	public static void main(String[] args) {
		
		int day = 4;
		String week;
		String dayType;
		switch(day) {
	
		case 1: week = "Monday"; break;
		case 2: week = "Tuesday"; break;
		case 3: week = "Wednesday"; break;
		case 4: week = "Thursday"; break;
		case 5: week = "Friday"; break;
		case 6: week = "Saturday"; break;
		case 7: week = "Sunday"; break;
		default: week = "Unknown day"; break;
	}
		
		switch (day) {
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5: dayType = "Weekday"; break;
		case 6:
		case 7: dayType = "Weekend"; break;
		default: dayType = "Unknown day"; break;
		}
		
		System.out.println(week);
		System.out.println(dayType);
	}
}

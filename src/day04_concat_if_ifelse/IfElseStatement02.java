package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*
		 //Get the day name from user, then tell to the user if it is week day or weekend day 
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name");
		String day = scan.next().toLowerCase();
		
		// == , ==> check the value and addresses if both are same it returns true otherwise, false
		// equal() ==> checks just the value by not ignoring cases
		//equalsIgnoreCase() checks the value by ignoring cases
 		
		
//		if(day.equalsIgnoreCase("saturday")  || day.equalsIgnoreCase("sunday")) {
//			System.out.println("weekend");
//		}else {
//			System.out.println("Weekday");
//		}
		
	
	if(day.equals("saturday")  || day.equals("sunday")) {
		System.out.println("weekend");
	}else {
		System.out.println("Weekday");
	}

}
}

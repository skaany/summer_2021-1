package day05_ifelseif_nestedif;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/*
	 	Ask user to enter year
		Type java code by using if-else if() statement.
		Write a program to check if a year is leap year or not.
		if the year is divisible by 100 then it must be divisible by 400.
		If a year is not divisible by 100 then it must be divisible by 4.
    */
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a year to check if it is a Leap Year or not");
			int year = scan.nextInt();
			
			/*
			  1- & and && have similar functionally 
			  2- & java will check all conditions 
			  3- && java will not check all conditions if the first one is false
			  
			 */
			
			if(year%100 == 0 && year%400 == 0 ) {
				System.out.println(year + " is a Leap year");
				
			}else if(year%100 != 0 && year%4 == 0 ) {
				System.out.println(year + " is a Leap year");
				
			}else {
				System.out.println(year + " in not Leap year");
			}
	}

}

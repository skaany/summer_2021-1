package day04_concat_if_ifelse;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		//get a number from user then tell IF the number is even or odd
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("the number is even");
						
		}
		if(num % 2 != 0) {
			System.out.println("the number is odd");
		}
		
		//get a number from user , then check if the number is negative or positive
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		if(num2 > 0) {
			System.out.println("the number is +");
			
		}
		if(num2 < 0) {
			System.out.println("the number is -");
		}
		
		//Get the length and the height of a rectangle from user, if they equal to each other
		//print "Square" on the console, otherwise print "Rectangle" on the console.
		System.out.println("enter a side of the Rectangle ");
		double side1 = scan.nextDouble();
		System.out.println("enter  side 2 of the Rectangle ");
		double side2 = scan.nextDouble();
		
		if(side1<0 || side2 <0) {
			System.err.println("negative values can not represent a length");
		}
		
		if(side1 == side2) {
			System.out.println("Square");
			
		}
		if(side1 != side2) {
			System.out.println("Rectangle");
		}
		
		
		
		
	}

}

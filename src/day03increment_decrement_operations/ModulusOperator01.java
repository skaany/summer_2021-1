package day03increment_decrement_operations;

import java.util.Scanner;

public class ModulusOperator01 {

	public static void main(String[] args) {
		
		/*
		 Modulus Operator (%) is used to find remainder when you divide a number
		 20/5 = 4
		 20%5 = 0 
		 */
		
		System.out.println(21%5);
		
		
		//Get a number from user and print the last digit of that number on the console
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a number");
//		int num = scan.nextInt();
//		
//		int lastDigit = num %10;
//		
//		System.out.println("The last digit of the number is " +  lastDigit);
		
		//Get a 3-Digit integer from user and return the sum of its digit
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3-digit number");
		int number = scan.nextInt();
		
		int lastDigit = 0;
		int midDigit = 0;
		int firstDigit = 0;
		int middle = 0;
		
		lastDigit = number%10;
		firstDigit = number/100; // 256/100 = 2.56
		middle = number/10; //25.6
		midDigit = middle%10;
		
		System.out.println(firstDigit + midDigit + lastDigit);
		
		
		
		
		
		
		
			
	}

}

package day05_ifelseif_nestedif;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {

		/*
		 * Ask user to enter marks and print the corresponding grade.
	 	A school has following rules for grading system:
		1. Below 50 - D   2. 50 to 59 - C     3. 60 to 79 - B.   4. From 80 to 100 - A 
		
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a mark");
		int mark = scan.nextInt();
		
		if(mark < 0 || mark>100) {
			System.out.println("Not valid mark");
		}else if(mark <50) {
			System.out.println("D");
		}else if(mark <60) {
			System.out.println("C");
		}else if(mark <80) {
			System.out.println("B");
		}else if(mark<101) {
			System.out.println("A");
			
//		}else {
//			System.out.println("Please enter any number at most 100");
//		}
		
		
		
		}	
	}

}

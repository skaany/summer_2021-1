package day03increment_decrement_operations;

public class Increment01 {

	public static void main(String[] args) {
		
		int age = 20; 
		
		//How to increase the value by addition
		//1. way
		age = age + 5;
		//2.way
		age +=6; // age = age + 6
		//3.way -->increasing by only 1
		age++;
		
		//how to increase the value of a variable by multiplication
		
		int salary = 1000;
		//1. way
		salary = salary * 2;
		System.out.println("After the 1st, increase my salary is "+ salary);
		
		//2. way
		
		salary *=3;
		System.out.println("After 2. increase salary is " + salary);
		
	}

}

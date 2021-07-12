package day03increment_decrement_operations;

public class Decrement01 {

	public static void main(String[] args) {
		
		int num=100;
		
		
		//How to decrease the value of variable by substrcution 
		
		//1. way
		num = num-5;
		System.out.println("new value is " + num);
		//2. way
		num -=5;
		//3. way --> works to decrease the value by one
		num--;
		
		
		//How to decrease the value of variable by division
		
		int salary = 5000;
		
		//1. way
		salary = salary / 5;
		System.out.println("new salary is " + salary);
		
		//2. way
		salary /=5;
		System.out.println("final salary is " + salary);
		
		
		
		//Q: Decrease Ali's salary 20% then increase it by 100 dollars.	
		//   Increase Veli's salary 100 dollars then decrease it by 20%.	
		//   Then compare their salaries?
		
		int aliSalary = 600;
		int veliSalary = 500;
		
		aliSalary = (int) (aliSalary * 0.8);
		aliSalary +=100;
		System.out.println("Final Ali's Salary is " + aliSalary);
		
		veliSalary += 100;
		veliSalary = (int) (veliSalary * 0.8);
		System.out.println("Final Veli's Salary is " + veliSalary);
		
		

	}

}

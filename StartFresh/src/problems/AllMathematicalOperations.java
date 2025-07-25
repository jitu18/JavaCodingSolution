package problems;

import java.util.Scanner;

public class AllMathematicalOperations {
	public static void main(String args[]) {
	
	 Scanner scanner = new Scanner(System.in);

	//take input

	System.out.println("enter first number: ");

	double num1 =scanner.nextDouble();

	System.out.println("enter second number: ");
	double num2 =scanner.nextDouble();

	//perform all arithmatic operations
	double sum = num1 + num2;
	double difference =num1 -num2;
	double product = num1*num2;
	double quotient =(num2!=0)?(num1/num2):Double.NaN;
	double remainder =(num2!=0)?(num1%num2):Double.NaN;

	//display result

	System.out.println("Sum= " +sum);
	System.out.println("difference= " +difference);
	System.out.println("product= " +product);
	System.out.println("quotient= " +quotient);
	System.out.println("remainder= " +remainder);

	scanner.close();

	}
	  
}


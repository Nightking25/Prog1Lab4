package lab4;

import java.util.Scanner;
/**
 * This answeres the book question 43.
 * It square roots a given number until its less than 1.01.
 * 
 * @author Nirdesh Shrestha
 *
 */
public class Book43 {
	public static void main(String[] args) {
		System.out.println("\t\t****************");
		System.out.println("\t\t* Square Roots *");
		System.out.println("\t\t****************\n");
		int input, count;
		double sqrt;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Input a value greater than 10");
			input = scanner.nextInt();
		} while (input <= 10);

		double number = input;
		count = 0;

		do {
			sqrt = Math.sqrt(number);
			System.out.printf("The square root of %f = %f\n", number, sqrt);
			number = sqrt;
			count += 1;
		} while (sqrt > 1.01);
		System.out.println("Total time the square root operation was performed was: " + count);
	}
}

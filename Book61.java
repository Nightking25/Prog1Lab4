package lab4;

/**
 * Book Question 61.
 * 
 * @author Nirdesh Shrestha
 * 
 */
import java.util.Scanner;

public class Book61 {
	public static void main(String[] args) {
		System.out.println("\t\t********************");
		System.out.println("\t\t* Grade Calculator *");
		System.out.println("\t\t********************\n");

		double grade, sum, min, max;
		double average;
		Scanner scanner = new Scanner(System.in);

		min = 100;
		max = 0;
		sum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Enter grade no %d: ", i + 1);
			grade = scanner.nextInt();

			if (grade < min) {
				min = grade;
			}
			if (grade > max) {
				max = grade;
			}

			for (int j = 0; j < 1; j++) {
				sum += grade;
			}
		}
		average = sum / 10;
		System.out.println("average: " + average);
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
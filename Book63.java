package lab4;

import java.util.*;

/**
 * This program prompts the user for an ID and verify if the user has enter
 * exacly 2 digits in their ID. Output if the ID is valid or not. Textbook
 * Question 63.
 * 
 * @author Nirdesh Shrestha
 * 
 */
public class Book63 {

	public static void main(String[] args) {
		System.out.println("\t\t********************");
		System.out.println("\t\t* ID Reader *");
		System.out.println("\t\t********************\n");

		int a = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your ID. It should contain exactlly two digits.");
		String id = scanner.nextLine();

		for (int i = 0; i < id.length(); i++) {
			boolean idReader = Character.isDigit(id.charAt(i));
			if (Character.isDigit(id.charAt(i))) {
				a += 1;
			}
		}

		if (a == 2) {
			System.out.println("This is valid ID");
		} else {
			System.out.println("This is not a valid ID");
		}
	}

}
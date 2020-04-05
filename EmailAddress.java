package lab4;

import java.util.*;

/**
 * Program that prompts the user to enter an email address and checks for one @
 * sysbol and print out that it is valid. Textbook Question 62.
 * 
 * @author Nirdesh Shrestha
 * 
 */
public class EmailAddress {
	public static void main(String[] args) {
		System.out.println("\t\t***********************");
		System.out.println("\t\t* Validate Your Email *");
		System.out.println("\t\t***********************");
		int a = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter your email address: ");
		String email = scanner.nextLine();

		for (int i = 0; i < email.length(); i++) {
			char emailReader = email.charAt(i);
			// System.out.println("Char at " + i +" index at " + emailReader);

			if (emailReader == '@') {
				a += 1;
			}
		}
		if (a == 1) {
			System.out.println("This is a valid email");
		} else {
			System.out.println("This is not a valid email");
		}
	}
}
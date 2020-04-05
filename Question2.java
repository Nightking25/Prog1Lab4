package lab4;

import java.util.*;
/**
 * This porgaram validates you email.
 * If your email meets all the necessary objectives, it's a valid email.
 * 
 * @author Nirdesh Shrestha
 *
 */
public class Question2 {

	public static void main(String[] args) {
		System.out.println("\t\t***********************");
		System.out.println("\t\t* Validate Your Email *");
		System.out.println("\t\t***********************");

		String email; 
		int a = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your email address");
		email = scanner.nextLine();

		email = email + " "; 
		System.out.println(email + "1");
		for (int i = 0; i < email.length(); i++) {
			char x = email.charAt(i);
			if (x == '@' || x == '.') {
				if (Character.isLetter(email.charAt(i + 1))) {
					a += 1;
				} else if (email.charAt(i + 1) == '@' || email.charAt(i + 1) == '.' || email.charAt(i + 1) == ' ') {
					a = 0;
				}
			}
		}
		if (a > 1) {
			System.out.println("valid email");
		} else {
			System.out.println("invalid email");
		}
	}
}
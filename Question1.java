package lab4;

import java.util.*;
/**
 * This program checks if a word or a sentence is a palindrome or not.
 * Example "radar" is a palindrome.
 * 
 * @author Nirdesh Shrestha
 *
 */
public class Question1 {

	public static void main(String[] args) {
		System.out.println("**************");
		System.out.println("* Palindrome *");
		System.out.println("**************");

		String original = "", palindrome = "";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word or a sentence: ");
		original = scanner.nextLine();

		// removing all the spaces and punctuation
		original = original.replaceAll("\\W", "").toLowerCase();

		for (int i = original.length() - 1; i >= 0; i--) {
			palindrome += original.charAt(i);
		}
		if (original.equals(palindrome)) {
			System.out.println("This is a Palindrome");
		} else {
			System.out.println("This is not a Palindrome");
		}
	}
}

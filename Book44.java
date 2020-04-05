package lab4;

import java.util.Scanner;

/**
 * This answers book question 44. It checks if your word 
 * has a '@' or not. If it doesn't, it keept prompting the
 * user for a word.
 * 
 * @author Nirdesh Shrestha
 *
 */
public class Book44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		do { 
			char ch;
			System.out.println("Enter a word");
			String word = scanner.nextLine();
			for (int i = 0; i < word.length(); i++) {
				ch = word.charAt(i);
				if (ch == '@') {
					System.out.println(word);
					a += 1;
				}
			}
		} while (a < 1);
	}
}

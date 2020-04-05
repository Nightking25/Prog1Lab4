package lab4;

import java.util.*;
/**
 * This is a game where you have to guess the number generated by a
 * RNG(Random Number Generator and if it's correct you can play again.
 * 
 * @author Nirdesh Shrestha
 *
 */
public class Question3 { 
	public static void main(String[] args) {

		Random random = new Random();
		int b;

		do {
			int randomNum = random.nextInt(100) + 1;
			int guess;

			System.out.println(randomNum);

			Scanner scanner = new Scanner(System.in);

			System.out.println("Guess the number");
			guess = scanner.nextInt();
			b = 0;
			int a = 1;
			char answer;

			for (int i = 1; i < 10; i++) {

				if (guess == randomNum) {
					System.out.println("Correct");
				 	i = 10;
					System.out.println("Would you like to play again? Y/N");
					answer = scanner.next().charAt(0);
					if (answer == 'y') {
						b = 1;
					} else {
						System.out.println("Thank you for playing!");
					}
				} else {
					System.out.println("Try Again!");
					guess = scanner.nextInt();
					a += 1;
				}
			}
			if (a >= 10) {
				System.out.println("\nYou are not lucky!");
			}
		} while (b == 1);
	}
}
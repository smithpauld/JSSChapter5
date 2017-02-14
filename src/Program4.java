import java.util.Random;
import java.util.Scanner;
public class Program4 {

	public static void main(String[] args) {
		
		int randomNumber, guessNumber, count = 0;
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		String another = "y";
		
		
		System.out.println("This is the Hi-Lo guessing game.");
		System.out.println("The computer will pick a random number between 1 and 100");
		System.out.println("After each guess you make, the computer will tell you " + "");
		System.out.println("if your guess is to high or low");
		
		
		while (another == "y") {
			
			randomNumber = generator.nextInt(100) + 1;
			System.out.println("Please enter a number to play");
			guessNumber = scan.nextInt();
			
			
			
			while (guessNumber != randomNumber) {
				if (guessNumber > randomNumber) {
					System.out.println("The number you entered is too high!");
					count++;
				}
				if (guessNumber < randomNumber) {
					System.out.println("The number you entered is too low!");
					count++;
				}

				System.out.println("Please enter another guess");
				guessNumber = scan.nextInt();
			}
			
			
			
			

			if (guessNumber == randomNumber) {
				System.out.println("The number you entered is the correct guess!");
				count++;
				System.out.println("It took you " + count + " guesses!");

			}

			System.out.println("Do you want to play again? Select y");
			another = scan.nextLine();
			

		}
	}
}
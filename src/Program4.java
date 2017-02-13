import java.util.Random;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		int randomNumber, guessNumber;
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		String quit ="n", another = "y";

		System.out.println("This is the Hi-Lo guessing game.");
		System.out.println("The computer will pick a random number between 1 and 100");
		System.out.println("After each guess you make, the computer will tell you " + "");
		System.out.println("if your guess is to high or low");
		

		while (quit != "q")
		{
		
		
		while (another.equalsIgnoreCase("y"))

		{

			randomNumber = generator.nextInt(100) + 1;

			System.out.println("Please enter a number to play");
			guessNumber = scan.nextInt();

			while (guessNumber != randomNumber && quit =="n")
			{
				if (guessNumber > randomNumber)
					System.out.println("The number you entered is too high!");
				else if (guessNumber < randomNumber)
					System.out.println("The number you entered is too low!");
				else
					System.out.println("The number you entered is the correct guess!");
			
			System.out.println("Please enter another guess");
			System.out.println("If you would like to quit, select q");
			guessNumber = scan.nextInt();
			quit = scan.nextLine();
			
			}
			
			
			System.out.println("Do you want to play again? Selct Y or y");
			another = scan.nextLine();

		}
		
		}

	}

}

import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		PairOfDice player1 = new PairOfDice();
		PairOfDice player2 = new PairOfDice();
		Scanner scan = new Scanner(System.in);

		int roundScore1, roundScore2, diceOne, diceTwo;
		String rollAgain = "y";

		int player1Score = 0, player2Score = 0;

		final int WINSCORE = 100;

		while (player1.diceSum() != WINSCORE || player2.diceSum() != WINSCORE) {

			while (rollAgain.equalsIgnoreCase("y")) {
				System.out.println("Player1 please roll the dice!");
				player1.roll();
				diceOne = player1.die1();
				diceTwo = player1.die2();
				roundScore1 = player1.diceSum();
				System.out.println("You rolled a " + diceOne + " and a " + diceTwo);

				if (diceOne == 1 || diceTwo == 1) {
					roundScore1 = 0;
					rollAgain = "n";
					System.out.println("Sorry, you rolled a 1 and lost all points for this round!");
					player1Score = player1Score + roundScore1;
					System.out.println("Your current score is " + player1Score);
				}

				else {
					player1Score = player1Score + roundScore1;
					System.out.println("Your current score is " + player1Score);
					System.out.println("Do you want to roll again?");
					rollAgain = scan.nextLine();

				}

			}

		}
	}

}

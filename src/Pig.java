import java.util.Scanner;

public class Pig {

	public static void main(String[] args) {
		PairOfDice player1 = new PairOfDice();
		PairOfDice player2 = new PairOfDice();
		Scanner scan = new Scanner(System.in);

		int roundScore1 = 0, roundScore2 = 0, diceOne, diceTwo;
		String rollAgain1 = "y", rollAgain2 = "y";

		int player1Score = 0, player2Score = 0;

		final int WINSCORE = 100;

		while (player1Score <= WINSCORE || player2Score <= WINSCORE) {

			while (rollAgain1.equalsIgnoreCase("y")) {
				System.out.println("Player1 please roll the dice!");
				System.out.println();
				player1.roll();
				diceOne = player1.die1();
				diceTwo = player1.die2();

				roundScore1 = roundScore1 + player1.diceSum();
				player1Score = player1Score + player1.diceSum();

				System.out.println("You rolled a " + diceOne + " and a " + diceTwo);
				
				
				
				
				
				
				if (roundScore1 >=20 ){
					System.out.println("You have earned more than 20 points for this round!");
					System.out.println("It is now Player2's turn");
					rollAgain1 = "n";
				}
				

				if (diceOne == 1 || diceTwo == 1) {

					player1Score = player1Score - roundScore1;

					if (player1Score <= 0) {
						player1Score = 0;
					}
					rollAgain1 = "n";
					System.out.println("Sorry, you rolled a 1 and lost all points for this round!");
					
					if (diceOne ==1 && diceTwo ==1){
						System.out.println("You rolled two 1's!!!!!!!");
						System.out.println("You have lost all points for the game!!!!");	
						player1Score = 0;
						rollAgain1 = "n";
					}
					
				}
				
				

				else {

					System.out.println("Your current score is for this round is " + roundScore1);
					System.out.println("Your total score is " + player1Score);
					System.out.println("Do you want to roll again?");
					System.out.println("****************");
					rollAgain1 = scan.nextLine();

				}

			}
			roundScore1 = 0;
			System.out.println("Your current score is " + player1Score);
			System.out.println("****************");
			System.out.println();
			rollAgain2 = "y";
			
			if (player1Score <=WINSCORE){
				rollAgain1 ="n";
			}

			while (rollAgain2.equalsIgnoreCase("y")) {

				System.out.println("Player2 please roll the dice!");
				System.out.println();
				player2.roll();
				diceOne = player2.die1();
				diceTwo = player2.die2();

				roundScore2 = roundScore2 + player2.diceSum();
				player2Score = player2Score + player2.diceSum();
				System.out.println("You rolled a " + diceOne + " and a " + diceTwo);
				
				
				
				if (roundScore2 >=20){
					System.out.println("You have earned more than 20 points for this round!");
					System.out.println("It is now Player1's turn");
					rollAgain2 = "n";
				}
				

				if (diceOne == 1 || diceTwo == 1) {

					player2Score = player2Score - roundScore2;

					if (player2Score <= 0) {

						player2Score = 0;
					}

					rollAgain2 = "n";
					System.out.println("Sorry, you rolled a 1 and lost all points for this round!");
					
					if (diceOne ==1 && diceTwo ==1){
						System.out.println("You rolled two 1's!!!!!!!");
						System.out.println("You have lost all points for the game!!!!");	
						player2Score = 0;
						rollAgain2 = "n";
					}
					
					
					
					
					
					
				}

				else {

					System.out.println("Your current score is for this round is " + roundScore2);
					System.out.println("Your total score is " + player2Score);
					System.out.println("Do you want to roll again?");
					System.out.println("****************");
					rollAgain2 = scan.nextLine();

				}

			}
			roundScore2 = 0;
			System.out.println("Your current score is " + player2Score);
			System.out.println("****************");
			System.out.println();
			rollAgain1 = "y";
			
			
			if (player2Score >=WINSCORE){
				rollAgain2 ="n";
			}

		}

		System.out.println("COngrats! You won");
	}

}

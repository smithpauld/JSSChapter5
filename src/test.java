
public class test {

	public static void main(String[] args) {
		PairOfDice player1 = new PairOfDice();
		PairOfDice player2 = new PairOfDice();

		int roundscore1, roundscore2, diceOne,diceTwo;
		String rollAgain = "y";

		int player1Score, player2Score;

		final int WINSCORE = 100;

		

		
				System.out.println("Player1 please roll the dice!");

				player1.roll();
				diceOne = player1.die1();
				diceTwo = player1.die2();
				System.out.println(diceTwo);
				
				
				
				System.out.println("You current score is " + player1.diceSum());

			

		
	}

}

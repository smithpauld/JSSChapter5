
public class PairOfDice {

	private int die1, die2;
	private final int Max1=6;
	private int roundScore;
	public PairOfDice()
	{
		roll();
	}
	
	public void roll()
	{
		die1 =(int)(Math.random() * Max1)+1;
		die2 =(int)(Math.random() * Max1)+1;
		
		
		
	}
	
	public String getDiceInfo ()
	{
		String DiceInfo = "Dice 1's value is " + die1 + "." + " Dice 2's value is " + die2 + ".";
		return DiceInfo;
	}
	
	public int diceSum()
	{
		int diceSum = die1 + die2;
		return diceSum;
	}
	
	
	
	public int die1()
	{
	return die1;
			
	}
	public int die2()
	{
	
	
	return die2;
			
	}	
			
			
			
	
}

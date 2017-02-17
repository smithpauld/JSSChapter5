import java.util.Random;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {

		int randomNumber1, randomNumber2, randomNumber3;
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		String another = "y";

		while (another.equals("y")) {

			
			
			
			
			randomNumber1 = generator.nextInt(10) + 1;
			randomNumber2 = generator.nextInt(10) + 1;
			randomNumber3 = generator.nextInt(10) + 1;

			System.out.println("SLot 1 is " + randomNumber1);
			System.out.println("Slot 2 is " + randomNumber2);
			System.out.println("Slot 3 is " + randomNumber3);

			if ((randomNumber1 == randomNumber2) && (randomNumber2 == randomNumber3))
				System.out.println("Congrats! ALL numbers match!!!");

			if ((randomNumber1 == randomNumber2) || (randomNumber2 == randomNumber3)
					|| (randomNumber1 == randomNumber3)) {
				System.out.println();
				System.out.println("Two of the numbers match! Nice!");
			}

			System.out.println("Do you want to play again? Select y");
			another = scan.nextLine();
			another = scan.next();

		}
	}

}

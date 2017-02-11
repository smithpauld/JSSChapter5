
/*Chapter 5 programs #1 and #2
 * Gregorian Calendar
 * 
 * 
 */
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a year. I will then determine if it is a leap year");
		System.out.println("enter 0 to quit the program");

		year = scan.nextInt();
		
		while (year != 0) {

			if (year >= 1582) {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					System.out.println("the year " + year + " is a leap year");
				}

				else {
					System.out.println("The year " + year + " is not a leap year");
				}

			}

			else {
				System.out.println("The year entered must be greater than 1582, this is the year"+ "");
				System.out.print("the Gregorian Calendar was adopted");
			}

			year = scan.nextInt();

		}

	}

}

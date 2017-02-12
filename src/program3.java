import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {

		String numberValue;
		int odd = 0;
		int even = 0;
		int zero = 0;
		int index = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("This program will evaluate an integer and print " + "");
		System.out.println(" the number of odd, even, and zero digits");

		System.out.println("Please enter an integer value");

		// read the number entered from the user
		numberValue = scan.next();

		// specify delimeter for the number entered
		Scanner digitValue = new Scanner(numberValue);

		digitValue.useDelimiter("d");

		while (digitValue.hasNext()) {
			char d = numberValue.charAt(index);
			index++;

			int num = Integer.parseInt(Character.toString(d));
			if (num == 0)
				zero++;
			else if (num % 2 == 0)
				even++;
			else
				odd++;

		}

		System.out.println("The number of even digits is " + even);
		System.out.println("The number of odd digits is " + odd);
		System.out.println("The number of zeros's is " + zero);

	}

}

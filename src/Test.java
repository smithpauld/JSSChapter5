import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String another = "y";
		
		System.out.println("Do you want to play again? Select y");
		another = scan.nextLine();
		
		System.out.println(another);
		

	}

}

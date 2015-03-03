package lesson150303;

import java.util.Scanner;

public class UnlimitedInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			System.out.println(nextLine);
			if (nextLine.equals("exit")) {
				break;
			}
		}
		
		System.out.println("Good bye!");
		
	}
	
}

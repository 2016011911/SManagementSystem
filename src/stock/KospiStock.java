package stock;

import java.util.Scanner;

public class KospiStock extends Stock {
	public void getUserInput(Scanner input) {
		System.out.print("Stock name : ");
		String name = input.next();
		this.setName(name);

		System.out.print("Stock price : ");
		int price = input.nextInt();
		this.setPrice(price);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {


			System.out.println("Do you have a stoploss?(Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("stoploss : ");
				int stoploss = input.nextInt();
				this.setStoploss(stoploss);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setStoploss(0);
				break;
			}
			else {

			}
		}
		System.out.print("Stock target : ");
		int target = input.nextInt();
		this.setTarget(target);

	}
}

package stock;

import java.util.Scanner;

import exception.StoplossFormatException;

public abstract class BluechipStock extends Stock {
	public BluechipStock(StockKind kind) {
		super(kind);
	}
	
	@Override
	public abstract void getUserInput(Scanner input);

	@Override
	public void printInfo() {
	
		String skind = getKindString();
		System.out.println("kind : "+skind + " name : " + name + " price : " + price + " stoploss : " + stoploss +" target : " + target );

	}

	public void setStockStoplosswithYN(Scanner input){
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {


			System.out.println("Do you have a stoploss?(Y/N)");
			answer = input.next().charAt(0);
			try {
				
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
			catch(StoplossFormatException e) {
				System.out.println("Incorrect Stoploss Format. put the positive number");
			}
		}
	}
}

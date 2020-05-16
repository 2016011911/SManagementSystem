package stock;

import java.util.Scanner;

import exception.StoplossFormatException;

public class KosdaqStock extends BluechipStock  {
	protected int splitTarget;
	protected int splitStoploss;
	
	public KosdaqStock(StockKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockPrice(input);
		setStockStoplosswithYN(input);
		setSplitStoplosswithYN(input);
		setStockTarget(input);
		
	}
	public void setSplitStoplosswithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.println("Do you have a splitStoploss?(Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setStockStoploss(input);
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
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+skind + " name : " + name + " price : " + price + " stoploss : " + stoploss +" target : " + target );
	}
}

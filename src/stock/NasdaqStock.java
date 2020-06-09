package stock;

import java.util.Scanner;

public class NasdaqStock extends Stock {
	public NasdaqStock(StockKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockPrice(input);
		setStockTarget(input);
		setStockStoploss(input);
	}
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : "+skind + " name : " + name + " price : " + price +" target : " + target + " stoploss : "+ stoploss );
	}
	
	
}

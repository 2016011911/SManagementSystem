package stock;

import java.util.Scanner;

public class KospiStock extends BluechipStock  {
	
	public KospiStock(StockKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setStockName(input);
		setStockPrice(input);
		setStockStoplosswithYN(input);
		setStockTarget(input);

	}
	
}

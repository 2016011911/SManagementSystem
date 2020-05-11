package stock;

import java.util.Scanner;

public interface StockInput {
	public String getName();

	public void setName(String name) ;
	
	public void setPrice(int price);
	
	public void setTarget(int target);
	
	public void setStoploss(int stoploss) ;
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setStockName(Scanner input);
	
	public void setStockPrice(Scanner input);
	
	public void setStockTarget(Scanner input);
	
	public void setStockStoploss(Scanner input);
}

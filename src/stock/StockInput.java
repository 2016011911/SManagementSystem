package stock;

import java.util.Scanner;

import exception.StoplossFormatException;

public interface StockInput {
	public String getName();

	public void setName(String name) ;
	
	public void setPrice(int price);
	
	public int getPrice();
	
	public void setTarget(int target);
	
	public int getTarget();
	
	public void setStoploss(int stoploss) throws StoplossFormatException;
	
	public int getStoploss();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setStockName(Scanner input);
	
	public void setStockPrice(Scanner input);
	
	public void setStockTarget(Scanner input);
	
	public void setStockStoploss(Scanner input);
}

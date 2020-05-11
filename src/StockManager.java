import java.util.ArrayList;
import java.util.Scanner;

import stock.KosdaqStock;
import stock.KospiStock;
import stock.NasdaqStock;
import stock.Stock;
import stock.StockInput;
import stock.StockKind;

public class StockManager {
	ArrayList<StockInput> stocks = new ArrayList<StockInput>();
	Scanner input;
	
	StockManager(Scanner input){
		this.input=input;
	}
		
	public void addStock() {
		int kind =0;
		StockInput stockInput;
		while(kind !=1 && kind!=2) {
			System.out.print("1 for Nasdaq ");
			System.out.print("2 for Kospi ");
			System.out.print("3 for Kosdaq ");
			System.out.print("Select num 1, 2, or 3 for Stock Kind  : ");
			kind = input.nextInt();
			if (kind == 1) {
				stockInput = new NasdaqStock(StockKind.Nasdaq);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else if (kind ==2) {
				stockInput = new KospiStock(StockKind.Kospi);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else if (kind ==3) {
				stockInput = new KosdaqStock(StockKind.Kosdaq);
				stockInput.getUserInput(input);
				stocks.add(stockInput);
				break;
			}
			else {
				System.out.print("Selext num for Stock Kind between 1 and 2 : ");
			}
		}

		
	}
	public void deleteStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();
		int index =findIndex(stockName);
		removeformStocks(index,stockName);
		
	}
	public int findIndex(String stockName) {
		int index = -1;
		for (int i=0; i<stocks.size();i++) {
			if(stocks.get(i).getName().equals(stockName)) {
				index = i;
				break;
			}
		}
		return index;
		
	}
	public int removeformStocks(int index,String stockName) {
		if(index>=0) {
			stocks.remove(index);
			System.out.println("the stock" +stockName+" is deleted " );
			return 1;
		}
		else {
			System.out.println("the stock has not been registered");
			return -1;
		}
	}
	public void editStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();
		for (int i=0; i<stocks.size();i++) {
			StockInput stock = stocks.get(i);
		
			if(stock.getName().equals(stockName)) {
				int num=-1;
				showEditMenu();
				while (num!=5) {
					showEditMenu();
					num = input.nextInt();
					
					switch(num) {
					case 1:
						stock.setStockName(input);
						break;
					case 2:
						stock.setStockPrice(input);
						break;
					case 3:
						stock.setStockTarget(input);
						break;
					case 4:
						stock.setStockStoploss(input);
						break;
					default:
						continue;		
					}
				}//while
				break;
			}//if
		}//for
	}
	public void veiwStocks() {
		System.out.println("num of registered stocks : " + stocks.size());
		for (int i=0; i<stocks.size();i++) {
			stocks.get(i).printInfo();
		}
		
	}

	
	public void showEditMenu() {

		System.out.println("**Stock Info Edit Menu**");
		System.out.println(" 1. Edit Name");
		System.out.println(" 2. Edit Price");
		System.out.println(" 3. Edit Target");
		System.out.println(" 4. View Stoploss");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
		
	}
}

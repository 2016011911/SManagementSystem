import java.util.ArrayList;
import java.util.Scanner;

import stock.KospiStock;
import stock.Stock;

public class StockManager {
	ArrayList<Stock> stocks = new ArrayList<Stock>();
	Scanner input;
	
	StockManager(Scanner input){
		this.input=input;
	}
		
	public void addStock() {
		int kind =0;
		Stock stock;
		while(kind !=1 && kind!=2) {
			System.out.print("1 for Kosdaq ");
			System.out.print("2 for Kospi ");
			System.out.print("Selext num for Stock Kind between 1 and 2 : ");
			kind = input.nextInt();
			if (kind == 1) {
				stock = new Stock();
				stock.getUserInput(input);
				stocks.add(stock);
				break;
			}
			else if (kind ==2) {
				stock = new KospiStock();
				stock.getUserInput(input);
				stocks.add(stock);
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
		int index = -1;
		for (int i=0; i<stocks.size();i++) {
			if(stocks.get(i).getName().equals(stockName)) {
				index = i;
				break;
			}
		}
		if(index>=0) {
			stocks.remove(index);
			System.out.println("the stock" +stockName+" is deleted " );
		}
		else {
			System.out.println("the stock has not been registered");
			return;
		}
		
	}
	public void editStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();
		for (int i=0; i<stocks.size();i++) {
			Stock stock = stocks.get(i);
		
			if(stock.getName().equals(stockName)) {
				int num=-1;

				while (num!=5) {
					System.out.println("**Stock Info Edit Menu**");
					System.out.println(" 1. Edit Name");
					System.out.println(" 2. Edit Price");
					System.out.println(" 3. Edit Target");
					System.out.println(" 4. View Stoploss");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 5:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Stock name : ");
						String name = input.next();
						stock.setName(name);
					}
					else if (num == 2) {
						System.out.print("Stock price : ");
						int price = input.nextInt();
						stock.setPrice(price);
					}
					else if (num == 3) {
						System.out.print("Stock target : ");
						int target = input.nextInt();
						stock.setTarget(target);
					}
					else if (num == 4) {
						System.out.print("Stop Loss : ");
						int stoploss = input.nextInt();
						stock.setStoploss(stoploss);
					}
					else {
						continue;
					}	
				}//while
				break;
			}//if
		}//for
	}
	public void veiwStocks() {
		
//		System.out.print("Stock name : ");
//		String stockName = input.next();
		System.out.println("num of registered stocks : " + stocks.size());
		for (int i=0; i<stocks.size();i++) {
			stocks.get(i).printInfo();
		}
		
	}
}

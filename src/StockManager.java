import java.util.Scanner;

public class StockManager {
	Stock stock;
	Scanner input;
	
	StockManager(Scanner input){
		this.input=input;
	}
		
	public void addStock() {
		stock = new Stock();
		System.out.print("Stock name : ");
		stock.name = input.next();
		System.out.print("Stock price : ");
		stock.price = input.nextInt();
		System.out.print("Stock target : ");
		stock.target = input.nextInt();
		System.out.print("Stop Loss : ");
		stock.stoploss = input.nextInt();
		
	}
	public void deleteStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();
		if(stock == null) {
			System.out.println("the stock has not been registered");
			return;
		}
		if(stock.name.equals(stockName)) {
			System.out.println("the stock to be edited is deleted " );
		}
	}
	public void editStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();

		if(stock.name.equals(stockName)) {
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
					stock.name = input.next();
				}
				else if (num == 2) {
					System.out.print("Stock price : ");
					stock.price = input.nextInt();
				}
				else if (num == 3) {
					System.out.print("Stock target : ");
					stock.target = input.nextInt();
				}
				else if (num == 4) {
					System.out.print("Stop Loss : ");
					stock.stoploss = input.nextInt();
				}
				else {
					continue;
				}	
			}
		}
	}
	public void veiwStock() {
		
		System.out.print("Stock name : ");
		String stockName = input.next();
		if(stock.name.equals(stockName)) {
			stock.printlnfo();
		}
	}
}

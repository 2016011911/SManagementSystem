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
			System.out.println("the stock to be edited is " + stockName);
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

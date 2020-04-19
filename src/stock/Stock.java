package stock;

import java.util.Scanner;

public class Stock {

	protected StockKind kind = StockKind.Kospi;
	protected String name;
	protected int price;
	protected int target;
	protected int stoploss;
	
	public Stock() {		
	}
	
	
	public Stock(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Stock(String name, int price, int target, int stoploss) {
		this.name = name;
		this.price = price;
		this.target = target;
		this.stoploss = stoploss;
	}
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getStoploss() {
		return stoploss;
	}

	public void setStoploss(int stoploss) {
		this.stoploss = stoploss;
	}

	public void printInfo() {
		System.out.println(" name : " + name + " price : " + price + " target : " + target + " stoploss : "+ stoploss);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Stock name : ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Stock price : ");
		int price = input.nextInt();
		this.setPrice(price);
		
		System.out.print("Stock target : ");
		int target = input.nextInt();
		this.setTarget(target);
		
		System.out.print("Stop Loss : ");
		int stoploss = input.nextInt();
		this.setStoploss(stoploss);
	}
}

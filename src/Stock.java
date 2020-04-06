
public class Stock {
	String name;
	int price;
	int target;
	int stoploss;
	
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
	
	public void printlnfo() {
		System.out.println("name : " + name + "price : " + price + "target : " + target + "stoploss : "+ stoploss);
	}
}

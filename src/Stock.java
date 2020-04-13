
public class Stock {
	String name;
	int price;
	int target;
	int stoploss;
	static int numStockRagistered = 0;
	
	public Stock() {		
		numStockRagistered++;
	}
	
	public Stock(String name, int price) {
		this.name = name;
		this.price = price;
		numStockRagistered++;
	}
	
	public Stock(String name, int price, int target, int stoploss) {
		this.name = name;
		this.price = price;
		this.target = target;
		this.stoploss = stoploss;
		numStockRagistered++;
	}
	
	public void printInfo() {
		System.out.println(" name : " + name + " price : " + price + " target : " + target + " stoploss : "+ stoploss);
	}
}

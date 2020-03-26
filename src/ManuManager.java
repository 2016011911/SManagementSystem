import java.util.Scanner;

public class ManuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num !=6) {
			System.out.println("***Stock Management System Menu***");
			System.out.println(" 1. buying stock");
			System.out.println(" 2. selling stock");
			System.out.println(" 3. stock of interest");
			System.out.println(" 4. stock balance");
			System.out.println(" 5. show a menu");
			System.out.println(" 6. Exit");
			System.out.println("Select one number between 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				buyingStock();
			}
			else if (num == 2) {
				sellingStock();
			}
			else if (num == 3) {
				interestingStock();
			}
			else if (num == 4) {
				balanceStock();
			}
			else {
				continue;
			}	
		}
	}
	
	public static void buyingStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock name : ");
		String StockName = input.next();
		System.out.print("Stock price : ");
		int StockPrice = input.nextInt();
		System.out.print("Stock target : ");
		int StockTarget = input.nextInt();
		System.out.print("Stop Loss : ");
		int StopLoss = input.nextInt();
		
	}
	public static void sellingStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock name : ");
		String StockName = input.next();
	}
	public static void interestingStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock name : ");
		String StockName = input.next();
	}
	public static void balanceStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock name : ");
		String StockName = input.next();
	}
}

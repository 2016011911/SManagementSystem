import java.util.Scanner;

public class ManuManager {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		StockManager stockManager = new StockManager(input);
		int num=-1;

		while (num!=5) {
			System.out.println("***Stock Management System Menu***");
			System.out.println(" 1. Add Stock");
			System.out.println(" 2. Delete Stock");
			System.out.println(" 3. Edit Stock");
			System.out.println(" 4. View Stocks");
			System.out.println(" 5. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input.nextInt();
			if (num == 1) {
				stockManager.addStock();
			}
			else if (num == 2) {
				stockManager.deleteStock();
			}
			else if (num == 3) {
				stockManager.editStock();
			}
			else if (num == 4) {
				stockManager.veiwStocks();
			}
			else {
				continue;
			}	
		}
	}
	
}

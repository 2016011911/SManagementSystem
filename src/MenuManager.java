import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		StockManager stockManager = getObject("stockmanager.ser");
		if(stockManager == null) {
			stockManager = new StockManager(input);
		}
		else {
            stockManager.setScanner(input);
        } 		

		selectMenu(input,stockManager);
		putObject(stockManager,"stockmanager.ser");
	}


	public static void selectMenu(Scanner input,StockManager stockManager) {
		int num=-1;

		while (num!=5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					stockManager.addStock();
					logger.log("add a Stock");
					break;
				case 2:
					stockManager.deleteStock();
					logger.log("delete a Stock");
					
					break;
				case 3:
					stockManager.editStock();
					logger.log("edit a Stock");
					
					break;
				case 4:
					stockManager.veiwStocks();
					logger.log("a list of Stock");
					
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num=-1;
			}
		}
	}
	
	
	
	public static void showMenu() {
		System.out.println("***Stock Management System Menu***");
		System.out.println(" 1. Add Stock");
		System.out.println(" 2. Delete Stock");
		System.out.println(" 3. Edit Stock");
		System.out.println(" 4. View Stocks");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 5:");
	}
	
	public static StockManager getObject(String fileName) {
		StockManager stockManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			stockManager = (StockManager) in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return stockManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stockManager;
	
	}
	
	public static void putObject(StockManager stockManager ,String fileName) {
		
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(stockManager);
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}

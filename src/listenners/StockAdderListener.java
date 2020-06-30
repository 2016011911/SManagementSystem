package listenners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.StoplossFormatException;
import manager.StockManager;
import stock.NasdaqStock;
import stock.Stock;
import stock.StockInput;
import stock.StockKind;

public class StockAdderListener implements ActionListener {
	
	JTextField fieldName;
	JTextField fieldPrice;
	JTextField fieldTarget;
	JTextField fieldStoploss;
	
	StockManager stockManager;
	
	public StockAdderListener(
			JTextField fieldName, 
			JTextField fieldPrice, 
			JTextField fieldTarget,
			JTextField fieldStoploss,
			StockManager stockManager) {
		
		this.fieldName = fieldName;
		this.fieldPrice = fieldPrice;
		this.fieldTarget = fieldTarget;
		this.fieldStoploss = fieldStoploss;
		this.stockManager = stockManager;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		StockInput stock = new NasdaqStock(StockKind.Nasdaq);
		
		try {
			stock.setName(fieldName.getText());
			stock.setPrice(Integer.parseInt(fieldPrice.getText()));
			stock.setTarget(Integer.parseInt(fieldTarget.getText()));
			stock.setStoploss(Integer.parseInt(fieldStoploss.getText()));
			stockManager.addStock(stock);
			putObject(stockManager,"stockmanager.ser");
			stock.printInfo();
		} catch (NumberFormatException | StoplossFormatException e1) {
		
			e1.printStackTrace();
		}
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

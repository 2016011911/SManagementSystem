package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.StockManager;
import stock.StockInput;

public class StockViewer extends JPanel{
	
	WindowFrame frame;
	
	StockManager stockManager;
	
	public StockViewer(WindowFrame frame,StockManager stockManager) {
		
		this.frame = frame;
		this.stockManager = stockManager;
		
		System.out.println("***"+stockManager.size() +"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Target");
		model.addColumn("Stoploss");
		
		for(int i=0; i<stockManager.size();i++) {
			Vector row = new Vector();
			StockInput si = stockManager.get(i);
			row.add(si.getName());
			row.add(si.getPrice());
			row.add(si.getTarget());
			row.add(si.getStoploss());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}

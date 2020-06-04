package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StockViewer extends JPanel{
	
	WindowFrame frame;
	
	public StockViewer(WindowFrame frame) {
		
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Target");
		model.addColumn("Contact Info");
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}

}

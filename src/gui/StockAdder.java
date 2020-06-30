package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listenners.StockAdderCancelListener;
import listenners.StockAdderListener;
import manager.StockManager;

public class StockAdder extends JPanel {
	
	WindowFrame frame;
	StockManager stockManager;
	public StockAdder(WindowFrame frame,StockManager stockManager) {
		this.frame = frame;
		this.stockManager = stockManager;
		
		JPanel panel = new JPanel(new SpringLayout());
		panel.setLayout(new SpringLayout());
		
		JLabel labelName = new JLabel("Name : ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelPrice = new JLabel("Price : ",JLabel.TRAILING);
		JTextField fieldPrice = new JTextField(10);
		labelName.setLabelFor(fieldPrice);
		
		panel.add(labelPrice);
		panel.add(fieldPrice);
		
		JLabel labelTarget = new JLabel("Target : ",JLabel.TRAILING);
		JTextField fieldTarget = new JTextField(10);
		labelName.setLabelFor(fieldTarget);
		panel.add(labelTarget);
		panel.add(fieldTarget);
		
		JLabel labelStoploss = new JLabel("Stoploss : ",JLabel.TRAILING);
		JTextField fieldStoploss = new JTextField(10);
		labelName.setLabelFor(fieldStoploss);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new StockAdderListener(fieldName,fieldPrice,fieldTarget,fieldStoploss,stockManager));
		
		JButton cancelButton = new JButton("cnacel");
		cancelButton.addActionListener(new StockAdderCancelListener(frame));
		
		panel.add(labelStoploss);
		panel.add(fieldStoploss);
		

		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5,2,6,6,6,6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
}

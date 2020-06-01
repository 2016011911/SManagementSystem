package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class StockAdder extends JFrame {
	public StockAdder() {
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
		panel.add(labelStoploss);
		panel.add(fieldStoploss);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cnacel"));
		
		SpringUtilities.makeCompactGrid(panel, 5,2,6,6,6,6);
		
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}

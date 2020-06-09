package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.StockManager;
 
public class WindowFrame extends JFrame{
	
	StockManager stockManager;
	
	MenuSelection menuselection ;
	StockAdder stockadder ;
	StockViewer stockviewer ;

	
	public WindowFrame(StockManager stockManager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Stock");
		
		this.stockManager = stockManager;
		menuselection = new MenuSelection(this);
		stockadder = new StockAdder(this);
		stockviewer = new StockViewer(this, this.stockManager);
		
		
		this.setupPanel(menuselection);
		
		this.setVisible(true);
	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public StockAdder getStockadder() {
		return stockadder;
	}
	public void setStockadder(StockAdder stockadder) {
		this.stockadder = stockadder;
	}
	public StockViewer getStockviewer() {
		return stockviewer;
	}
	public void setStockviewer(StockViewer stockviewer) {
		this.stockviewer = stockviewer;
	}
}

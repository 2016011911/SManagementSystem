package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection ;
	StockAdder stockadder ;
	StockViewer stockviewer ;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.stockadder = new StockAdder(this);
		this.stockviewer = new StockViewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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

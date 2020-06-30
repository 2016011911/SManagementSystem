package listenners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.StockAdder;
import gui.StockViewer;
import gui.WindowFrame;

public class StockAdderCancelListener implements ActionListener {
	
	WindowFrame frame;
	
	public StockAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
	}

}

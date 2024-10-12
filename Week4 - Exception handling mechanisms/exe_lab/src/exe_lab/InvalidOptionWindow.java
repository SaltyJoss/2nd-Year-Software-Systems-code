package exe_lab;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InvalidOptionWindow extends InvalidOptionException{
	
	/**
	 * errorDialog message in JFrame box
	 * 
	 */
	public void errorDialog(String message) {
		JOptionPane.showMessageDialog(new JFrame(), message, "ERROR:", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * empty constructor to call
	 * 
	 */
	public InvalidOptionWindow(String message){
		super(message);
	}

}

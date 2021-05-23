package gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.GridLayout;
import java.awt.Component;

/**
 * This is the window where the fight will be displayed for the user.
 * 
 * @author BloodLantern
 * @see gui/MainWindow Main Window
 */
public class FightWindow extends JFrame {

	/**
	 * Creates the application.
	 */
	public FightWindow(int posX, int posY) {
		super();
		getContentPane().setLayout(null);
		
		JPanel container = new JPanel();
		container.setBounds(0, 0, 464, 283);
		getContentPane().add(container);
		container.setLayout(null);
		
		JTextPane textOutput = new JTextPane();
		textOutput.setBounds(0, 283, 464, 77);
		textOutput.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		textOutput.setText("a");
		getContentPane().add(textOutput);
		initialize(posX, posY);
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize(int posX, int posY) {
		this.setLocation(posX, posY);
		this.setSize(480, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public JFrame getFrame() {
		return this;
	}

}

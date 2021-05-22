package gui;

import javax.swing.JFrame;

public class FightWindow extends JFrame {

	private JFrame frame;

	/**
	 * Creates the application.
	 */
	public FightWindow() {
		initialize();
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() {
		this.frame = this;
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return frame;
	}

}

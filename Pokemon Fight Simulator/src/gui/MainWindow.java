package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow {

	private JFrame frmPokemonFightSimulator;

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPokemonFightSimulator = new JFrame();
		frmPokemonFightSimulator.setTitle("Pokemon Fight Simulator");
		frmPokemonFightSimulator.setBounds(100, 100, 450, 300);
		frmPokemonFightSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokemonFightSimulator.getContentPane().setLayout(new BorderLayout(0, 0));
		frmPokemonFightSimulator.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Pokemon Fight Simulator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frmPokemonFightSimulator.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Add a new Pokemon to Database");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getFrame().setVisible(false);
				AddPokemonWindow addPokemon = new AddPokemonWindow(getFrame());
				addPokemon.getFrame().setVisible(true);
			}
		});
		btnNewButton.setToolTipText("Opens a new window where you can answer fields corresponding to this new Pokemon's statistics");
		frmPokemonFightSimulator.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		frmPokemonFightSimulator.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel.add(separator);
		
		JButton btnNewButton_1 = new JButton("Play");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Options");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit Game");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Shutdown");
				System.exit(0);
			}
		});
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		panel.add(separator_1);
	}
	
	public JFrame getFrame() {
		return frmPokemonFightSimulator;
	}
}

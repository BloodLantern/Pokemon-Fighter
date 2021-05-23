package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

/**
 * This is the class about the Main this of the program. It will be used for the
 * different menus.
 * 
 * @author maxim
 */
public class MainWindow extends JFrame {

	/**
	 * Creates the application.
	 */
	public MainWindow() {
		super();
		initialize();
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize() {
		this.setTitle("Pokemon Fight Simulator");
		this.setSize(480, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		mainMenu();
	}

	/**
	 * Displays Main Menu.
	 */
	private void mainMenu() {
		this.getContentPane().setName("mainMenu");
		this.getContentPane().removeAll();
		this.getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel title = new JLabel("Pokemon Fight Simulator");
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setForeground(Color.ORANGE);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(title, BorderLayout.NORTH);

		JPanel centerContainer = new JPanel();
		this.getContentPane().add(centerContainer, BorderLayout.CENTER);

		JButton multiPlayerButton = new JButton("Multiplayer");
		multiPlayerButton.setAlignmentX(0.5f);
		multiPlayerButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		multiPlayerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.err.println("Not available yet!");
			}
		});
		centerContainer.setLayout(new BoxLayout(centerContainer, BoxLayout.Y_AXIS));

		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		centerContainer.add(separator);

		JButton singlePlayerButton = new JButton("Single Player");
		singlePlayerButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		singlePlayerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Beginning a new Single Player fight.");
				EventQueue.invokeLater(new Runnable() {
					@Override
					public void run() {
						try {
							FightWindow player1 = new FightWindow(100, 100);
							player1.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				EventQueue.invokeLater(new Runnable() {
					@Override
					public void run() {
						try {
							FightWindow player2 = new FightWindow(580, 100);
							player2.getFrame().setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				getFrame().dispose();
			}
		});
		singlePlayerButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		singlePlayerButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		centerContainer.add(singlePlayerButton);
		multiPlayerButton.setAlignmentY(Component.CENTER_ALIGNMENT);
		centerContainer.add(multiPlayerButton);

		JButton exitButton = new JButton("Exit Game");
		exitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Shutdown");
				System.exit(0);
			}
		});

		JButton optionsButton = new JButton("Options");
		optionsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				optionsMenu();
			}
		});
		optionsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		centerContainer.add(optionsButton);
		exitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		centerContainer.add(exitButton);

		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		centerContainer.add(separator_1);

		JButton addPokemonButton = new JButton("Add a new Pokemon to Database");
		addPokemonButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				getFrame().setVisible(false);
				AddPokemonWindow addPokemon = new AddPokemonWindow(getFrame());
				addPokemon.getFrame().setVisible(true);
			}
		});
		addPokemonButton.setToolTipText(
				"Opens a new this where you can answer fields corresponding to this new Pokemon's statistics and adds it to the program's database.");
		this.getContentPane().add(addPokemonButton, BorderLayout.SOUTH);

		this.repaint();
	}

	/**
	 * Displays Play Menu.
	 */
	private void playMenu() {
		this.getContentPane().removeAll();
		this.getContentPane().setName("playMenu");
		this.getContentPane().setLayout(new BorderLayout(0, 0));

		JLabel title = new JLabel("Select Game Mode");
		title.setFont(new Font("Tahoma", Font.BOLD, 20));
		title.setForeground(Color.ORANGE);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		this.getContentPane().add(title, BorderLayout.NORTH);

		JPanel centerContainer = new JPanel();
		this.getContentPane().add(centerContainer, BorderLayout.CENTER);

		JPanel downContainer = new JPanel();
		getContentPane().add(downContainer, BorderLayout.SOUTH);
		downContainer.setLayout(new BoxLayout(downContainer, BoxLayout.X_AXIS));

		JButton backButtonOptions = new JButton("Back");
		backButtonOptions.setFont(new Font("Tahoma", Font.PLAIN, 15));
		downContainer.add(backButtonOptions);

		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mainMenu();
			}
		});

		this.repaint();
	}

	/**
	 * Displays Options Menu.
	 */
	private void optionsMenu() {
		this.getContentPane().setName("optionsMenu");
		this.getContentPane().removeAll();

		this.pack();
		this.setSize(1280, 720);
	}

	/**
	 * Used to get this Frame.
	 * 
	 * @return This frame.
	 */
	public JFrame getFrame() {
		return this;
	}
}

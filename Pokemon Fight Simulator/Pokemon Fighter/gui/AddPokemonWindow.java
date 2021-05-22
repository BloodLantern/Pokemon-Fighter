package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import io.Add_Pokemon;
import io.FolderScanner;
import pokemons.Types;

/**
 * This class is about the window that adds a new Pokemon to the system.
 * 
 * @author maxim
 */
public class AddPokemonWindow extends JFrame {

	/**
	 * Creates the application.
	 */
	public AddPokemonWindow(JFrame launcher) {
		initialize(launcher);
	}

	/**
	 * Initializes the contents of the frame.
	 */
	private void initialize(JFrame launcher) {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 513, 365);
		getFrame().setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		getFrame().setLocationRelativeTo(null);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 88, 394, 38, 0 };
		gridBagLayout.rowHeights = new int[] { 35, 24, 22, 22, 24, 20, 24, 24, 24, 24, 24, 34, 14, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		this.getContentPane().setLayout(gridBagLayout);

		JComboBox<Types> type1ComboBox = new JComboBox<Types>();
		for (Types t : Types.getTypesList())
			type1ComboBox.addItem(t);
		type1ComboBox.setMaximumRowCount(18);
		type1ComboBox.setToolTipText("New Pokemon's Primary Type");

		JLabel title = new JLabel("Please complete these fields");
		title.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_title = new GridBagConstraints();
		gbc_title.fill = GridBagConstraints.VERTICAL;
		gbc_title.insets = new Insets(0, 0, 5, 5);
		gbc_title.gridx = 1;
		gbc_title.gridy = 0;
		this.getContentPane().add(title, gbc_title);

		JLabel nameLabel = new JLabel("Name:");
		GridBagConstraints gbc_nameLabel = new GridBagConstraints();
		gbc_nameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_nameLabel.gridx = 0;
		gbc_nameLabel.gridy = 1;
		this.getContentPane().add(nameLabel, gbc_nameLabel);
		/*
		 * MaskFormatter numbers = null; try { numbers = new MaskFormatter("#####"); }
		 * catch (ParseException e) { e.printStackTrace(); }
		 */
		JFormattedTextField nameTextField = new JFormattedTextField();
		nameTextField.setToolTipText("New Pokemon's name");
		GridBagConstraints gbc_nameTextField = new GridBagConstraints();
		gbc_nameTextField.fill = GridBagConstraints.BOTH;
		gbc_nameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_nameTextField.gridx = 1;
		gbc_nameTextField.gridy = 1;
		this.getContentPane().add(nameTextField, gbc_nameTextField);

		JLabel type1Label = new JLabel("Type 1:");
		GridBagConstraints gbc_type1Label = new GridBagConstraints();
		gbc_type1Label.insets = new Insets(0, 0, 5, 5);
		gbc_type1Label.gridx = 0;
		gbc_type1Label.gridy = 2;
		this.getContentPane().add(type1Label, gbc_type1Label);
		GridBagConstraints gbc_type1ComboBox = new GridBagConstraints();
		gbc_type1ComboBox.anchor = GridBagConstraints.NORTH;
		gbc_type1ComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_type1ComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_type1ComboBox.gridx = 1;
		gbc_type1ComboBox.gridy = 2;
		this.getContentPane().add(type1ComboBox, gbc_type1ComboBox);

		JLabel type2Label = new JLabel("Type 2:");
		type2Label.setToolTipText("Optionnal");
		GridBagConstraints gbc_type2Label = new GridBagConstraints();
		gbc_type2Label.insets = new Insets(0, 0, 5, 5);
		gbc_type2Label.gridx = 0;
		gbc_type2Label.gridy = 3;
		this.getContentPane().add(type2Label, gbc_type2Label);

		JComboBox<Types> type2comboBox = new JComboBox<Types>();
		for (Types t : Types.getTypesList())
			type2comboBox.addItem(t);
		type2comboBox.addItem(null);
		type2comboBox.setSelectedItem(null);
		type2comboBox.setMaximumRowCount(19);
		type2comboBox.setToolTipText("New Pokemon's Secondary Type (Optional)");

		GridBagConstraints gbc_type2comboBox = new GridBagConstraints();
		gbc_type2comboBox.anchor = GridBagConstraints.NORTH;
		gbc_type2comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_type2comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_type2comboBox.gridx = 1;
		gbc_type2comboBox.gridy = 3;
		this.getContentPane().add(type2comboBox, gbc_type2comboBox);

		JLabel hpLabel = new JLabel("Base HPs:");
		GridBagConstraints gbc_hpLabel = new GridBagConstraints();
		gbc_hpLabel.insets = new Insets(0, 0, 5, 5);
		gbc_hpLabel.gridx = 0;
		gbc_hpLabel.gridy = 4;
		this.getContentPane().add(hpLabel, gbc_hpLabel);

		JFormattedTextField hpTextField = new JFormattedTextField(/* numbers */);
		hpTextField.setToolTipText("New Pokemon's Base Health Points");
		GridBagConstraints gbc_hpTextField = new GridBagConstraints();
		gbc_hpTextField.fill = GridBagConstraints.BOTH;
		gbc_hpTextField.insets = new Insets(0, 0, 5, 5);
		gbc_hpTextField.gridx = 1;
		gbc_hpTextField.gridy = 4;
		this.getContentPane().add(hpTextField, gbc_hpTextField);

		JLabel atkLabel = new JLabel("Base Atk:");
		GridBagConstraints gbc_atkLabel = new GridBagConstraints();
		gbc_atkLabel.insets = new Insets(0, 0, 5, 5);
		gbc_atkLabel.gridx = 0;
		gbc_atkLabel.gridy = 5;
		this.getContentPane().add(atkLabel, gbc_atkLabel);

		JFormattedTextField atkTextField = new JFormattedTextField(/* numbers */);
		atkTextField.setToolTipText("New Pokemon's Base Attack");
		GridBagConstraints gbc_atkTextField = new GridBagConstraints();
		gbc_atkTextField.anchor = GridBagConstraints.NORTH;
		gbc_atkTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_atkTextField.insets = new Insets(0, 0, 5, 5);
		gbc_atkTextField.gridx = 1;
		gbc_atkTextField.gridy = 5;
		this.getContentPane().add(atkTextField, gbc_atkTextField);

		JLabel defLabel = new JLabel("Base Def:");
		GridBagConstraints gbc_defLabel = new GridBagConstraints();
		gbc_defLabel.insets = new Insets(0, 0, 5, 5);
		gbc_defLabel.gridx = 0;
		gbc_defLabel.gridy = 6;
		this.getContentPane().add(defLabel, gbc_defLabel);

		JFormattedTextField defTextField = new JFormattedTextField(/* numbers */);
		defTextField.setToolTipText("New Pokemon's Base Defense");
		GridBagConstraints gbc_defTextField = new GridBagConstraints();
		gbc_defTextField.fill = GridBagConstraints.BOTH;
		gbc_defTextField.insets = new Insets(0, 0, 5, 5);
		gbc_defTextField.gridx = 1;
		gbc_defTextField.gridy = 6;
		this.getContentPane().add(defTextField, gbc_defTextField);

		JLabel spatkLabel = new JLabel("Base SpAtk");
		GridBagConstraints gbc_spatkLabel = new GridBagConstraints();
		gbc_spatkLabel.insets = new Insets(0, 0, 5, 5);
		gbc_spatkLabel.gridx = 0;
		gbc_spatkLabel.gridy = 7;
		this.getContentPane().add(spatkLabel, gbc_spatkLabel);

		JFormattedTextField spatkTextField = new JFormattedTextField(/* numbers */);
		spatkTextField.setToolTipText("New Pokemon's Base Special Attack");
		GridBagConstraints gbc_spatkTextField = new GridBagConstraints();
		gbc_spatkTextField.fill = GridBagConstraints.BOTH;
		gbc_spatkTextField.insets = new Insets(0, 0, 5, 5);
		gbc_spatkTextField.gridx = 1;
		gbc_spatkTextField.gridy = 7;
		this.getContentPane().add(spatkTextField, gbc_spatkTextField);

		JLabel spdefLabel = new JLabel("Base SpDef");
		GridBagConstraints gbc_spdefLabel = new GridBagConstraints();
		gbc_spdefLabel.insets = new Insets(0, 0, 5, 5);
		gbc_spdefLabel.gridx = 0;
		gbc_spdefLabel.gridy = 8;
		this.getContentPane().add(spdefLabel, gbc_spdefLabel);

		JFormattedTextField spdefTextField = new JFormattedTextField(/* numbers */);
		spdefTextField.setToolTipText("New Pokemon's Base Special Defense");
		GridBagConstraints gbc_spdefTextField = new GridBagConstraints();
		gbc_spdefTextField.fill = GridBagConstraints.BOTH;
		gbc_spdefTextField.insets = new Insets(0, 0, 5, 5);
		gbc_spdefTextField.gridx = 1;
		gbc_spdefTextField.gridy = 8;
		this.getContentPane().add(spdefTextField, gbc_spdefTextField);

		JLabel speedLabel = new JLabel("Base Speed");
		GridBagConstraints gbc_speedLabel = new GridBagConstraints();
		gbc_speedLabel.insets = new Insets(0, 0, 5, 5);
		gbc_speedLabel.gridx = 0;
		gbc_speedLabel.gridy = 9;
		this.getContentPane().add(speedLabel, gbc_speedLabel);

		JFormattedTextField speedTextField = new JFormattedTextField(/* numbers */);
		speedTextField.setToolTipText("New Pokemon's Base Speed");
		GridBagConstraints gbc_speedTextField = new GridBagConstraints();
		gbc_speedTextField.fill = GridBagConstraints.BOTH;
		gbc_speedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_speedTextField.gridx = 1;
		gbc_speedTextField.gridy = 9;
		this.getContentPane().add(speedTextField, gbc_speedTextField);

		JLabel evolveLabel = new JLabel("Evolves from");
		GridBagConstraints gbc_evolveLabel = new GridBagConstraints();
		gbc_evolveLabel.anchor = GridBagConstraints.EAST;
		gbc_evolveLabel.insets = new Insets(0, 0, 5, 5);
		gbc_evolveLabel.gridx = 0;
		gbc_evolveLabel.gridy = 10;
		this.getContentPane().add(evolveLabel, gbc_evolveLabel);

		JComboBox<String> evolveComboBox = new JComboBox<String>();
		evolveComboBox.setToolTipText("Who this new Pokemon should evolve from (Leave Pokemon if none)");
		evolveComboBox.addItem("Pokemon");
		scanPokemons(evolveComboBox);
		evolveComboBox.setSelectedItem("Pokemon");

		GridBagConstraints gbc_evolveComboBox = new GridBagConstraints();
		gbc_evolveComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_evolveComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_evolveComboBox.gridx = 1;
		gbc_evolveComboBox.gridy = 10;
		this.getContentPane().add(evolveComboBox, gbc_evolveComboBox);

		JPanel backConfirmPanel = new JPanel();
		GridBagConstraints gbc_backConfirmPanel = new GridBagConstraints();
		gbc_backConfirmPanel.insets = new Insets(0, 0, 5, 5);
		gbc_backConfirmPanel.fill = GridBagConstraints.BOTH;
		gbc_backConfirmPanel.gridx = 1;
		gbc_backConfirmPanel.gridy = 11;
		this.getContentPane().add(backConfirmPanel, gbc_backConfirmPanel);
		backConfirmPanel.setLayout(new GridLayout(0, 2, 0, 0));

		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				launcher.setVisible(true);
				getFrame().dispose();
			}
		});
		backConfirmPanel.add(backButton);

		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				nameLabel.setForeground(Color.BLACK);
				hpLabel.setForeground(Color.BLACK);
				atkLabel.setForeground(Color.BLACK);
				defLabel.setForeground(Color.BLACK);
				spatkLabel.setForeground(Color.BLACK);
				spdefLabel.setForeground(Color.BLACK);
				speedLabel.setForeground(Color.BLACK);

				int answered = 0;
				// If all fields changed
				if (nameTextField.getText().equals(""))
					answered++;
				if (hpTextField.getText().equals(""))
					answered++;
				if (atkTextField.getText().equals(""))
					answered++;
				if (defTextField.getText().equals(""))
					answered++;
				if (spatkTextField.getText().equals(""))
					answered++;
				if (spdefTextField.getText().equals(""))
					answered++;
				if (speedTextField.getText().equals(""))
					answered++;

				// If user filled all fields
				if (answered == 0) {

					System.out.println(
							"\n------- All fields has been filled -------\n\nBeginning Pokemon file writing...");
					if (atkTextField.getText() != "") {
						Add_Pokemon.generate(nameTextField.getText(), (Types) type1ComboBox.getSelectedItem(),
								(Types) type2comboBox.getSelectedItem(), Integer.parseInt(hpTextField.getText()),
								Integer.parseInt(atkTextField.getText()), Integer.parseInt(defTextField.getText()),
								Integer.parseInt(spatkTextField.getText()), Integer.parseInt(spdefTextField.getText()),
								Integer.parseInt(speedTextField.getText()),
								evolveComboBox.getSelectedItem().toString());
					} else {
						Add_Pokemon.generate(nameTextField.getText(), (Types) type1ComboBox.getSelectedItem(), null,
								Integer.parseInt(hpTextField.getText()), Integer.parseInt(atkTextField.getText()),
								Integer.parseInt(defTextField.getText()), Integer.parseInt(spatkTextField.getText()),
								Integer.parseInt(spdefTextField.getText()), Integer.parseInt(speedTextField.getText()),
								evolveComboBox.getSelectedItem().toString());
					}
					System.out.println("\n------- Pokemon file writing finished -------");
					
					class t extends Thread {
						public void run() {
							title.setForeground(Color.GREEN);
							title.setText(nameTextField.getText() + " has been successfully added");
							scanPokemons(evolveComboBox);
							evolveComboBox.setSelectedItem(nameTextField.getText());
							nameTextField.setText("");
							hpTextField.setText("");
							atkTextField.setText("");
							defTextField.setText("");
							spatkTextField.setText("");
							spdefTextField.setText("");
							speedTextField.setText("");
							try {
								Thread.sleep(5000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							title.setForeground(Color.BLACK);
							title.setText("Please complete these fields");
						}
					}
					t t = new t();
					t.start();

				} else {

					String[] memory = new String[7];
					memory[0] = nameTextField.getText();
					memory[1] = hpTextField.getText();
					memory[2] = atkTextField.getText();
					memory[3] = defTextField.getText();
					memory[4] = spatkTextField.getText();
					memory[5] = spdefTextField.getText();
					memory[6] = speedTextField.getText();

					for (; answered > 0; answered--) {
						if (nameTextField.getText().equals("")) {
							nameLabel.setForeground(Color.RED);
							nameTextField.setText("Temp");
						} else if (hpTextField.getText().equals("")) {
							hpLabel.setForeground(Color.RED);
							hpTextField.setText("Temp");
						} else if (atkTextField.getText().equals("")) {
							atkLabel.setForeground(Color.RED);
							atkTextField.setText("Temp");
						} else if (defTextField.getText().equals("")) {
							defLabel.setForeground(Color.RED);
							defTextField.setText("Temp");
						} else if (spatkTextField.getText().equals("")) {
							spatkLabel.setForeground(Color.RED);
							spatkTextField.setText("Temp");
						} else if (spdefTextField.getText().equals("")) {
							spdefLabel.setForeground(Color.RED);
							spdefTextField.setText("Temp");
						} else if (speedTextField.getText().equals("")) {
							speedLabel.setForeground(Color.RED);
							speedTextField.setText("Temp");
						}
					}

					nameTextField.setText(memory[0]);
					hpTextField.setText(memory[1]);
					atkTextField.setText(memory[2]);
					defTextField.setText(memory[3]);
					spatkTextField.setText(memory[4]);
					spdefTextField.setText(memory[5]);
					speedTextField.setText(memory[6]);

				}
			}
		});
		addButton.setToolTipText("Add this Pokemon to database");
		addButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		backConfirmPanel.add(addButton);
	}

	public JFrame getFrame() {
		return this;
	}

	public void setFrame(JFrame frame) {
		this.setTitle("Add new Pokemon");
		frame.setResizable(false);
	}

	private void scanPokemons(JComboBox<String> component) {
		// Scanning for all Pokemon files actually existing
		System.out.println("-----------------------------\nSCANNING FOR POKEMON FILES\n-----------------------------");
		FolderScanner fs = new FolderScanner(Paths.get("Pokemon Fighter\\pokemons"), "*.java");
		fs.addToBlackList("Pokemon Fighter\\pokemons\\Natures.java");
		fs.addToBlackList("Pokemon Fighter\\pokemons\\Pokemon.java");
		fs.addToBlackList("Pokemon Fighter\\pokemons\\Types.java");
		fs.addToBlackList("Pokemon Fighter\\pokemons\\Weaknesses.java");
		int processors = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(processors);
		long start = System.currentTimeMillis();
		pool.invoke(fs);
		System.out.println("There is/are " + fs.getResult() + " file(s) of type Pokemon\nTime spent: "
				+ (System.currentTimeMillis() - start) + "ms");
		String[] s = new String[fs.getFilesList().size()];
		for (int i = 0; i < fs.getFilesList().size(); i++) {
			s[i] = (fs.getFilesList().get(i).getName().replaceAll(".java", ""));
		}
		Arrays.sort(s);
		for (int i = 0; i < fs.getFilesList().size(); i++) {
			component.addItem(s[i]);
		}
	}

}

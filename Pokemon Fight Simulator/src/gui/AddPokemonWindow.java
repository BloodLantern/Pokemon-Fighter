package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

import io.Add_Pokemon;
import io.FolderScanner;
import pokemons.Types;

public class AddPokemonWindow {

	private JFrame frmAddNewPokemon;

	/**
	 * Create the application.
	 */
	public AddPokemonWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 513, 365);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 88, 394, 38, 0 };
		gridBagLayout.rowHeights = new int[] { 35, 24, 22, 22, 24, 20, 24, 24, 24, 24, 24, 23, 7, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		frmAddNewPokemon.getContentPane().setLayout(gridBagLayout);

		JComboBox<Types> comboBox_1 = new JComboBox<Types>(Types.getTypesList());
		comboBox_1.setMaximumRowCount(18);
		comboBox_1.setToolTipText("New Pokemon's Primary Type");

		JLabel lblNewLabel = new JLabel("Please complete these fields");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		frmAddNewPokemon.getContentPane().add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		/*
		MaskFormatter numbers = null;
		try {
			numbers = new MaskFormatter("#####");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		*/
		JFormattedTextField frmtdtxtfldTest = new JFormattedTextField();
		frmtdtxtfldTest.setToolTipText("New Pokemon's name");
		GridBagConstraints gbc_frmtdtxtfldTest = new GridBagConstraints();
		gbc_frmtdtxtfldTest.fill = GridBagConstraints.BOTH;
		gbc_frmtdtxtfldTest.insets = new Insets(0, 0, 5, 5);
		gbc_frmtdtxtfldTest.gridx = 1;
		gbc_frmtdtxtfldTest.gridy = 1;
		frmAddNewPokemon.getContentPane().add(frmtdtxtfldTest, gbc_frmtdtxtfldTest);

		JLabel lblNewLabel_2 = new JLabel("Type 1:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.anchor = GridBagConstraints.NORTH;
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.gridx = 1;
		gbc_comboBox_1.gridy = 2;
		frmAddNewPokemon.getContentPane().add(comboBox_1, gbc_comboBox_1);

		JLabel lblNewLabel_3 = new JLabel("Type 2:");
		lblNewLabel_3.setToolTipText("Optionnal");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);

		JComboBox<Types> comboBox = new JComboBox<Types>(Types.getTypesList());
		comboBox.addItem(null);
		comboBox.setSelectedItem(null);
		comboBox.setMaximumRowCount(19);
		comboBox.setToolTipText("New Pokemon's Secondary Type (Optional)");

		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		frmAddNewPokemon.getContentPane().add(comboBox, gbc_comboBox);

		JLabel lblNewLabel_4 = new JLabel("Base HPs:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);

		JFormattedTextField formattedTextField_2 = new JFormattedTextField(/*numbers*/);
		formattedTextField_2.setToolTipText("New Pokemon's Base Health Points");
		GridBagConstraints gbc_formattedTextField_2 = new GridBagConstraints();
		gbc_formattedTextField_2.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField_2.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_2.gridx = 1;
		gbc_formattedTextField_2.gridy = 4;
		frmAddNewPokemon.getContentPane().add(formattedTextField_2, gbc_formattedTextField_2);

		JLabel lblNewLabel_5 = new JLabel("Base Atk:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);

		JFormattedTextField formattedTextField = new JFormattedTextField(/*numbers*/);
		formattedTextField.setToolTipText("New Pokemon's Base Attack");
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.anchor = GridBagConstraints.NORTH;
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 5;
		frmAddNewPokemon.getContentPane().add(formattedTextField, gbc_formattedTextField);

		JLabel lblNewLabel_6 = new JLabel("Base Def:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_6, gbc_lblNewLabel_6);

		JFormattedTextField formattedTextField_3 = new JFormattedTextField(/*numbers*/);
		formattedTextField_3.setToolTipText("New Pokemon's Base Defense");
		GridBagConstraints gbc_formattedTextField_3 = new GridBagConstraints();
		gbc_formattedTextField_3.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField_3.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_3.gridx = 1;
		gbc_formattedTextField_3.gridy = 6;
		frmAddNewPokemon.getContentPane().add(formattedTextField_3, gbc_formattedTextField_3);

		JLabel lblNewLabel_7 = new JLabel("Base SpAtk");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_7, gbc_lblNewLabel_7);

		JFormattedTextField formattedTextField_4 = new JFormattedTextField(/*numbers*/);
		formattedTextField_4.setToolTipText("New Pokemon's Base Special Attack");
		GridBagConstraints gbc_formattedTextField_4 = new GridBagConstraints();
		gbc_formattedTextField_4.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField_4.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_4.gridx = 1;
		gbc_formattedTextField_4.gridy = 7;
		frmAddNewPokemon.getContentPane().add(formattedTextField_4, gbc_formattedTextField_4);

		JLabel lblNewLabel_8 = new JLabel("Base SpDef");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_8, gbc_lblNewLabel_8);

		JFormattedTextField formattedTextField_5 = new JFormattedTextField(/*numbers*/);
		formattedTextField_5.setToolTipText("New Pokemon's Base Special Defense");
		GridBagConstraints gbc_formattedTextField_5 = new GridBagConstraints();
		gbc_formattedTextField_5.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField_5.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_5.gridx = 1;
		gbc_formattedTextField_5.gridy = 8;
		frmAddNewPokemon.getContentPane().add(formattedTextField_5, gbc_formattedTextField_5);

		JLabel lblNewLabel_9 = new JLabel("Base Speed");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 0;
		gbc_lblNewLabel_9.gridy = 9;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_9, gbc_lblNewLabel_9);

		JFormattedTextField formattedTextField_6 = new JFormattedTextField(/*numbers*/);
		formattedTextField_6.setToolTipText("New Pokemon's Base Speed");
		GridBagConstraints gbc_formattedTextField_6 = new GridBagConstraints();
		gbc_formattedTextField_6.fill = GridBagConstraints.BOTH;
		gbc_formattedTextField_6.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField_6.gridx = 1;
		gbc_formattedTextField_6.gridy = 9;
		frmAddNewPokemon.getContentPane().add(formattedTextField_6, gbc_formattedTextField_6);

		JLabel lblNewLabel_10 = new JLabel("Evolves from");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 0;
		gbc_lblNewLabel_10.gridy = 10;
		frmAddNewPokemon.getContentPane().add(lblNewLabel_10, gbc_lblNewLabel_10);

		JComboBox<String> comboBox_2 = new JComboBox<String>();
		comboBox_2.setToolTipText("Who this new Pokemon should evolve from (Leave Pokemon if none)");
		comboBox_2.addItem("Pokemon");
		
		// Scanning for all Pokemon files actually existing
		System.out.println("-----------------------------\nSCANNING FOR POKEMON FILES\n-----------------------------");
		FolderScanner fs = new FolderScanner(Paths.get("src\\pokemons"), "*.java");
		fs.addToBlackList("src\\pokemons\\Natures.java");
		fs.addToBlackList("src\\pokemons\\Pokemon.java");
		fs.addToBlackList("src\\pokemons\\Types.java");
		fs.addToBlackList("src\\pokemons\\Weaknesses.java");
		int processors = Runtime.getRuntime().availableProcessors();
		ForkJoinPool pool = new ForkJoinPool(processors);
		long start = System.currentTimeMillis();
		pool.invoke(fs);
		System.out.println("There is/are " + fs.getResult() + " file(s) of type Pokemon\nTime spent: " + (System.currentTimeMillis() - start) + "ms");
		String[] s = new String[fs.getFilesList().size()];
		for (int i = 0; i < fs.getFilesList().size(); i++) {
			s[i] = (fs.getFilesList().get(i).getName().replaceAll(".java", ""));
		}
		Arrays.sort(s);
		for (int i = 0; i < fs.getFilesList().size(); i++) {
			comboBox_2.addItem(s[i]);
		}
		comboBox_2.setSelectedItem("Pokemon");

		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblNewLabel_1.setForeground(Color.BLACK);
				lblNewLabel_4.setForeground(Color.BLACK);
				lblNewLabel_5.setForeground(Color.BLACK);
				lblNewLabel_6.setForeground(Color.BLACK);
				lblNewLabel_7.setForeground(Color.BLACK);
				lblNewLabel_8.setForeground(Color.BLACK);
				lblNewLabel_9.setForeground(Color.BLACK);
				
				int answered = 0;
				// If all fields changed
				if (frmtdtxtfldTest.getText().equals(""))
					answered++;
				if (formattedTextField_2.getText().equals(""))
					answered++;
				if (formattedTextField.getText().equals(""))
					answered++;
				if (formattedTextField_3.getText().equals(""))
					answered++;
				if (formattedTextField_4.getText().equals(""))
					answered++;
				if (formattedTextField_5.getText().equals(""))
					answered++;
				if (formattedTextField_6.getText().equals(""))
					answered++;
				
				// If user filled all fields
				if (answered == 0) {
					
					System.out.println("\n------- All fields has been filled -------\n\nBeginning Pokemon file writing...");
					if (formattedTextField.getText() != "") {
						Add_Pokemon.generate(frmtdtxtfldTest.getText(), (Types)comboBox_1.getSelectedItem(), (Types)comboBox.getSelectedItem(), Integer.parseInt(formattedTextField_2.getText()), Integer.parseInt(formattedTextField.getText()), Integer.parseInt(formattedTextField_3.getText()), Integer.parseInt(formattedTextField_4.getText()), Integer.parseInt(formattedTextField_5.getText()), Integer.parseInt(formattedTextField_6.getText()), comboBox_2.getSelectedItem().toString());
					} else {
						Add_Pokemon.generate(frmtdtxtfldTest.getText(), (Types)comboBox_1.getSelectedItem(), null, Integer.parseInt(formattedTextField_2.getText()), Integer.parseInt(formattedTextField.getText()), Integer.parseInt(formattedTextField_3.getText()), Integer.parseInt(formattedTextField_4.getText()), Integer.parseInt(formattedTextField_5.getText()), Integer.parseInt(formattedTextField_6.getText()), comboBox_2.getSelectedItem().toString());
					}
					System.out.println("\n------- Pokemon file writing finished -------\n\nInitiate shutdown...");
					System.exit(0);
					
				} else {
					
					String[] memory = new String[7];
					memory[0] = frmtdtxtfldTest.getText();
					memory[1] = formattedTextField_2.getText();
					memory[2] = formattedTextField.getText();
					memory[3] = formattedTextField_3.getText();
					memory[4] = formattedTextField_4.getText();
					memory[5] = formattedTextField_5.getText();
					memory[6] = formattedTextField_6.getText();
					
					for (;answered > 0; answered--) {
						if (frmtdtxtfldTest.getText().equals("")) {
							lblNewLabel_1.setForeground(Color.RED);
							frmtdtxtfldTest.setText("Temp");
						} else if (formattedTextField_2.getText().equals("")) {
							lblNewLabel_4.setForeground(Color.RED);
							formattedTextField_2.setText("Temp");
						} else if (formattedTextField.getText().equals("")) {
							lblNewLabel_5.setForeground(Color.RED);
							formattedTextField.setText("Temp");
						} else if (formattedTextField_3.getText().equals("")) {
							lblNewLabel_6.setForeground(Color.RED);
							formattedTextField_3.setText("Temp");
						} else if (formattedTextField_4.getText().equals("")) {
							lblNewLabel_7.setForeground(Color.RED);
							formattedTextField_4.setText("Temp");
						} else if (formattedTextField_5.getText().equals("")) {
							lblNewLabel_8.setForeground(Color.RED);
							formattedTextField_5.setText("Temp");
						} else if (formattedTextField_6.getText().equals("")) {
							lblNewLabel_9.setForeground(Color.RED);
							formattedTextField_6.setText("Temp");
						}
					}
					
					frmtdtxtfldTest.setText(memory[0]);
					formattedTextField_2.setText(memory[1]);
					formattedTextField.setText(memory[2]);
					formattedTextField_3.setText(memory[3]);
					formattedTextField_4.setText(memory[4]);
					formattedTextField_5.setText(memory[5]);
					formattedTextField_6.setText(memory[6]);
					
				}
			}
		});

		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 1;
		gbc_comboBox_2.gridy = 10;
		frmAddNewPokemon.getContentPane().add(comboBox_2, gbc_comboBox_2);

		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.anchor = GridBagConstraints.NORTH;
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 11;
		frmAddNewPokemon.getContentPane().add(btnNewButton, gbc_btnNewButton);
	}

	public JFrame getFrame() {
		return frmAddNewPokemon;
	}

	public void setFrame(JFrame frame) {
		this.frmAddNewPokemon = frame;
		frmAddNewPokemon.setTitle("Add new Pokemon");
		frame.setResizable(false);
	}

}

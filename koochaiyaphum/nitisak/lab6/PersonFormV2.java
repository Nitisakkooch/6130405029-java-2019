package koochaiyaphum.nitisak.lab6;
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2
*/
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class PersonFormV2 extends PersonFormV1 {

	private static final long serialVersionUID = 1L;
	protected JComboBox typeCombo;
	protected JLabel sportsLabel;
	protected JTextArea reviewArea;
	protected JLabel reviewLabel;
	protected String[] sportsBox = { "Running", "Swimming", "Tennis" };
	protected JScrollPane scroll;

	protected PersonFormV2(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	
	protected void addComponents() {
		super.addComponent();
		
		reviewArea = new JTextArea(3, 35);
		typeCombo = new JComboBox(sportsBox);
		reviewLabel = new JLabel("Review:");
		sportsLabel = new JLabel("Sports:");
		reviewArea.setRows(2);
		JScrollPane scroll = new JScrollPane(reviewArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		reviewArea.setText("21st Century skills include Critical thinking, Creativity, Collaboration, Communication, etc.");
		reviewArea.setLineWrap(true);
		reviewArea.setWrapStyleWord(true);
		reviewArea.setAutoscrolls(true);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 5;
		buttonPanel.add(sportsLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 5;
		buttonPanel.add(typeCombo, gbc);
		gbc.gridx = 0;
		gbc.gridy = 7;
		buttonPanel.add(reviewLabel, gbc);
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 2;
		buttonPanel.add(scroll, gbc);

		
		allPanel.add(buttonPanel, BorderLayout.WEST);
		windowPanel.add(allPanel, BorderLayout.NORTH);
	}
	
	public static void createAndShowGUI() {
		PersonFormV2 PersonFormV2 = new PersonFormV2("PersonFormV2");
		PersonFormV2.addComponent();
		PersonFormV2.setFrameFeatures();
	}

	protected void setFrameFeatures() {
		 // this method will set main panel to show.
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}

		});
	}
}
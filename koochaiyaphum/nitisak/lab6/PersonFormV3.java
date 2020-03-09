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
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class PersonFormV3 extends PersonFormV2 {
    protected PersonFormV3(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	
	private static final long serialVersionUID = 1L;
	protected String[] featuresArray = { "Reading", "Traveling", "Cooking", "Photography" };
	protected JLabel featuresLabel;
	protected JList featuresList;
	protected JMenu fileMenu;
	protected JMenu configMenu;
	protected JMenuBar menuBar;
	protected JMenuItem newitem, openitem, saveitem, exititem, sizemenu, colormenu;



	protected void addComponents() {
		/*
		 * 
		 * this method will add a component to buttonPanel and add to mainPanel.
		 * @return nothing
		 * 
		 */
		super.addComponents();
		featuresLabel = new JLabel("Hobbies");
		featuresList = new JList(featuresArray);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 6;
		buttonPanel.add(featuresLabel, gbc);
		gbc.gridx = 1;
		gbc.gridy = 6;
		buttonPanel.add(featuresList, gbc);

		allPanel.add(buttonPanel, BorderLayout.WEST);
		windowPanel.add(allPanel, BorderLayout.NORTH);

	}

	protected void addMenus() {
		JMenuBar menuBar = new JMenuBar();
		
		setJMenuBar(menuBar);
		fileMenu = new JMenu("File");
		configMenu = new JMenu("Config");

		menuBar.add(fileMenu);
		menuBar.add(configMenu);
		newitem = new JMenuItem("New");
		openitem = new JMenuItem("Open");
		saveitem = new JMenuItem("Save");
		exititem = new JMenuItem("Exit");

		fileMenu.add(newitem);
		fileMenu.add(openitem);
		fileMenu.add(saveitem);
		fileMenu.add(exititem);
		colormenu = new JMenuItem("Color");
		sizemenu = new JMenuItem("Size");
		configMenu.add(colormenu);
		configMenu.add(sizemenu);
		
	}

	public static void createAndShowGUI() {
		PersonFormV3 PersonFormV3 = new PersonFormV3("PersonFormV3");
		PersonFormV3.addComponents();
		PersonFormV3.addMenus();
		PersonFormV3.setFrameFeatures();
		
	}

	protected void setFrameFeatures() {
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
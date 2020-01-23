
/*
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
This program java GUI name PersonFormV1  
ID : 613040502-9
*/
package koochaiyaphum.nitisak.lab6;
import javax.swing.*;

public class PersonFormV1 extends MySimpleWindow{
    protected JLabel name;
	protected JLabel height;
	protected JLabel weight;
	protected JLabel date;
    protected JLabel type;
    
	protected JTextField nameText;
	protected JTextField heightText;
	protected JTextField weightText;
	protected JTextField dateText;

	protected JRadioButton Student;
	protected JRadioButton Teacher;
	protected ButtonGroup buttonGroup;

	protected JPanel groupPanel;
	protected JPanel buttonPanel;
	protected JPanel allPanel;

    protected PersonFormV1(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }
    @Override
    protected  void addComponent() {
        super.addComponent();
        GridBagConstraints gbc = new GridBagConstraints();
        // set layout.
        gbc.insets = new Insets(5, 5, 5, 5);
        buttonPanel = new JPanel();
        name = new JLabel("Name: ");
        height = new JLabel("Height(cm.):");
        weight = new JLabel("Weight(kg): ");
        date = new JLabel("Date of birth (eg.,31-01-1990): ");
        type = new JLabel("Type:");

        nameText = new JTextField(15);
        heightText = new JTextField(15);
        weightText = new JTextField(15);
        dateText = new JTextField(15);
        
        gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		buttonPanel.add(brandname, gbc);
		gbc.gridy++;
		buttonPanel.add(modelName, gbc);
		gbc.gridy++;
		buttonPanel.add(weight, gbc);
		gbc.gridy++;
		buttonPanel.add(price, gbc);
		gbc.gridy++;
		buttonPanel.add(system, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		buttonPanel.add(brandText, gbc);

		gbc.gridy++;
		buttonPanel.add(modelText, gbc);

		gbc.gridy++;
		buttonPanel.add(weightText, gbc);

		gbc.gridy++;
		buttonPanel.add(priceText, gbc);

		buttonGroup = new ButtonGroup();
		groupPanel = new JPanel();
		iOS = new JRadioButton("IOS");
		android = new JRadioButton("Android");
		groupPanel.setLayout(new GridBagLayout());
		buttonGroup.add(iOS);
		buttonGroup.add(android);
		gbc.gridx = 1;
		gbc.gridy = 1;
		groupPanel.add(iOS, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		groupPanel.add(android, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		buttonPanel.add(groupPanel, gbc);

		allPanel = new JPanel();

		allPanel.add(buttonPanel, BorderLayout.WEST);
		windowPanel.add(allPanel, BorderLayout.NORTH);
       // buttonPanel.setLayout(new GroupLayout());

    }

    public static void createAndShowGUI() {
        PersonFormV1 personFormV1 = new PersonFormV1("Person From V1");
        personFormV1.addComponent();
        personFormV1.setFrameFeatures();
    }
    protected void setFrameFeatures() {
            this.setLocationRelativeTo(null);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            pack();
            setVisible(true);
        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
    
}
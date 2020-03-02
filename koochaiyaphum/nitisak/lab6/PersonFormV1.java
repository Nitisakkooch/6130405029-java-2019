
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2

*/
package koochaiyaphum.nitisak.lab6;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class PersonFormV1 extends MySimpleWindow{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
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

		buttonPanel.setLayout(new GridBagLayout());

        gbc.weightx = 0.5;
		gbc.weighty = 0.5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		buttonPanel.add(name, gbc);
		gbc.gridy++;
		buttonPanel.add(height, gbc);
		gbc.gridy++;
		buttonPanel.add(weight, gbc);
		gbc.gridy++;
		buttonPanel.add(date, gbc);
		gbc.gridy++;
		buttonPanel.add(type, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		buttonPanel.add(nameText, gbc);
		gbc.gridy++;
		buttonPanel.add(heightText, gbc);
		gbc.gridy++;
		buttonPanel.add(weightText, gbc);
		gbc.gridy++;
		buttonPanel.add(dateText, gbc);

		buttonGroup = new ButtonGroup();
		groupPanel = new JPanel();
		Student = new JRadioButton("Student");
		Teacher = new JRadioButton("Teacher");
		groupPanel.setLayout(new GridBagLayout());
		buttonGroup.add(Student);
		buttonGroup.add(Teacher);
		gbc.gridx = 1;
		gbc.gridy = 1;
		groupPanel.add(Student, gbc);
		gbc.gridx = 2;
		gbc.gridy = 1;
		groupPanel.add(Teacher, gbc);
		gbc.gridx = 1;
		gbc.gridy = 4;
		buttonPanel.add(groupPanel, gbc);

		allPanel = new JPanel();

		allPanel.add(buttonPanel, BorderLayout.WEST);
		windowPanel.add(allPanel, BorderLayout.NORTH);
		
    }

    public static void createAndShowGUI() {
        PersonFormV1 PersonFormV1 = new PersonFormV1("Person From V1");
        PersonFormV1.addComponent();
        PersonFormV1.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
    
}
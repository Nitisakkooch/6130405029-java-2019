package koochaiyaphum.nitisak.lab10.lab6;
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2

*/

import java.awt.BorderLayout;
import java.awt.GridLayout;
 
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
 
 
public class PersonFormV1 extends MySimpleWindow {
    /**
     * 
     */
    private static final long serialVersionUID = -3629832942393810272L;
    protected JLabel nameLabel, heightLabel, weightLabel, dobLabel, typeLabel;
    protected JTextField nameTxtField, heightTxtField, weightTxtField, 
            dobTxtField;
    protected JPanel namePanel, heightPanel, weightPanel, dobPanel, typePanel;
    protected JPanel overallPanel, textsPanel, typeChoicesPanel;
    protected JRadioButton student, teacher;
    protected ButtonGroup typeNames;
    public final static int TXTFIELD_WIDTH = 15;
     
    public PersonFormV1(String title) {
        super(title);
    }
     
    protected void initComponents() {
        namePanel = new JPanel(new GridLayout(1,2));
        heightPanel = new JPanel(new GridLayout(1,2));
        weightPanel = new JPanel(new GridLayout(1,2));
        dobPanel = new JPanel(new GridLayout(1,2));
        typePanel = new JPanel(new GridLayout(1,2));
        typeChoicesPanel = new JPanel();
        nameLabel = new JLabel("Name:");
        nameTxtField = new JTextField(TXTFIELD_WIDTH);
        heightLabel = new JLabel("Height (cm.):");
        heightTxtField = new JTextField(TXTFIELD_WIDTH);
        weightLabel = new JLabel("Weight (kg.):");
        weightTxtField = new JTextField(TXTFIELD_WIDTH);
        dobLabel = new JLabel("Date of birth (eg.,31-01-1990):");
        dobTxtField = new JTextField(TXTFIELD_WIDTH);
        typeLabel = new JLabel("Type:");
        student = new JRadioButton("Student");
        teacher = new JRadioButton("Teacher");
        typeNames = new ButtonGroup();
        typeNames.add(student);
        typeNames.add(teacher);
        textsPanel = new JPanel(new GridLayout(5,1));
        overallPanel = new JPanel(new BorderLayout());
    }
    protected void setLabelTxtField(JPanel panel,
        JLabel label, JTextField txtField) {
        panel.add(label);
        panel.add(txtField);
    }
    protected void addComponents() {
        super.addComponents();
        initComponents();
        setLabelTxtField(namePanel, nameLabel, nameTxtField);
        setLabelTxtField(heightPanel, heightLabel, heightTxtField);
        setLabelTxtField(weightPanel, weightLabel, weightTxtField);
        setLabelTxtField(dobPanel, dobLabel, dobTxtField);
        typePanel.add(typeLabel);
        typeChoicesPanel.add(student);
        typeChoicesPanel.add(teacher);
        typePanel.add(typeLabel);
        typePanel.add(typeChoicesPanel);
        textsPanel.add(namePanel);
        textsPanel.add(heightPanel);
        textsPanel.add(weightPanel);
        textsPanel.add(dobPanel);
        textsPanel.add(typePanel);
        overallPanel.add(textsPanel, BorderLayout.NORTH);
        overallPanel.add(buttonsPanel, BorderLayout.SOUTH);
        setContentPane(overallPanel);
    }
     
    public static void createAndShowGUI(){
        PersonFormV1 PersonFormV1
            = new PersonFormV1("Person Form V1");
        PersonFormV1.addComponents();
        PersonFormV1.setFrameFeatures();
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
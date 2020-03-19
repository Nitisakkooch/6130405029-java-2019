package koochaiyaphum.nitisak.lab8;
import javax.swing.SwingUtilities;

import java.awt.event.*;
import javax.swing.*;
/**
 * PersonFormV7
 */
public class PersonFormV7 extends PersonFormV6 implements ActionListener {
 
    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    public PersonFormV7(String string) {
        super(string);
        // TODO Auto-generated constructor stub
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
    public static void createAndShowGUI() {
        PersonFormV7 msw = new PersonFormV7("Person Form V7");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
 
    @Override
    protected void addListeners() {
        super.addListeners();
        Student.addActionListener(this);
        Teacher.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();
        if (source == Student) {
            JOptionPane.showMessageDialog(this,
                    "Type : student has been selected",
                    "Person Information",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (source == Teacher) {
            JOptionPane.showMessageDialog(this,
                    "Type : teacher has been selected",
                    "Person Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
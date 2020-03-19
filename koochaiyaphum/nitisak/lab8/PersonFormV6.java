package koochaiyaphum.nitisak.lab8;

import  koochaiyaphum.nitisak.lab6.*; 
import javax.swing.*; 

import java.awt.event.*;
/**
 * PersonFromV6
 */

public class PersonFormV6 extends PersonFormV5 implements ActionListener {
 
    public PersonFormV6(String string) {
        super(string);
    }
 
    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
 
    public static void createAndShowGUI() {
        PersonFormV6 msw = new PersonFormV6("Person Form V6");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
    }
 
    protected void addListeners() {
        buttonOk.addActionListener(this);
        buttoncancel.addActionListener(this);
    }
 
    protected String getInfoFromForm() {
        String info;
        info = "Name : " + nameText.getText() + "\n" +
                "Height (cm) : " + heightText.getText() + "\n" +
                "Weight (kg) : " + weightText.getText() + "\n" +
                "Date of Birth : " + dateText.getText() + "\n";
        if (Student.isSelected())
            info += "Type : Student" + "\n";
        else
            info += "Type : Teacher" + "\n";
 
        info += "Sports : " + typeCombo.getSelectedItem().toString() + "\n";
 
        info += "Hobbies :";
        if (featuresList.isSelectedIndex(0))
            info += " Reading";
        if (featuresList.isSelectedIndex(1))
            info += " Traveling";
        if (featuresList.isSelectedIndex(2))
            info += " Cooking";
        if (featuresList.isSelectedIndex(3))
            info += " Photography";
        info += "\n";
        info += "Note : " + reviewArea.getText();
        return info;
    }

    protected void handleOkButton() {
        String info = getInfoFromForm();
        JOptionPane.showMessageDialog(this,
                info,
                "Person Information",
                JOptionPane.INFORMATION_MESSAGE);
    }

    protected void handleCancelButton() {
        nameText.setText("");
        heightText.setText("");
        weightText.setText("");
        dateText.setText("");
        reviewArea.setText("");
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JDialog dialog = new JDialog();
        dialog.setTitle("Person Information");
        if (source == buttonOk) {
            handleOkButton();
        } else if (source == buttoncancel) {
            handleCancelButton();
        }
    }
}
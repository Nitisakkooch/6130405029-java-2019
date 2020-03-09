package koochaiyaphum.nitisak.lab10.lab10;

import koochaiyaphum.nitisak.lab10.lab8.PersonFormV10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * PersonFormV11
 */
public class PersonFormV11 extends PersonFormV10{
    protected JMenuItem customItem;
    private static final long serialVersionUID = 1L;

    public PersonFormV11(String string) {
        super(string);
        // TODO Auto-generated constructor stub
    }

    protected void addSubMenus() {
       super.addSubMenus();
       customItem = new JMenuItem("Custom");
       colorMenu.add(customItem);
    }

    @Override
    protected void addListeners() {
        super.addListeners();    
        customItem.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        String command = e.getActionCommand();

        if (command.equals("Custom")) {
            Color c = JColorChooser.showDialog(this, "Choose a Color",nameTxtField.getForeground()); 
            if (c != null) nameTxtField.setForeground(c);
            heightTxtField.setForeground(c); 
            weightTxtField.setForeground(c);
            dobTxtField.setForeground(c); 
            reviewTxtArea.setForeground(c);
        }
    } 
    public static void createAndShowGUI() {
        PersonFormV11 msw = new PersonFormV11("Person Form V11");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.setFrameFeatures();
        msw.addKeys();
    }
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });
        }

}
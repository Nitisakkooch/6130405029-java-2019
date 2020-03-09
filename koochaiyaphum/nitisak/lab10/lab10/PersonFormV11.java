package koochaiyaphum.nitisak.lab10.lab10;

import koochaiyaphum.nitisak.lab10.lab8.PersonFormV10;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFileChooser;
import java.io.File;
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
        openMI.addActionListener(this);
        saveMI.addActionListener(this);
        exitMI.addActionListener(this);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        String command = e.getActionCommand();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        if (command.equals("Custom")) {
            Color c = JColorChooser.showDialog(this, "Choose a Color",nameTxtField.getForeground()); 
            if (c != null) nameTxtField.setForeground(c);
            heightTxtField.setForeground(c); 
            weightTxtField.setForeground(c);
            dobTxtField.setForeground(c); 
            reviewTxtArea.setForeground(c);
        }

        if (command.equals("Open")) {  //open file chooser after click on Open menu.
            final JFileChooser openChooser = new JFileChooser();
        openChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = openChooser.showOpenDialog(PersonFormV11.this);
        if (result == JFileChooser.APPROVE_OPTION) { //if user select a file.
            File selectedFile = openChooser.getSelectedFile();
            JOptionPane.showMessageDialog(openChooser,
                    "Opening file " + selectedFile.getName());
        }
        else { //if user do nothing.
            JOptionPane.showMessageDialog(openChooser,
                    "Open command cancelled by user.");
        }
        }
        if (command.equals("Save")) {  //open save file chooser after click on Save menu.
            final JFileChooser saveChooser = new JFileChooser();
            saveChooser.setDialogTitle("Save");
            int result = saveChooser.showSaveDialog(PersonFormV11.this);
            if (result == JFileChooser.APPROVE_OPTION) {  //if user select file to save.
                File selectedFile = saveChooser.getSelectedFile();
                JOptionPane.showMessageDialog(saveChooser,
                        "Saving file " + selectedFile.getName());
            }
            else {  //if user do not select.
                JOptionPane.showMessageDialog(saveChooser, "Save command cancelled by user.");
            }
        }
        //select Exit.
        if (command.equals("Exit")) {
            System.exit(0); //exit program.
        }

       // File selectedFile = fileChooser.getSelectedFile();

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
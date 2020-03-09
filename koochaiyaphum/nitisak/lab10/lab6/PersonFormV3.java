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
 
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
 
public class PersonFormV3 extends PersonFormV2 {
    /**
     * 
     */
    private static final long serialVersionUID = 3694909354550437224L;
 
    protected JList<String> hobbies;
    protected String[] hobbiesValues = {
            "Reading", 
            "Traveling", "Cooking", "Photography"
                };
    protected JMenuBar menuBar;
    protected JMenu fileMenu, configMenu;
    protected JMenuItem newMI, openMI, saveMI, exitMI, colorMI, sizeMI;
    protected int NUM_VISIBLE_ROWS = 2;
    protected JPanel hobbiesPanel, comboListPanel;
    protected JLabel hobbiesLabel;
     
    public PersonFormV3(String title) {
        super(title);
    }
     
    protected void initComponents() {
        super.initComponents();
        hobbies = new JList<String>(hobbiesValues);
        hobbies.setVisibleRowCount(NUM_VISIBLE_ROWS);
        hobbiesLabel = new JLabel("Hobbies:");
        hobbiesPanel = new JPanel(new GridLayout(1,2));
        comboListPanel = new JPanel(new GridLayout(2,1));
    }
     
    protected void addComponents() {
        super.addComponents();
        hobbiesPanel.add(hobbiesLabel);
        hobbiesPanel.add(hobbies);
        contentPanel.remove(typePanel);
        comboListPanel.add(typePanel);
        comboListPanel.add(hobbiesPanel);
        contentPanel.add(comboListPanel, BorderLayout.CENTER);  
    }
    protected void addMenus() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        configMenu = new JMenu("Config");
        newMI = new JMenuItem("New");
        openMI = new JMenuItem("Open");
        saveMI = new JMenuItem("Save");
        exitMI = new JMenuItem("Exit");
        colorMI = new JMenuItem("Color");
        sizeMI = new JMenuItem("Size");
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(saveMI);
        fileMenu.add(exitMI);
        configMenu.add(colorMI);
        configMenu.add(sizeMI);
        menuBar.add(fileMenu);
        menuBar.add(configMenu);
        setJMenuBar(menuBar);
    }
 
    public static void createAndShowGUI(){
        PersonFormV3 personForm3 = 
                new PersonFormV3("Person Form V3");
        personForm3.addComponents();
        personForm3.addMenus(); 
        personForm3.setFrameFeatures();
    }
     
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
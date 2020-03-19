package koochaiyaphum.nitisak.lab8;

import javax.swing.SwingUtilities;

 
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 
 

/**
 * PersonFormV10
 */
public class PersonFormV10 extends PersonFormV9 {

  /**
     *
     */
    private static final long serialVersionUID = 1L;
 
 
    public PersonFormV10(String string) {
        super(string);
 
    }
 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }
 
    public static void createAndShowGUI() {
        PersonFormV10 msw = new PersonFormV10("Person Form V10");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        msw.addKeys();
        msw.setFrameFeatures();
    }
 
    protected void addKeys() {
        red.setMnemonic(KeyEvent.VK_R);
        green.setMnemonic(KeyEvent.VK_G);
        blue.setMnemonic(KeyEvent.VK_B);
        configMenu.setMnemonic(KeyEvent.VK_C);
        colorMenu.setMnemonic(KeyEvent.VK_L);
        sizeMenu.setMnemonic(KeyEvent.VK_Z);
        size16.setMnemonic(KeyEvent.VK_1);
        size20.setMnemonic(KeyEvent.VK_0);
        size24.setMnemonic(KeyEvent.VK_4);
 
        red.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        green.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
        blue.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
        size16.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        size20.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0, ActionEvent.CTRL_MASK));
        size24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.CTRL_MASK));
    
 
    }
 
    @Override
    protected void addListeners() {
        super.addListeners();
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        size16.addActionListener(this);
        size20.addActionListener(this);
        size24.addActionListener(this);
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();
        if(source == red){
            changeColor(Color.RED);
        } else if(source == green){
            changeColor(Color.GREEN);
        } else if(source == blue){
            changeColor(Color.BLUE);
        } else if(source == size16){
            changeSize(16);
        } else if(source == size20){
            changeSize(20);
        } else if(source == size24){
            changeSize(24);
        }
    }
 
    protected void changeColor(Color c){
        nameText.setForeground(c);
        heightText.setForeground(c);
        weightText.setForeground(c);
        dateText.setForeground(c);
        reviewArea.setForeground(c);
    }
 
    protected void changeSize(int size){
        Font label = new Font("Serif", Font.PLAIN, size);
        Font text = new Font("Serif", Font.BOLD, size);
        nameText.setFont(text);
        heightText.setFont(text);
        weightText.setFont(text);
        dateText.setFont(text);
        reviewArea.setFont(text);
    }
}
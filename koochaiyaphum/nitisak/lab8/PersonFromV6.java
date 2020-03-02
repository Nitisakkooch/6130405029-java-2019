package koochaiyaphum.nitisak.lab8;

import  koochaiyaphum.nitisak.lab6.*; 
import java.awt.*; 
import javax.swing.*; 

/**
 * PersonFromV6
 */
public class PersonFromV6 extends PersonFromV5 implements ActionListener {

    private static final long serialVersionUID = 1L;

    protected PersonFromV6(String title) {
        super(title);
        super.addComponents();
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
        PersonFromV5 msw = new PersonFromV6("PersonFromV6");
        msw.addComponents();
        msw.addMenus();
        msw.addListeners();
        PersonFromV5.setFrameFeatures();
    }

}
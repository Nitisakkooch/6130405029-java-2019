package koochaiyaphum.nitisak.lab6;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.*;

public class MySimpleWindow extends JFrame {
    protected static JButton buttonOk;
    protected static JButton buttoncancel;
    protected static JPanel buttonAll;
    protected JPanel windowPanel;

    protected MySimpleWindow(String title) {
        super(title);
    }

    protected  void addComponent() {
        buttoncancel = new JButton("Cancel");
        buttonOk = new JButton("OK");

        buttonAll = new JPanel();
        buttonAll.add(buttoncancel);
        buttonAll.add(buttonOk);

        //windowPanel = new JPanel();
        //windowPanel = this.getContentPane();
       add(buttonAll, BorderLayout.SOUTH);
    }

    protected void setFrameFeatures(){
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    public static void createAndShowGUI(){
        MySimpleWindow msw = new  MySimpleWindow("MySimplewindow");
        msw.addComponent();
        msw.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}

		});
    }
}
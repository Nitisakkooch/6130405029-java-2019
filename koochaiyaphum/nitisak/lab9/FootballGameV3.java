package koochaiyaphum.nitisak.lab9;

/**
 * FootballGameV3
 */
import java.awt.event.*;

import javax.swing.SwingUtilities;

public class FootballGameV3 extends FootballGameV2{
    private static final long serialVersionUID = 1L;

    protected FootballGameV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    protected void initComponents() {
        super.initComponents();
        this.canvasDrawerFBG = new CanvasDrawerV5();
    }

    protected void addListeners() {
        super.addListeners();
        reset_button.addActionListener(this);
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        
        Object object = e.getSource();

        if (object == reset_button) {
            resetScore();
            ((CanvasDrawerV5) canvasDrawerFBG).resetBall();
        }
    }
    
    protected void resetScore() {
        khonkaen_field.setText("0");
        udon_field.setText("0");
    }
    
    public static void createAndShowGUI() {
        FootballGameV3 footballV3 = new FootballGameV3("Football Game V3");
        footballV3.initComponents();
        footballV3.addListeners();
        footballV3.addComponents();
        footballV3.setFrameFeatures();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
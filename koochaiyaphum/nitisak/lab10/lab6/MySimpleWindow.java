package koochaiyaphum.nitisak.lab10.lab6;
/*
This program java GUI name PersonFormV1 
Author by :Nitisak Koochaiyaphum
date : 23/01/2020
ID : 613040502-9
sec: 2
*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
 
public class MySimpleWindow extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = -6029172243670358973L;
     
    protected JButton cancelButton, okButton;
    protected JPanel buttonsPanel;
     
    public MySimpleWindow(String title) {
        super(title);
    }
     
    protected void addComponents() {
        cancelButton = new JButton("Cancel");
        okButton = new JButton("OK");
        buttonsPanel = new JPanel();
        buttonsPanel.add(cancelButton);
        buttonsPanel.add(okButton);
        this.setContentPane(buttonsPanel);
    }
     
    protected void setFrameFeatures() {
        pack();
        setLocationRelativeTo(null);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
         
    }
      
    public static void createAndShowGUI(){
        MySimpleWindow msw = new MySimpleWindow("My Simple Window");
        msw.addComponents();
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
package koochaiyaphum.nitisak.lab6;
/*
*
*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class MySimpleWindow extends JFrame {

    private static final long serialVersionUID = 1L;
    protected static JButton buttonOk;
    protected static JButton buttoncancel;
    protected static JPanel buttonAll;
    protected JPanel windowPanel;


    public MySimpleWindow(String string) {
    }

    protected void addComponent() {
        buttoncancel = new JButton("Cancel");
        buttonOk = new JButton("OK");

        buttonAll = new JPanel();
        buttonAll.add(buttoncancel);
        buttonAll.add(buttonOk);

        windowPanel = (JPanel) this.getContentPane();
		windowPanel.setLayout(new BorderLayout());
		windowPanel.add(buttonAll, BorderLayout.SOUTH);
			
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
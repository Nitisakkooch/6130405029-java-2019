package  koochaiyaphum.nitisak.lab7; 

import  koochaiyaphum.nitisak.lab6.*; 
import java.awt.*; 
import javax.swing.*; 

public class GraphicsMoverV1 extends MySimpleWindow {

      private static final long serialVersionUID = 1L;
      protected CanvasDrawerV1 toppanel;
      protected JPanel bottompanel, windowPane;
      protected JButton mUp, mDown, mLeft, mRight, reset;
    
    public GraphicsMoverV1(String title) {
        super(title);
        
    }
    @Override
    public void addComponent(){
        super.addComponent();
        windowPane = new JPanel();
        toppanel = new CanvasDrawerV1();
        bottompanel = new JPanel();
        mUp = new JButton("Move up");
        mDown = new JButton("Move down");
        mLeft = new JButton("Move left");
        mRight = new JButton("Move Right");
        reset = new JButton("Reset");
        windowPane.setLayout(new BorderLayout());
        windowPane.add(toppanel, BorderLayout.CENTER);
        bottompanel.setLayout(new FlowLayout());
        bottompanel.add(mUp);
        bottompanel.add(mDown);
        bottompanel.add(mLeft);
        bottompanel.add(mRight);
        bottompanel.add(reset);
        windowPane.add(bottompanel, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(800, 600));
        add(windowPane);
    }

    public void setFrameFeatures() {
        pack();
        setPreferredSize(new Dimension(800, 550));
        this.setLocationRelativeTo(null);
		    setVisible(true);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void createAndShowGUI() {
        GraphicsMoverV1 graphicsmoverv1 = new GraphicsMoverV1("Graphics Mover Version 1"); 
        graphicsmoverv1.addComponent(); 
        graphicsmoverv1.setFrameFeatures(); 
    }
  public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          createAndShowGUI(); 
        }
      });
      }
}

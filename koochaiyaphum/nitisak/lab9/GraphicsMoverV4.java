package koochaiyaphum.nitisak.lab9;


import koochaiyaphum.nitisak.lab7.*;
import java.awt.*; 
import javax.swing.*; 

/**
 * GraphicsMoverV4
 */
public class GraphicsMoverV4 extends GraphicsMoverV3{


    /**
   *
   */
  private static final long serialVersionUID = 1L;
  protected CanvasDrawerV2 canvasDrawerV2; 
  public GraphicsMoverV4(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    public void addComponent(){
        super.addComponent();
        windowPane = new JPanel();
        toppanel = new CanvasDrawerV1();
        bottompanel = new JPanel();
        mUp = new JButton("Move Left Up");
        mDown = new JButton("Move Left Down");
        mLeft = new JButton("Move Right Up");
        mRight = new JButton("Move RIght Down");
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
        GraphicsMoverV4 graphicsmoverv4 = new GraphicsMoverV4("Graphics Mover Version 4"); 
          graphicsmoverv4.addComponent(); 
          graphicsmoverv4.setFrameFeatures(); 
          graphicsmoverv4.initComponents();
      }
    
      private void initComponents() {

      }

      public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            createAndShowGUI(); 
          }
        });
        }
}
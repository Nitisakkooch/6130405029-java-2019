package  koochaiyaphum.nitisak.lab7;

import java.awt.*;

import javax.swing.*;

public class GraphicsMoverV3 extends GraphicsMoverV2{
    
   
    protected JMenuBar menuBar;
    protected JMenu file;
    protected JMenuItem save, open, quit;
    protected ImageIcon iconOpen;

    public GraphicsMoverV3(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    public static void createAndShowGUI() {
        GraphicsMoverV3 graphicsmoverv3 = new GraphicsMoverV3("Graphics Mover Version 3"); //Title of this program.
          graphicsmoverv3.addComponent(); 
          graphicsmoverv3.setFrameFeatures(); 
      }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
  
    @Override
    public void addComponent(){
        super.addComponent();
        menuBar = new JMenuBar();
        iconOpen = new ImageIcon(getClass().getResource("open_new.png"));
        file = new JMenu("File");
        open = new JMenuItem("Open", iconOpen);
        save = new JMenuItem("Save");
        quit = new JMenuItem("Quit");
        file.add(open);
        file.add(save);
        file.add(quit);
        menuBar.add(file);
        setJMenuBar(menuBar);
      }
  
      public void setFrameFeatures() {
          pack();
          this.setLocationRelativeTo(null);
          setVisible(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}

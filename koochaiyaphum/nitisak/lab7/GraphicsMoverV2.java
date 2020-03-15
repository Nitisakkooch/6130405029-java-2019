package  koochaiyaphum.nitisak.lab7;
import java.awt.*;
import javax.swing.*;

public class GraphicsMoverV2 extends GraphicsMoverV1 {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected JPanel scorePanel;
    protected JLabel khonkaen, udonThani;
    protected JTextField khonkaenScore, udonThaniScore;

    public GraphicsMoverV2(String title) {
        super(title);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void addComponent(){
        super.addComponent();
        scorePanel = new JPanel();
        Font font = new Font("Serif", Font.BOLD, 20);
        setFont(font);
        khonkaen = new JLabel("KhonKaen");
        khonkaen.setFont(font);
        khonkaen.setForeground(Color.BLUE);
        udonThani = new JLabel("Udon Thani");
        udonThani.setFont(font);
        udonThani.setForeground(Color.RED);
        khonkaenScore = new JTextField("3");
        khonkaenScore.setFont(font);
        udonThaniScore = new JTextField("1");
        udonThaniScore.setFont(font);
        scorePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        scorePanel.add(khonkaen);
        scorePanel.add(khonkaenScore);
        scorePanel.add(udonThani);
        scorePanel.add(udonThaniScore);
        windowPane.add(scorePanel, BorderLayout.NORTH);
        add(windowPane);
        setPreferredSize(new Dimension(800, 600));
      }
  
      public void setFrameFeatures() {
          pack();
          this.setLocationRelativeTo(null);
          setVisible(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

         public static void createAndShowGUI() {
        GraphicsMoverV2 graphicsmoverv2 = new GraphicsMoverV2("Graphics Mover Version 2"); //Title of this program.
          graphicsmoverv2.addComponent(); 
          graphicsmoverv2.setFrameFeatures(); 
      }
      public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

package  koochaiyaphum.nitisak.lab7;

import javax.swing.JPanel;
import java.awt.*;

public class CanvasDrawerV1 extends JPanel {
    
    private static final long serialVersionUID = 1L;
    int CANVAS_WIDTH = 800;
    int CANVAS_HEIGHT = 500;
    Color CANVAS_BACKGROUND = Color.green;
    int LINE_WIDTH = 4;
    int DOT_CIRCLE_RADIUS = 5;
    int CIRCLE_RADIUS = 50;

    public CanvasDrawerV1(){
        setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
        setBackground(CANVAS_BACKGROUND);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(LINE_WIDTH));
        g2d.setColor(Color.BLACK);
        g2d.drawLine(400, 0, 400, 500);
        g2d.drawRect(0, 150, 60, 200);
        g2d.drawRect(0, 80, 150, 340);
        g2d.fillOval(105, 250, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS);
        g2d.drawRect(740, 150, 60, 200);
        g2d.drawRect(650, 80, 150, 340);
        g2d.fillOval(695, 250, DOT_CIRCLE_RADIUS, DOT_CIRCLE_RADIUS);
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawOval(350, 200, CIRCLE_RADIUS *2, CIRCLE_RADIUS *2);
    }
}

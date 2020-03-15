package koochaiyaphum.nitisak.lab9;

/**
 * Ball
 */
import java.awt.geom.Ellipse2D;

public class Ball extends Ellipse2D.Double{

    private static final long serialVersionUID = 1L;

    public final static int BALL_DIAMETER  = 30;
    private int xVelocity;
    private int yVelocity;

    public Ball(int x,int y) {
        super(x, y ,BALL_DIAMETER ,BALL_DIAMETER );
        xVelocity = 0;
        yVelocity = 0;
		
    }

    public Ball(int x,int y,int xVelocity ,int yVelocity){
        super(x, y ,xVelocity ,yVelocity);
        
    }

    public static int getBallDiameter() {
        return BALL_DIAMETER;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
    public void move(){
        x += xVelocity;
        y += yVelocity;
    }
}
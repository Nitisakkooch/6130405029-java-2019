package koochaiyaphum.nitisak.lab9;

/**
 * Keeper
 */
import java.awt.geom.Ellipse2D;
public class Keeper extends Ellipse2D.Double{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public final static int KEEPER_WIDTH = 20;
    public final static int KEEPER_HEIGHT = 50;
    public final static int  KEEPER_SPEED = 10;

    Keeper(int x, int y) {
        super(x , y, KEEPER_WIDTH, KEEPER_HEIGHT);
    }    

    public void moveUp(){
        if (y - KEEPER_SPEED >= 150)  {
            y = y - KEEPER_SPEED;
        }
    }

    public void MovDown() {
        if (y + KEEPER_HEIGHT + KEEPER_SPEED <= 350)  {
            y = y + KEEPER_SPEED;
        }
    } 

}
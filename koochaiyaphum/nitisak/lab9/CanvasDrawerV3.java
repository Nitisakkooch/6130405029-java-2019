package koochaiyaphum.nitisak.lab9;

/**
 * CanvasDrawerV3
 */
import java.util.Random;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    protected Thread running;
    protected Random random_x, random_y;
    protected int maxVal = 2, minVal = -2;

    public CanvasDrawerV3() {
        super();
        running = new Thread();
        random_x = new Random();
        random_y = new Random();

        int xv = random_x.nextInt(maxVal - minVal + 1) + minVal;
        int yv = random_y.nextInt(maxVal - minVal + 1) + minVal;

        if (xv == 0 ) xv += 1 ;
        else if (yv == 0) yv += 1 ;

        this.ball.setxVelocity(-2);
        this.ball.setyVelocity(0);

        running.start();
    }

    @Override
    public void run() {
        while(true) {
            if (isHitVerticalWall()) {
               if (isNotHitGoal()) {
                changeXVelocity();
               }
            } 
            else if (isHitHorizontalWall()) {
               changeYVelocity();
            }

            ball.move();

            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

    protected boolean isHitVerticalWall() {
        return ball.getX() <= 0 ||  ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH;
    }
    protected boolean isHitHorizontalWall() {
        return ball.getY() <= 0 || ball.getY() + Ball.BALL_DIAMETER >= CANVAS_HEIGHT;
    }
    protected boolean isNotHitGoal() {
        return ball.getY() + Ball.BALL_DIAMETER <= 150 || ball.getY() + Ball.BALL_DIAMETER >= 350;
    }

    protected void changeXVelocity() {
        int xVelocity = this.ball.getxVelocity();
        this.ball.setxVelocity(xVelocity * -1);
    }

    protected void changeYVelocity() {
        int yVelocity = this.ball.getyVelocity();
        this.ball.setyVelocity(yVelocity * -1);
    }
    
    
}
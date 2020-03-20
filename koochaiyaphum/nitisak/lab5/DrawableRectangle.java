package koochaiyaphum.nitisak.lab5;

/**
 * DrawableRegtangle
 */

public class DrawableRectangle extends Rectangle implements Drawable, Moveable{

	private double x;
    private double y;

    DrawableRectangle() {
        super();
        x = 0.0;
        y = 0.0;
    }
    DrawableRectangle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    DrawableRectangle(double x, double y, double width, double length, String color, boolean filled) {
        super(width, length, color, filled); 
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp(int val) {
        // TODO Auto-generated method stub
        this.y += val;
    }

    @Override
    public void moveDown(int val) {
        // TODO Auto-generated method stub
        this.y -= val;
    }

    @Override
    public void moveRight(int val) {
        // TODO Auto-generated method stub
        this.y += val;
    }

    @Override
    public void moveLeft(int val) {
        // TODO Auto-generated method stub
        this.y -= val;
    }

    @Override
    public String draw() {
        // TODO Auto-generated method stub
        return "draw a rectangle with top left cornor at (" + x + "," + y + ") with width=" + Width + " length=" + Length;
    }

}
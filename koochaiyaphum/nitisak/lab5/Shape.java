 /*
 */
package koochaiyaphum.nitisak.lab5;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    
    public Shape() {
        this.color = "White";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

	public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled() {
            return filled;
        }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color:White " + color + ", Filled:" + filled ;
    }

    
}
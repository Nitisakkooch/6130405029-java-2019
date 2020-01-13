package koochaiyaphum.nitisak.lab5;
import java.math.BigDecimal;

public  class Circle extends Shape{
    protected double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

	public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
	}

	@Override
    public double getArea() {
        // TODO Auto-generated method stub
        BigDecimal area = new BigDecimal(Math.PI*radius*radius);
        area = area.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        double area1 = area.doubleValue();
        return area1;

    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        BigDecimal perimeter = new BigDecimal(2*radius*Math.PI);
        perimeter = perimeter.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        double perimeter1 = perimeter.doubleValue();
        return perimeter1;
    }

	public boolean isFilled() {
		return this.filled;
	}

    @Override
    public String toString() {
        
         return super.toString()  +", radius:" + radius ;
    }
    
}
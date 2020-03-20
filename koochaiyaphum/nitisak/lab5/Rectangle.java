package koochaiyaphum.nitisak.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape{

	protected String name;
    protected double Length;
	protected double Width;

	public Rectangle() {
		this.Width = 1.0;
        this.Length = 2.0;
	}
	public Rectangle(double Length, double Widht) {
        this.Length = Length;
    }
    public Rectangle(double Length, double Widht, String color, boolean filled) {
		super(color,filled); 
        this.Length = Length;
	}
	public Double getWidth() {
		return Width;
	}
	public void setWidth(double getWidth) {
		
	}
	public Double getLength() {
		return Length;
	}
	public  void setLength(double getLength) {

	}
	public double getArea() {
		double A = Length*Width;
		BigDecimal area = new BigDecimal(A).setScale(2, RoundingMode.HALF_UP);
		return area.doubleValue();

	}
	public double getPerimeter() {
		double perimeter = (Width*2) + (Length*2);
        BigDecimal perimeter2 = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);
        return perimeter2.doubleValue();
	}


}
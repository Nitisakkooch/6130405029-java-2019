package koochaiyaphum.nitisak.lab5;

import java.math.BigDecimal;

public class Rectangle {

	protected String name;
    protected double Length;
	protected double Widht;
	public Rectangle() {
		super();
	}
	public Rectangle(double d, double e) {
    }
    public Rectangle(double d, double e, String string, boolean b) {
	}
	public Double getWidth() {
		return null;
	}
	public void setWigth(double getWidth) {
		return;
	}
	public Double getLength() {
		return null;
	}
	public  Object setLength(double getLength) {
		return null;
	}
	public Double getArea() {
		double A = Length*Widht; 
		BigDecimal area = new BigDecimal(Length*Widht);
		area = area.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		double area1 = area.doubleValue();
		return area1;
	}
	public String getPerimeter() {
		return null;
	}
	
    
}
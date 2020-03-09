package koochaiyaphum.nitisak.lab10.lab10;

import java.time.LocalDate;

/**
 * Person
 */
public class Person {
    protected String name;
    protected double weight;
    protected double height;
    protected LocalDate dob;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

    @Override
    public String toString() {
        return "Adding this person into the list:" + name + " is" + dob + ", has weight as " + weight + " kg., and height as " + height + " cm.";
    }

    
}
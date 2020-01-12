package koochaiyaphum.nitisak.lab4;

public class Student {
    protected String major; //created variable name major with String type.
    protected double GPA; //created variable name GPA with double type.

	public Student(String name, double height, double weight, String dob, String major, double GPA) { //method receive 4 variables form PersonV2, major, and GPA.
		super(name, height, weight, dob); //using super to call constructor from PersonV2.
    }
    public String getMajor() { //getter for major variable.
        return major; //return major value.
    }
    public void setMajor(String major) { //setter for major variable.
        this.major = major; //set value to major variable.
    }
    public double getGPA() { //getter for GPA variable.
        return GPA; //return GPA value.
    }
    public void setGPA() { //setter for GPA.
        this.GPA = GPA; //set value to GPA variable.
    }
    public String toString(){ //method to show output to user.
        return "name="+ name + ", height="+ height + " cm, weight="+ weight + "kg. , Birthday=" + dob + ", major=" + major + ", GPA=" + GPA; //showing name and information about "name" to user.
    }
}

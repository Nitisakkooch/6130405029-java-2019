/**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/
package koochaiyaphum.nitisak.lab4;
public class Student extends PersonV2{
    
    protected String major;
    protected double GPA; 

	public Student(String name, double height, double weight, String dob, String major, double GPA) { 
        super(name, height, weight, dob); 
    }
    public String getMajor() { 
        return major; 
    }
    public void setMajor(String major) { 
        this.major = major; 
    }
    public double getGPA() {
        return GPA; 
    }
    public void setGPA() { 
        this.GPA = GPA; 
    }
    public String toString(){ 
        return "name=" + name + ", height=" + height + " cm, weight=" + weight + "kg. , Birthday=" + dob + ", major="
                + major + ", GPA=" + GPA; 
    }
}

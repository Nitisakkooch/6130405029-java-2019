/**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/
package koochaiyaphum.nitisak.lab4;
public class Teacher extends PersonV2 {
    private String teachingSubject; 
    private int salary; 

    public Teacher(String name, double height, double weight, String dob, String teachingSubject, int salary) { 
        super(name, height, weight, dob); 
    }
    public String getTeachingSubject(){ 
        return teachingSubject; 
    }
    public void setTeachingSubject(String teachingSubject){ 
        this.teachingSubject = teachingSubject; 
    }
    public int getSalary(){ 
        return salary; 
    }
    public void setSalary(int salary){ 
        this.salary = salary;
    }
    public String toString(){ 
        return "name="+ name + ", height="+ height + " cm, weight="+ weight + "kg. , Birthday=" + dob + ", teachingSubject=" + teachingSubject + ", Salary=" + salary; 
    }
}

package koochaiyaphum.nitisak.lab4;

public class Teacher {
    private String teachingSubject; //created variable name teachingSubject to store name of subject with String type.
    private int salary; //created variable name Salary to store value of salary with int type.

    public Teacher(String name, double height, double weight, String dob, String teachingSubject, int salary) { //method receive 4 variable from PersonV2, teachingSubject, and salary.
        super(name, height, weight, dob); //using super to call constructor of PersonV2 class.
    }
    public String getTeachingSubject(){ //getter for teachingSubject.
        return teachingSubject; //return value of teachingSubject.
    }
    public void setTeachingSubject(String teachingSubject){ //setter for teachingSubject.
        this.teachingSubject = teachingSubject; //set the new value of teachingSubject
    }
    public int getSalary(){ //getter for salary.
        return salary; //return value of salary.
    }
    public void setSalary(int salary){ //setter for salary.
        this.salary = salary; //set the new value of salary.
    }
    public String toString(){ //show output to user.
        return "name="+ name + ", height="+ height + " cm, weight="+ weight + "kg. , Birthday=" + dob + ", teachingSubject=" + teachingSubject + ", Salary=" + salary; //showing name and information of that name.
    }
}

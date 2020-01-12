 package koochaiyaphum.nitisak.lab4;

public class TestPersonV3 {
    public static void main(String[] args) { //main method of this calss.
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "Social Study", 15000); //created new Teacher name Onizuka with height, weight, DOB, Subject, and Salary.
        Student zuckerburg = new Student("Zuckerburg", 180, 25, "1984-05-14", "Computer Engineering", 4.00); //created new Student name Zuckerburg with height, weight, DOB, Major,and Grade.
        System.out.println(onizuka); //show Onizuka's information.
        System.out.println(zuckerburg); //show Zuckerburf's information.
        onizuka.howOld(); //calculate Onizuka's age.
        zuckerburg.howOld(); //calculate Zuckerburg's age.
        System.out.println(Person.getNumberOfPerson() + " persons have been created."); //show number of persons have been created.
        PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01"); //created new PersonV2 name Mickey Mouse with height, weight, and DOB.
        System.out.println(mickey); //show Mickey Mouse's information.
        mickey = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3.00); //created new Student name Mickey Mouse with height, weight, DOB, major, and Grade.
        System.out.println(mickey); //show Mickey Mouse's information.
        System.out.println(Person.getNumberOfPerson() + " persons have been created."); //show number of persons have been created.
        mickey.compareAge(onizuka); //compare age between mickey and onizuka.
    }
    
}
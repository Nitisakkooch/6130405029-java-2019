 /**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/
package koochaiyaphum.nitisak.lab4;
public class TestPersonV3 {
    public static void main(String[] args) { 
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "Social Study", 15000);
        Student zuckerburg = new Student("Zuckerburg", 180, 25, "1984-05-14", "Computer Engineering", 4.00);
        System.out.println(onizuka); 
        System.out.println(zuckerburg); 
        zuckerburg.howOld(); 
        System.out.println(Person.getNumberOfPerson() + " persons have been created."); 
        PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        System.out.println(mickey); 
        mickey = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3.00); 
        System.out.println(mickey); 
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        mickey.compareAge(onizuka); 
    }
    
}
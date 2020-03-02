/**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/
package koochaiyaphum.nitisak.lab4;
public class TestPerson {
    public static void main(String[] args) {
    Person unknown = new Person();
    System.out.println(unknown);
    System.out.println(Person.getNumberOfPerson() + " person has been created.");
    Person sala = new Person("Sala");
    Person mane = new Person("mane", 175, 65);
    System.out.println(sala);
    System.out.println(mane);
    Person henderson = new Person("Henderson", 180, 100);
    System.out.println(henderson);
    System.out.println(mane.getName() + "'s BMI is " + mane.getBMI());
    System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
    henderson.setWeight(80);
    System.out.println(henderson.getName() + "'s BMI is " + henderson.getBMI());
    System.out.println(Person.getNumberOfPerson() + " person have been created.");
    }
    
}
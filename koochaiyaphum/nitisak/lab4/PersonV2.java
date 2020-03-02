/**
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: January 12, 2012
*
**/
package koochaiyaphum.nitisak.lab4;
import java.time.LocalDate; 
import java.time.Period;

public class PersonV2 extends Person{

    LocalDate dob; 
    private  int numberOfPerson = 0; //Use every file in lab4 
	//constractor 4 input
    public PersonV2(String name, double height, double weight, String dob){ 
        super (name, height, weight);
        this.dob = LocalDate.parse(dob); 
        numberOfPerson += 1;
	}
    public LocalDate getDOB(){ 
        return dob;
	}
	
    public void setDOB(LocalDate dob){ //set dob value
        this.dob = dob; 
	}
	
    public void isBirthday(){ 
		//select today or not to day
        if(dob.equals(LocalDate.now())){ 
            System.out.println("Today is " + name + "'s Birthday."); 
        }
        else{
            System.out.println("Today isn't " + name + "'s Birthday."); 
        }
	}
	
    public void howOld(){ 
        Period age = Period.between(dob, LocalDate.now()); 
        System.out.println(name + " is " + age.getYears() + " years " + age.getMonths() + " months and " + age.getDays() + " days old."); 
	}
	
    public void compareAge(PersonV2 namePersonV2){ 
        if(dob.getYear() > namePersonV2.dob.getYear()){ 
            Period compare = Period.between(namePersonV2.dob ,dob); 
            System.out.println(namePersonV2.name + " is " + compare.getYears() + " years " + compare.getMonths() + " months and " + compare.getDays() + " days older than " + name); //show the result to user.
        }
        else{
            Period compare = Period.between(dob ,namePersonV2.dob); 
            System.out.println(name + " is " + compare.getYears() + " years " + compare.getMonths() + " months and " + compare.getDays() + " days older than " + namePersonV2.name); //show the result to user.
        }
	}
	
    public String toString(){ 
        return "name="+ name + ", height="+ height + " cm, weight="+ weight + "kg. , Birthday=" + dob; 
    }
}
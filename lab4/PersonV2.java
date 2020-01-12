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

public class PersonV2 extends Person {
	LocalDate dob;
	private static int numberOfPerson = 0; 
	
	public PersonV2(final String name, final Double height, final Double weight, final String dob) {
		super(name, height, weight);
		this.dob = LocalDate.parse(dob);
		numberOfPerson += 1;
	}

	public LocalDate getDOB() {
		return dob;
	}

	public void setDOB(final LocalDate dob) {
		this.dob = dob;
	}

	public String toString() {
		final String name;
		return "name=" + name + ", height=" + height + " cm, weight=" + weight + "kg. , Birthday=" + dob;
	}

	public void howOld() {
		final Period age = Period.between(dob, LocalDate.now());
		System.out.println(name + " is " + age.getYears() + " years " + age.getMonths() + " months and " + age.getDays()
				+ " days old.");
	}

	public void compareAge(final PersonV2 nobita) {
		final Object namePersonV2;
		if (dob.getYear() > namePersonV2.dob.getYear()) {
			final Period compare = Period.between(namePersonV2.dob, dob);
			System.out.println(namePersonV2.name + " is " + compare.getYears() + " years " + compare.getMonths()
					+ " months and " + compare.getDays() + " days older than " + name); // show the result to user.
		} else {
			final Period compare = Period.between(dob, namePersonV2.dob);
            System.out.println(name + " is " + compare.getYears() + " years " + compare.getMonths() + " months and " + compare.getDays() + " days older than " + namePersonV2.name); //show the result to user.
        }
	}

	public void isBirthday() {
		if(dob.equals(LocalDate.now())){ 
            System.out.println("Today is " + name + "'s Birthday."); 
        }
        else{
            System.out.println("Today isn't " + name + "'s Birthday.");
        }
	}


    
}
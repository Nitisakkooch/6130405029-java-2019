 package koochaiyaphum.nitisak.lab4;

public class PersonV2  extends Person{
	LocalDate dob;
	private static int numberOfPerson = 0; 
	
	public PersonV2(String name, Double height, Double weight, String dob) {
		super(name, height, weight);
		this.dob = LocalDate.parse(dob);
		numberOfPerson += 1;
	}

	public LocalDate getDOB(){ 
        return dob; 
	}

	public void setDOB(LocalDate dob){ 
        this.dob = dob; 
	}
	public String toString(){ 
        String name;
		return "name="+ name + ", height="+ height + " cm, weight="+ weight + "kg. , Birthday=" + dob; 
    }

	public void howOld() {
		Period age = Period.between(dob, LocalDate.now());
        System.out.println(name + " is " + age.getYears() + " years " + age.getMonths() + " months and " + age.getDays() + " days old.");
	}

	public void compareAge(PersonV2 nobita) {
		if(dob.getYear() > namePersonV2.dob.getYear()){
            Period compare = Period.between(namePersonV2.dob ,dob); 
            System.out.println(namePersonV2.name + " is " + compare.getYears() + " years " + compare.getMonths() + " months and " + compare.getDays() + " days older than " + name); //show the result to user.
        }
        else{
            Period compare = Period.between(dob ,namePersonV2.dob); 
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
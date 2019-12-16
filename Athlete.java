/**
 * This Athlete program is to accept three arguments: athlete name, the sport name 
*  that that athlete plays, and the nationality of that athlete.  Its output format is "My 
*  favorite athlete is <athlete_name> who plays <sport_name> and has 
* nationality as <athlete_nationality>"  
*
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: December 16, 2019
*
**/
public class Athlete{
    public static void main(String[] args) {
        if (args.length != 3) {
			System.err.println("My favorite athlete is <athlete_name> who plays <sport_name> and has nationality as <athlete_nationality>");
		}	
		else 
		{
			System.out.println("My favorite athlete is " + args[0]);
			System.out.println("who plays " + args[1]);
			System.out.println("and has nationality as " + args[2]);
		}
	}   
}


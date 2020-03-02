/*
This a Java program simulates a guessing game of which a user guesses number from 1 to 10. 
The answer is randomly generated then a user enter a number via the console. 
Each time a number is entered, one of the following three possible outputs will be displayed.
1. “Congratulations!”: if a number entered is the same as the answer,
2. “Try a lower number!”: if the number entered is higher than the answer, 
3. “Try a higher number!”: if the number entered is smaller than the answer. 
 The game ends when user guess the answer correctly or the user guess the number incorrectly five times. 
* Author: Nitisak Koochaiyaphum
* ID: 61304050-9
* Sec: 2
* Date: December 23, 2019
**/
package koochaiyaphum.nitisak.lab3;
import java.util.Scanner;
public class NumberGuessingGame {
	//declare input scanner and recall.
	private static Scanner scanner = new Scanner( System.in );
    public static void main ( String [] args ){
		System.out.println("Welcome to a number guessing game!");
		//create array number for random
		int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
		int rand = (int)(Math.random() * range) + min;
		//This is method  for loop to 5 input   
		for (int userTry = 1;userTry<=5;userTry++){
			System.out.print("Enter an integer between 1 and 10:");
			int input1 = scanner.nextInt();
		
			if ( input1 < rand )
			{
				System.out.println("Try a higher a number!");	
			}
			 else if ( input1 > rand )
			{
				System.out.println("Try a lower a number!");	
			}
			else if ( input1 == rand)
			{
				System.out.println("Congratulation!");
				System.out.println("You have tried " + (userTry) +" time");	
			}
			if (userTry == 5)
			{
				System.out.println("You have tried 5 time. You ran out of guesses");
				System.out.println("The answer is " + rand);
			}
		}

  }
    
}
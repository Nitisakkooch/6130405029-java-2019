/*
This a Java program simulates a guessing game of which a user guesses number from 1 to 10. 
The answer is randomly generated then a user enter a number via the console. 
Each time a number is entered, one of the following three possible outputs will be displayed.
1. “Congratulations!”: if a number entered is the same as the answer,
2. “Try a lower number!”: if the number entered is higher than the answer, 
3. “Try a higher number!”: if the number entered is smaller than the answer. 
The game ends when user guess the answer correctly or the user guess the number incorrectly five times.
This a program to divide method genAnswer() and playGame() 
* Author: Nitisak Koochaiyaphum
* ID: 61304050-9
* Sec: 2
* Date: December 23, 2019
**/
package koochaiyaphum.nitisak.lab3;
import java.util.Scanner;
public class NumberGuessingMethodGame {
    static int answer, rand;
    static Scanner scanner = new Scanner(System.in);
	//this is method create random number
    static void genAnswer() {
        System.out.println("Welcome to a number guessing game!");
        int max = 10; 
        int min = 1; 
        int range = max - min + 1; 
        rand = (int)(Math.random() * range) + min;        
    }
	//this is method for loop to check input1 and rand(scope random number)
    static void playGame() {
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
	//main and recall method
    public static void main(String[] args) {
        genAnswer();
        playGame();
    }
    
}
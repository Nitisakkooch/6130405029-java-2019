/*
This a program to impove for NumberGuessingMethodGame class 
* 
* Author: Nitisak Koochaiyaphum
* ID: 61304050-9
* Sec: 2
* Date: December 23, 2019
**/
package koochaiyaphum.nitisak.lab3;
import java.util.*;
public class NumberGuessingConfigurableGame {
    static int answer, min, max, numTries, rand;
    static Scanner scanner = new Scanner(System.in);
    //decear method to receive int number max, min and number of tries
    static void configure() {
        System.out.print("Enter the max value:");
        max = scanner.nextInt();
        System.out.print("Enter the min value:");
        min = scanner.nextInt();
        System.out.print("Enter the maximum number of tries:");
        numTries = scanner.nextInt();
    }
    
    static void genAnswer() {
        System.out.println("Welcome to a number guessing game!");
        int range = max - min + 1; 
        rand = (int)(Math.random() * range) + min;        
    }

    static void playGame() {
        while (true){
            for (int userTry = 1;userTry<=5;userTry++){
                System.out.print("Enter an integer between "+ min + " and "+ max + ":");
                int input1 = scanner.nextInt();
                if (input1 < min || input1 > max){
                    System.out.println("The number must be between " + min + " and " + max);
                    userTry -= 1;
                }
                else if ( input1 < rand )
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
                    break;
                }
                if (userTry == numTries)
                {
                    System.out.println("You have tried " + userTry + " time. You ran out of guesses");
                    System.out.println("The answer is " + rand);
                    break;
                }
            }
            System.out.print("Want to play again (Y or y):");
            if (scanner.next().equalsIgnoreCase("y")){
                genAnswer();
            } else {
                scanner.close();
                break;
            }
        }    
    }
    public static void main(String[] args) {
        configure();
        genAnswer();
        playGame();
    }

    
}

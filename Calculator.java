/** 
* This program Calculator which can add, subtract, multiply, or divide any  decimal numbers.
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: December 16, 2019
*
**/
public class Calculator{
   public static void main(String[] args){
        String input_1 = args[0];
        //The program displays the quitting message when the user types “q” or “Q”.
        if(args[0].equals("q") || args[0].equals("Q")){
             System.out.println("Quitting the program");
             System.exit(0);
        }
        double input_2 = Double.parseDouble(args[1]);
        double input_3 = Double.parseDouble(args[2]);

        //This method if and elase input argument 
        if (args.length != 3) {
			System.err.println("Error");
		}	
		else if(args[0].equals("-")){
             System.out.println(input_2 + input_1 + input_3);
            System.out.println("= " +(input_2-input_3));
        }
        else if(args[0].equals("+")){
            System.out.println(input_2 + input_1 + input_3);
            System.out.println("= " +(input_2+input_3));
        }
        else if(args[0].equals("*")){
            System.out.println(input_2 + input_1 + input_3);
            System.out.println("= " +(input_2*input_3));
        }
        else if(args[0].equals("/")){
            System.out.println(input_2 + input_1 + input_3);
            System.out.println("= " + (input_2/input_3));
        }
        else{
             System.out.println("Error");
        }

    }
}
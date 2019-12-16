public class Calculator{
   public static void main(String[] args){
        String input_1 = args[0];
        double input_2 = Double.parseDouble(args[1]);
        double input_3 = Double.parseDouble(args[2]);

        if (args.length != 3) {
			System.err.println("Error");
		}	
        else if(args[0].equals("q") & args[0].equals("Q")){
             System.out.println("Quitting the program");
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
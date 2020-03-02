package koochaiyaphum.nitisak.exam1;
/** 
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: january 27, 2020
* Exam1
*
**/
public class GroupDividerMethod {
    
    private static String[] args;
    private static int n;
    private static int m;

    static void dividerNumber() {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        // The program displays the quitting when argment not equal 2.
        if (args.length != 2) {
            System.err.println("Usage:java GroupDivider <m> <n>");
            System.exit(0);
        }
        // The program displays the quitting when m > n.
        else if (m > n) {
            System.out.println("Cannot divide a number by a larger number");
            System.exit(0);
        }

    }

    static void getNumbers(String[] args2) {
    
        for (int m = 1; m <= n; m++) {
            if (n % m == 0) {
                System.out.println(n);
                ;
            }
        }
    }

    public static void main(String[] args) {
        getNumbers(args);
        dividerNumber();
    }

    
}
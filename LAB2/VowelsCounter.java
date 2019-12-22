/**
*this program count boolean char english word.
* The program VowelsCounter to count the number of vowels in the given string.
* Author: Nitisak Koochaiyaphum
* ID: 613040502-9
* Sec: 2
* Date: December 16, 2019
*
**/
public class VowelsCounter{
    public static void main(String[] args){
            String str = args[0];
            System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
        }
    public static int count_Vowels(String str){
            int count = 0;
            for (int i = 0; i < str.length(); i++)
            {
                //Check word 
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u'
                 || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'|| str.charAt(i) == 'O' || str.charAt(i) == 'U')
                {
                    count++;
                }
            }
            return count;
    }
}
/*Calculate the length of the String - without using the length() function. String name =”Pramod”; →  6 ,
 CharArray, for loop
.......................Using For loop.........................
 */

package TASK_18102024;
import java.util.Scanner;

public class LengthOfaString {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the String to find the Length :");
        String s=str.nextLine();
        int len=0;
        for(int i=0;i<=s.length();i++)
            len++;
        System.out.println("Length of the given string '" + s +"' is :" +len);

    }
}
/* ------------output-------------------------
Enter the String to find the Length :
Java Program
Length of the given string 'Java Program' is :13

 */

//Reverse the String without using any functions. (for loop)

package TASK_18102024;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the String :" );
        String s = str.nextLine();
        int length = s.length();
         String rev="";
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}


/*  -----OUTPUT-------
Enter the String :
SOWJANYA
AYNAJWOS

 */
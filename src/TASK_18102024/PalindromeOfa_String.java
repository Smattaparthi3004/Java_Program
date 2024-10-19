// Verify the Given Sttring is palindrome or not without using String Reverse Function
package TASK_18102024;
import java.util.Scanner;
public class PalindromeOfa_String {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the String :" );
        String s = str.nextLine();
        s=s.toLowerCase();  //Convert the given string into lower case
        int length = s.length();
        String rev="";
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        rev=rev.toLowerCase(); //Convert the string in to Lowercase
        if(rev.equals(s))
             System.out.println("Given String is a Palindrome!!...");
        else
            System.out.println("Given sting is not a palindrome !!");
    }
}
/*    --------------Output----------------
Enter the String :
Java Program
Given sting is not a palindrome !!

Enter the String :
Madam
Given String is a Palindrome!!...
*/


//Create a Java program that prints the first 5 even numbers using a do-while loop.
package Task_27092024;

import java.util.Scanner;

public class lab_27thTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number to print the Even numbers:");
        int start=sc.nextInt();
        System.out.println("Enter the Last number to print the Even numbers:");
        int End=sc.nextInt();
       int num=start;
        System.out.println("Even Numbers between "+start +" & "+End);
            do {
                if (num % 2 == 0)
                    System.out.println(num );
                num++;
            } while (num <=End );
        //}

    }
}
/*  -----Output-------------
Enter the starting number to print the Even numbers:
 -4
Enter the Last number to print the Even numbers:
4
Even Numbers between -4 & 4
-4
-2
0
2
4
 */
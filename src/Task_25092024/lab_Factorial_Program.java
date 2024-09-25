/*Factorial Program - n = 5 , Output = 120
       //....output ...  n = 5 ->
         Fact = 5*4*3*2*1 = 120
 */
package Task_25092024;

import java.util.Scanner;

public class lab_Factorial_Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter thr Number :");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=i*fact;

        }   System.out.println("Factorial of the number " +num+"! is :"+fact);

    }
}

//Table of number n = 10, print table with For or while.

package Task_25092024;

import java.util.Scanner;

public class lab_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the table no:");
        int num=sc.nextInt();

        // ......Using for loop.....
        for (int i=1;i<=20;i++)
        {
            System.out.println(num + "*" + i+ "=" +(num *i));
        }

        //.... Using for while loop ....
        System.out.println("Enter the table no:");
        int n=sc.nextInt();
        int i=1;
        while(i<=20){
            System.out.println(n + "*" + i+ "=" +(n *i));
            i++;
        }
        sc.close();
    }
}

package Task_27092024;

import java.util.Scanner;

public class lab_ex_5evenNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting number to print the 5 Even numbers:");
        int start=sc.nextInt();
        int num=start;
        System.out.println("Five Even Numbers are:");
        do {
            if (num % 2 == 0)
                System.out.println(num );
            num++;
        } while (num <(start+10) );
        //}

    }
}
/*
-----Output----------
Enter the starting number to print the 5 Even numbers:
-11
Five Even Numbers are:
-10
-8
-6
-4
-2
 */
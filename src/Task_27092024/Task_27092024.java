package Task_27092024;

import java.util.Scanner;

//Give me example of while vs do while loop in Lab ex.
public class Task_27092024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter Number :");
        int i=sc.nextInt();
        // ..........while loop Example..........
        int num=0;
        while ((num>=i)) {
            System.out.println("while loop :");//condition fails exit the loop .output is not generated
            System.out.println(num);
            num++;
        }
        // ..........do while loop Example..........

        do{
            System.out.println("do while loop block :");
            System.out.println(num);
            num++;
        }while (num>=i);        //Condition fails but statement executes
    }
}


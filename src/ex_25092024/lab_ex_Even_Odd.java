package ex_25092024;

import java.util.Scanner;

public class lab_ex_Even_Odd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to print the even & Odd nos between them");
                int num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            if(i%2==0)
                System.out.println("Even -->" + i);
            else System.out.println("Odd -->"+ i);
        }


    }

}

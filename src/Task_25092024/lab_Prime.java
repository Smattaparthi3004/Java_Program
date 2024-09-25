package Task_25092024;

import java.util.Scanner;
import java.util.SortedMap;

public class lab_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print up to the prime numbers");
        int num = sc.nextInt(),flag=0;
        for (int i = 1; i <= num; i++) {
            if (i <= 1)                            // 1 is neither prime nor composite
                continue;                          //Skip the remaining statements and go back to the loop then i=2
            if (i == 2) {
                System.out.println("prime --->" + i);
               continue;
            }
            flag=1;        //Verifies it is prime or not
            for(int j=2;j<=i/2;j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }  if(flag==1)
                System.out.println("Prime --->"+i);
        }

    }
}

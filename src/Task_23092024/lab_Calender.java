/* Write a program that takes an integer input (1-12) and prints the name of the corresponding month using a switch statement.
Input  - 12
Out - Dec. */
package Task_23092024;

import java.util.logging.SocketHandler;

public class lab_Calender {
    public static void main(String[] args) {
        int month = 11;
        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 ->System.out.println("October");
            case 11 ->System.out.println("November");
            case 12-> System.out.println("December");
            default -> System.out.println("Wrong Input");

         /*   case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            case 3: {
                System.out.println("March");
                break;
            }
            case 4: {
                System.out.println("April");
                break;
            }
            case 5: {
                System.out.println("May");
                break;
            }
            case 6: {
                System.out.println("June");
                break;
            }
            case 7: {
                System.out.println("July");
                break;
            }
            case 8: {
                System.out.println("August");
                break;
            }
            case 9: {
                System.out.println("September");
                break;
            }
            case 10: {
                System.out.println("October");
                break;
            }
            case 11: {
                System.out.println("November");
                break;
            }
            case 12:{
                System.out.println("December");
                break;
                }
            default:
               System.out.println("Wrong input");*/
        }
    }
}

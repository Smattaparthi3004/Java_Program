/* write a program to print days by using switch */
package ex_23092024;
public class lab_ex_switch5 {
    public static void main(String[] args) {
        int day=0;
        switch (day)
        {
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            default -> System.out.println("Sunday");
        }
    }
}

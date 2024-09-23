/* Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
Inputs :   num 1, num 2, +
Output :  num1+num2 → print information. */
package Task_23092024;
public class lab_Arthimetic_Cal {
    public static void main(String[] args) {
    int num1=30,num2=11;
    char ch='/';

 /*  >Jdk13 version we can write Switch Statement as
  switch ('%')
    {
        default -> System.out.println("Modulus of 2 numbers :"+(num1%num2));
        case '+' -> System.out.println("Addition of 2 numbers :"+(num1+num2));
        case '-' -> System.out.println("Subtraction of 2 numbers :"+(num1-num2));
        case '*' -> System.out.println("Multiplication of 2 numbers :"+(num1*num2));
        case '/' -> System.out.println("Division  of 2 numbers :"+(num1/num2));
        // default -> System.out.println("Modulus of 2 numbers :"+(num1%num2));
    } */
    switch (ch)
    {
       // default: System.out.println("Division  of 2 numbers :" + (num1 / num2));
        case('+'):{
            System.out.println("Addition of 2 numbers :"+(num1+num2));
            break;
        }
        case '-': {
            System.out.println("Subtraction of 2 numbers :"+(num1-num2));
            break;
        }
        case '*':{
             System.out.println("Multiplication of 2 numbers :"+(num1*num2));
             break;
        }
        case '/': {
            System.out.println("Division of 2 numbers :" + (num1 / num2));
            break;
        }
       default: System.out.println("Modulus of 2 numbers :" + (num1 / num2));
    }
    }
}

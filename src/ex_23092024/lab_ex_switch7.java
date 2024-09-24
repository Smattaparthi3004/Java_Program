/* Much improved switch accepts multiple values per case */
package ex_23092024;
public class lab_ex_switch7 {
    public static void main(String[] args) {
        int itemCode=003;
        switch (itemCode) {
            case 001, 002, 003 :
                System.out.println("It's an electronic gadget!");
                break;
            case 004, 005:
                System.out.println("It's a mechanical device!");
        }
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
        }
    }
}
/* .........Output .........
It's an electronic gadget!
It's a mobile phone!
 */
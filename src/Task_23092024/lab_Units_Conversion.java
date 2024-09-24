/* Write a program that converts between different units (e.g., kilometers to miles, Celsius to Fahrenheit)
based on user selection using a switch statement.
Input. -
choice -1 km -> m
choice- 2  m -> km
choice -3  f -> c
choice -4  c -> f
*/
package Task_23092024;
public class lab_Units_Conversion {
    public static void main(String[] args) {
        double value=96.8;
        int Choice= 1;
        switch (Choice) {
            case 1:
            {
                System.out.println(value + " km is equals to :" + (value*1000) +" m");
              break;
            }
            case 2:
            {
                System.out.println(value + " m is equals to :" + (value/1000) +" Km");
                break;
            }
            case 3:
            {
                System.out.println(value + " F is equals to :" + ((value-32) * 5/9) +" °C");
               break;
            }
            case 4:
            {
                System.out.println(value + "°C is equals to :" + ((value*9/5) + 32) +"F" );
               break;
            }
            default:
                System.out.println("Wrong input");
        }
    }
}

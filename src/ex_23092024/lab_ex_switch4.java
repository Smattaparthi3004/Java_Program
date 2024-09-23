package ex_23092024;

public class lab_ex_switch4 {
    public static void main(String[] args) {
         String Browser="Chrome";
         switch (Browser){
             case "chrome": {
                 System.out.println("Open the Chrome Browser");
                 break;
             }
             case "Firefox": {
                 System.out.println("Open the Firefox Browser");
                 break;
             }
             case "Edge": {
                 System.out.println("Open the Edge Browser");
                 break;
             }
             default:
                 System.out.println("Open Opera Browser");
         }
    }
}

/*** Output ***/
// Open Opera Browser

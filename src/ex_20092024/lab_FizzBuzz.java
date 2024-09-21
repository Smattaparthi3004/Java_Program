package ex_20092024;

public class lab_FizzBuzz {
    public static void main(String[] args) {
        int i = 1, j = 100;
        for (i = 1; i < j; i++) {
            if(i%3==0 && i%5==0)
                System.out.println("Fizz Buzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);


        }

    }
}
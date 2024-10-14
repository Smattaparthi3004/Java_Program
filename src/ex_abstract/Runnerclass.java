package ex_abstract;

public class Runnerclass  {
    public static void main(String[] args) {
        Book mybook=new PrintMyBook();
        mybook.getDetails("Harry Potter", "J.k. Rowling", 120f);

    }
}

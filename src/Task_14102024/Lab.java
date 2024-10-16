package Task_14102024;

public class Lab {
    public static void main(String[] args) {
        //Book book =new Book(); abstract class cannot create an object

        Book book=new PrintMyBook("Harry Potter", "J.k. Rowling", 120);
        PrintMyBook Pbook=new PrintMyBook("Harry Potter", "J.k. Rowling", 150);
        book.GetDetails();
        Pbook.GetDetails();
    }
}

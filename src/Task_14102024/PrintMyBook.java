package Task_14102024;

public class PrintMyBook extends Book{

    PrintMyBook(String name, String author, long Price) {
        super(name, author, Price);
    }

    @Override
    void GetDetails(    ) {
        System.out.println("Name    :"+name);
        System.out.println(("Author  :"+author));
        System.out.println("Price   :"+price);
    }

}

package Task_14102024;

abstract class Book {
      protected String name,author;
      protected  long price;

    abstract void GetDetails();

    Book (String name,String author,long Price){
        this.name=name;
        this.author=author;
        this.price=Price;

    }

}

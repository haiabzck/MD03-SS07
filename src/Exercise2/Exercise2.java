package Exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.setTitel("Java Programing");
        myBook.setAuthor("John Doe");
        myBook.setPrice(29.99);

        System.out.println("Tiêu đề : "+myBook.getTitel());
        System.out.println("Tác giả : "+myBook.getAuthor());
        System.out.println("Giá : "+myBook.getPrice());

        myBook.setPrice(35.50);
        System.out.println("Giá mới : "+myBook.getPrice());
         myBook.setPrice(-5.00);
    }
}
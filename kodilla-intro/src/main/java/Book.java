public class Book {
    private String author;
    private String title;

   /* public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }*/

    public static void main(String[] args) {
        Book book2 = Book.of("Isaac Asimov", "The Galaxy");
        Book book3 = Book.of("Wasilij Machanienko", "The Way of the Shaman");
        System.out.println("Author: " + book2.author + " , title: " + book2.title);
        System.out.println("Author: " + book3.author + " , title: " + book3.title);
    }

    /*public static Book of(String author,String title) {
        Book book = new Book(author, title);
        return book;
    }*/

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }
}
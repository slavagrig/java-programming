package Day50_Inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to Java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        EBook ebook = new EBook();
        ebook.title = "Intro to SQL";
        ebook.author = "Jahresh";
        ebook.type = "programming";
        ebook.price = 50;
        ebook.readBook();
    }
}

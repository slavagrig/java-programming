package Day50_Inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listening to AudioBook");
        System.out.println("length = " + length);
        System.out.println("title = " + title);
        System.out.println("price = " + price);
        System.out.println("author = " + author);

        AudioBook audioBook  = new AudioBook();

    }
}

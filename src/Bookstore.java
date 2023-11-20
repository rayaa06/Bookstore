import java.util.ArrayList;
public class Bookstore {
    ArrayList<Book> books = new ArrayList<>();
    public void sell (Book book){
        int av=book.getAvailable();
        if (av>0) {
            System.out.println("Book: " + book.getTitle() + "; author: " + book.author.getName() + "; price: " + book.getPrice()+"lewa");
            book.setAvailable(av - 1);
        }
        if (av<=0){
            System.out.println("Nqma nalichnost");
        }
    }
}
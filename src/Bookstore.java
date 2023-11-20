import java.util.ArrayList;
public class Bookstore {
    ArrayList<Book> books = new ArrayList<>();
    public void sell (Book book){
        int av=book.getAvailable();
        if (av>0) {
            System.out.println("Заглавие: " + book.getTitle() + "   aвтор: " + book.author.getName() + "    цена: " + book.getPrice()+"лв.");
            book.setAvailable(av - 1);
        }
        if (av<=0){
            System.out.println("За съжаление за "+ book.getTitle()+ " от " + book.author.getName()+ " няма наличност.");
        }
    }
}
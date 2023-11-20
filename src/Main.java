import java.util.*;
public class Main {
    public static void main(String[] args) {
        Bookstore bs= new Bookstore();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0; i<num; i++) {
            Book book = null;
            System.out.println("Въведете данни за книга: <тип-Comic/Children/Book> <заглавие> <автор-ime i wyzrast> <цена> <nalichnost>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case COMIC:
                    book = new ComicBook();
                    break;
                case CHILDREN:
                    book = new ChildrenBook();
                    break;
                case BOOK:
                    book = new Book();
                    break;
            }
            book.setType(type);
            book.setTitle(sc.next());
            book.setAuthor(sc.next(), sc.nextInt());
            book.setPrice(sc.nextDouble());
            book.setAvailable(sc.nextInt());
            switch (type){
                case COMIC:
                    System.out.println("Въведете име на героя в комикса: ");
                    ((ComicBook)book).setCharacterName(sc.next());
                    break;
                case CHILDREN:
                    System.out.println("Въведете възраст на децата, за която книгата е подходяща: ");
                    ((ChildrenBook)book).setAge(sc.nextInt());
                    break;
                default: break;
            }
            bs.books.add(book);
        }
        System.out.println("Prodazhba na knigi:");
        for (int i=0; i< bs.books.size(); i++) {
            if (i%2==0) {
                bs.sell(bs.books.get(i));
            }
        }
    }
}
public class Book extends Bookstore{
    private String title;
    public Author author;
    private BookType type;
    private int available;
    private double price;
    Book(){
        title=" ";
        author= new Author();
        getAuthor();
        getType();
        available=0;
        price=0;
    }
    Book (double price, String title, Author author, BookType type, int available){
        this.price=price;
        this.title=title;
        this.author=author;
        this.type=type;
        this.available=available;
    }
    public double getPrice (){
        return price;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
    public BookType getType(){
        return type;
    }
    public int getAvailable(){
        return available;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String name, int age){
        author.setAuthor(name, age);
    }
    public void setType(BookType type){
        this.type=type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setAvailable(int available){
        this.available=available;
    }
}

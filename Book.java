import java.sql.Struct;

public class Book {
    //DATA
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty=0;
     //FUNC


    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String isbn, String name , Author author,double price){
        this.isbn=isbn;
        this.name=name;
        this.author=author;
        this.price=price;

    }

    public double getPrice(){
        return this.price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        if(qty>0)
            this.qty = qty;
    }

    public void setPrice(double price){
        if(price > 0)
            this.price=price;
        else{
            System.out.println("invalid input");
            this.price=-1;
        }
    }

    @Override
    public String toString(){
        return "Book \nisbn"+this.getIsbn()+" name =>" +
                this.getName()+" book auther => "+author+"" +
                " price =>"+this.getPrice()+" qty =>"+this.getQty();
    }
}

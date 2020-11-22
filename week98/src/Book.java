import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qty;

    public Book(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,authors={%s},price=%f,qty=%d]"
                ,name,Arrays.toString(author),price,qty);
    }
    public String getAuthorNames(){
        String names="";
        for (int i=0; i<= author.length;i++) {
            if(i== author.length){
                names=" "+ author[0];
            }else{
                names=", "+ author[0];
            }
        }
        return names;
    }
}

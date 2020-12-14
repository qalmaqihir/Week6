import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private Double price;
    private int qty = 0;

    public Book(String name, Author[] authors, Double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, Double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public Author[] getAuthor() {
        return authors;
    }
    public Double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return String.format("Book[name=%s,Author=%s,price=%f, qty=%d]",name, Arrays.toString(authors),price,qty);
    }

    public String getAuthorNames(){
        StringBuilder writersName= new StringBuilder();

        for(Author name:authors){
            writersName.append(name.getName());
            writersName.append(",");
        }
        return writersName.substring(0,writersName.length()-1).toString();

    }
}
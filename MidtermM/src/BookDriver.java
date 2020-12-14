import java.util.Arrays;

public class BookDriver {
    public static void main(String[] args) {
        Author[] authors = {new Author("jawad","Jh@email.com",'m'), new Author("Haider", "JH@email.com",'m')};

        Book kitabay  = new Book("adsfasdf", authors,35.7,5000);

        kitabay.setPrice(23.4);
        kitabay.setQty(1110);
        System.out.println("name is: " + kitabay.getName());
        System.out.println("price is: " + kitabay.getPrice());
        System.out.println("qty is: " + kitabay.getQty());
        System.out.println("Author is: " + Arrays.toString(kitabay.getAuthor()));
        System.out.println("Author's name is: " + kitabay.getAuthorNames());

    }
}
public class AuthorDriver {
    public static void main(String[] args) {
        Author jawad=new Author("JH","jh@gmail.com",'m');
        jawad.setEmail(" khnJawad@yahoo.com");
        System.out.println("name is: " + jawad.getName());
        System.out.println("email is: " + jawad.getEmail());
        System.out.println("gender is: " + jawad.getGender());
    }
}
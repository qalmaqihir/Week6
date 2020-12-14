public class AccountTest {
    public static void main(String[] args) {
        Account myAccount= new Account(3443,100.99);

        System.out.println(myAccount.toString());

        myAccount.credit(100.99897);
        System.out.println("After crediting 100.99897");
        myAccount.print();
        myAccount.debit(100.45);
        System.out.println("\nAfter debiting 100.45");
        myAccount.print();
        System.out.println("Trying to debiting (10000)-more amount than balance");
        myAccount.debit(10000);


    }
}

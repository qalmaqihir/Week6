public class AccountTest {
    public static void main(String[] args) {
        Account jawad=new Account(1234, 12.33345);
        jawad.print();
        System.out.println();
        System.out.println(jawad.getAccountNumber());
        System.out.println(jawad.getBalance());
        jawad.setBalance(19999999.999);
        System.out.println(jawad.getBalance());
    }
}

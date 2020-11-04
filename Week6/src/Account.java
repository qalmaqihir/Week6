public class Account {
    private int accountNumber;
    private double balance=0.0;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
        public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public  void credit(double amount){
        this.balance+=amount;
    }
    public void debit(double amount){
        if(amount>balance){
            System.out.println("amount withdrawn exceeds the current balance!");
        }else{
            balance-=amount;
        }
    }
    public void print(){
        System.out.printf("A/C no: %d Balance=$%.2f ",accountNumber,balance);
    }

    @Override
    public String toString() {
        return String.format("A/C no: %d Balance=$.2f",accountNumber,balance);
    }
}

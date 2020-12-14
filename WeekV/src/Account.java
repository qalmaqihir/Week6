public class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public void credit(double amount){
        this.balance+= amount;
    }
    public void debit(double amount){
        if(this.balance>amount){
            this.balance-=amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance!\n");

        }
    }
    public void print(){
        System.out.printf("A/C no: %d Balance=$%.2f%n",accountNumber,balance);
    }
    @Override
    public String toString(){
        return String.format("A/C no: %d Balance=$%.2f%n",accountNumber,balance);
    }
}

package CustomerAccount;

public class Account {
    private int ID;
    private Customer customer;
    private double balance;

    public Account() {
        this.balance=0.0;
    }

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString(){
        return String.format("%s balance=$%.2f",customer.toString(),balance);
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account deposit(double amount){
        setBalance(balance+amount);
        Account newAccount=new Account(this.ID,this.customer,this.balance);
        return newAccount;
    }
    public Account withdraw(double amount){
        if(balance>=amount){
            setBalance(balance-amount);
            Account newAccount=new Account(this.ID,this.customer,this.balance);
            return newAccount;
        }
        else{
            System.out.println("amount withdraw exceeds the current balance!");
            Account newAccount=new Account(this.ID,this.customer,this.balance);
            return newAccount;
        }
    }
}

public class BankAccount{
    private String type,accountNumber;
    private double balance;

    BankAccount(){ //no arg constructor
        this.balance = 0.0;
    }
    BankAccount(double balance){ //parameterized constructor
        this.balance = balance;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;}
}


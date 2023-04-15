package BankAccount;

public class BankAccount {

    private static int id;
    private double balance;
    private static double interestRate = 0.02;

    private static int bankAccountCount=1;

    public BankAccount()
    {
        this.id = bankAccountCount++;
    }

    public static void setInterestRate(double interest)
    {
        BankAccount.interestRate = interest;
    }

    public double getInterest(int years)
    {
        return BankAccount.interestRate * years * this.balance;
    }

    public void  deposit(double amount){
        this.balance +=amount;

    }

    public static int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

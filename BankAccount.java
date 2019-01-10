import java.util.Random;
import java.util.Scanner;

public class BankAccount{
    String accountNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    private static int numOfAccounts = 0;
    private static int totalMoney = 0;
    public BankAccount(){
        this.accountNumber = generateAccountNumber();
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance;

        numOfAccounts++;

    }
    private String generateAccountNumber(){
        Random rand = new Random();
        String accountNumber = "";
        for(int i = 0; i < 10; i++){
            Integer number = rand.nextInt(9);

            accountNumber += Integer.toString(number);
        } 
        return accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void deposit(String accountType, double amount){
        if(accountType == "Checking Account"){
            this.setCheckingBalance(amount);
            totalMoney += amount;
        }
        else if(accountType == "Saving Account"){
            this.setSavingBalance(amount);
            totalMoney += amount;
        }else{
            System.out.println("Enter 'Checking Account' or 'Saving Account'");
        }
    }
    public void withdraw(String accountType, double amount) {
        double checkBalance = this.getCheckingBalance();
        double savingBalnce = this.getSavingBalance();
        if(accountType == "Checking Account"){
            if(checkBalance < amount){
                System.out.println("Insufficient Funds");
            }else{
            this.setCheckingBalance(-amount);
            totalMoney -= amount;
            System.out.println("You got $" + amount + " from your Checking Account" );
            displayAccount();
            }
        }
        else if(accountType == "Saving Account"){
            if(savingBalance < amount){
                System.out.println("Insufficient Funds");
            }else{
            this.setSavingBalance(-amount);
            totalMoney -= amount;
            System.out.println("You got $" + amount + " from your Saving Account" );
            displayAccount();
            }
        }else{
            System.out.println("Enter 'Checking Account' or 'Saving Account'");
        }
    }
    public void displayAccount(){
        double total = this.checkingBalance + this.savingBalance;
        System.out.println("***************");
        System.out.println("Account #: " + this.accountNumber);
        System.out.println("Checking Account Balance: $" + this.checkingBalance);
        System.out.println("Saving Account Balance: $" + this.savingBalance);
        System.out.println("Total: $" + total);
        System.out.println("***************");
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    private void setCheckingBalance(double amount){
        this.checkingBalance += amount;
    }
    public double getSavingBalance(){
        return this.savingBalance;
    }
    private void setSavingBalance(double amount){
        this.savingBalance += amount;
    }
}   

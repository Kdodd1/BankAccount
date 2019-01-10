public class Test{ 
    public static void main(String [] agrs) {
        BankAccount bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.getAccountNumber());
        bankAccount1.deposit("Checking Account", 800);
        bankAccount1.deposit("Saving Account", 500);
        bankAccount1.displayAccount();
        bankAccount1.withdraw("Checking Account", 100);
        bankAccount1.withdraw("Checking Account", 1000000);

    }
}
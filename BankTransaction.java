

public class BankTransaction {
    String accountName; // SBI / Canara / Bank_of_Baroda
    String accountHolderName;
    String accountType; // Saving / Business
    long accountNumber;
    double balance;

    public BankTransaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayTransaction() {
        System.out.println("Bank: " + accountName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction("SBI", "Alice", "Saving", 1234567890L, 15000.75);
        transaction.displayTransaction();
    }
}

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount freeBankAccount = new BankAccount();
        System.out.println(freeBankAccount.getBalance());
        System.out.println(freeBankAccount.getMonthlyFee());
        System.out.println(freeBankAccount.getTransactionFee());
        System.out.println("Expected: 0.0 for all");

        BankAccount bankAccount = new BankAccount(1500, 24.99, 9.99);
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Monthly fee: " + bankAccount.getMonthlyFee());
        System.out.println("Transaction fee: " + bankAccount.getTransactionFee());
        System.out.println("Expected: 1500.0, 24.99, 9.99");
        bankAccount.deductMonthlyFee();
        System.out.println("New balance after monthly fee: " + bankAccount.getBalance());
        System.out.println("Expected: 1475.01");
        double withdrawnAmount = bankAccount.withdraw(10);
        System.out.println("New balance after withdrawal: " + bankAccount.getBalance());
        System.out.println("Expected: 1455.02");
        System.out.println("Withdrawn amount: " + withdrawnAmount);
        System.out.println("Expected: 10.0");
        bankAccount.deposit(9.99);
        System.out.println("New balance after deposit: " + bankAccount.getBalance());
        System.out.println("Expected: 1455.02");

        bankAccount.setBalance(10);
        System.out.println("Balance: " + bankAccount.getBalance());
        System.out.println("Expected: 10.0");
        bankAccount.setMonthlyFee(0.99);
        System.out.println("Monthly fee: " + bankAccount.getMonthlyFee());
        System.out.println("Expected: 0.99");
        bankAccount.setTransactionFee(0.01);
        System.out.println("Transaction fee: " + bankAccount.getTransactionFee());
        System.out.println("Expected: 0.01");
    }
}

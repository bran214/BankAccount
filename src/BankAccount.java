public class BankAccount {

    /** the balance of the BankAccount */
    private double balance;
    /** the price of the fee to be deducted from the BankAccount per month */
    private double monthlyFee;
    /** the price of the fee to be deducted from the BankAccount when making a transaction, which includes deposits and withdrawals */
    private double transactionFee;

    /**
     * Constructor for a fee-free BankAccount with a $0 balance
     */
    public BankAccount() {
        this(0, 0, 0);
    }

    /**
     * Constructor for initializing a BankAccount with the provided values
     * @param balance {@link #balance}
     * @param monthlyFee {@link #monthlyFee}
     * @param transactionFee {@link #transactionFee}
     */
    public BankAccount(double balance, double monthlyFee, double transactionFee) {
        this.balance = balance;
        this.monthlyFee = monthlyFee;
        this.transactionFee = transactionFee;
    }



    /**
     * Deposits a given amount of money into the BankAccount and deducts the {@link #transactionFee}.
     * @param amount the amount of money to be deposited
     */
    public void deposit(double amount) {
        balance += (amount - transactionFee);
    }

    /**
     * Withdraws a given amount of money from the BankAccount and deducts the {@link #transactionFee}.
     * @param amount the amount of money to be withdrawn
     * @return the amount of money withdrawn from the BankAccount
     */
    public double withdraw(double amount) {
        balance -= (amount + transactionFee);
        return amount;
    }

    /**
     * Deducts the {@link #monthlyFee} from the BankAccount.
     */
    public void deductMonthlyFee() {
        balance -= monthlyFee;
    }



    // getters and setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
}

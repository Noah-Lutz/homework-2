public class BankAccount {

    // Constant so we won't modify it.
    private final double INTEREST_RATE;

    private int accountNumber;
    private double bankBalance, duration, interest;

    /*
     * Constructors.
     */

    public BankAccount(double interestRate) {
        INTEREST_RATE = interestRate;
        accountNumber = 0;
        bankBalance = duration = interest = 0;
    }

    public BankAccount(double interestRate, int accountNumber, double bankBalance, double duration) {
        INTEREST_RATE = interestRate;
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
        this.duration = duration;
        this.interest = 0;
    }

    /*
     * Getters/Setters.
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public double getDuration() {
        return duration;
    }

    public double getInterest() {
        return interest;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    /*
     * Instance Methods
     */

    public void calcInterest() {
        interest = bankBalance * INTEREST_RATE * duration;
    }

    public void displayAccount() {
        System.out.printf("ACCOUNT %d INFORMATION:\n", accountNumber);
        System.out.printf(" - Interest Rate: %.2f\n", INTEREST_RATE);
        System.out.printf(" - Current Balance: %.2f\n", bankBalance);
    }

    public void updateBalance() {
        calcInterest();
        bankBalance += interest;
    }

    /*
     * Static Methods
     */

    /**
     * Convert a given amount of currency to USD.
     * fAmount: Amount of original currency.
     * fEx: Exchange rate of original currency to USD.
     */
    public static double convertCur(double fAmout, double fEx) {
        return fAmout * fEx;
    }
}

public class Bank {

    public static void main(String[] args) {
        final double interestRate = 0.03;

        BankAccount account100 = new BankAccount(interestRate, 100, 1000, 2);
        BankAccount account200 = new BankAccount(interestRate, 200, 1500, 2);

        account100.setBankBalance(account100.getBankBalance() + 300);
        account200.setBankBalance(account200.getBankBalance() - 400);

        account100.displayAccount();
        System.out.println();
        account200.displayAccount();
        System.out.println();

        // Set the balance to 150 swiss franks converted to usd.
        account100.setBankBalance(BankAccount.convertCur(150, 1.1771025));
        // The last line of instructions says to update balance - hopefully it meant this?
        account100.updateBalance();

        // Set the balance to 140 euros converted to usd.
        account200.setBankBalance(BankAccount.convertCur(140, 1.104766));
        // The last line of instructions says to update balance - hopefully it meant this?
        account200.updateBalance();

        account100.displayAccount();
        System.out.println();
        account200.displayAccount();
        System.out.println();
    }
}

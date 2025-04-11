package LAB7.task1;

public class Main {public static void main(String[] args) {
    BankAccount account1 = new BankAccount(315, 0);
    BankAccount account2 = new BankAccount(316, 0);

    account1.setBalance(10000);
    account2.setBalance(-10000);

    account1.deposit(1000);
    account1.withdraw(500);
    account1.withdraw(2000);

    account2.deposit(-1000);
    account2.withdraw(500);
    account2.deposit(15000);
    account2.withdraw(-2);
}
}

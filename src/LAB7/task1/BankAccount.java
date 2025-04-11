package LAB7.task1;

public class BankAccount {private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int startBalance){
        this.accountNumber = accountNumber;
        this.balance = startBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("Balance cannot be negative");
            return;
        }else {
            System.out.println("Balance set to " + balance);
            this.balance = balance;
        }
    }
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("Deposit cannot be negative");
        }else {
            balance += amount;
            System.out.println("Deposit " + amount + ", new balance is " + balance);
        }
    }

    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("withdraw cannot be negative");
        } else if (amount > balance) {
            System.out.println("Amount exceeds balance");
        }else {
            balance -= amount;
            System.out.println("Withdraw " + amount + ", new balance is " + balance);
        }
    }
}

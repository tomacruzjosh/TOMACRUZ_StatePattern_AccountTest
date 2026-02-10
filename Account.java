public class Account {
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        // Defaulting to Active State
        this.accountState = new ActiveState();
    }

    // Setters and Getters
    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    // Delegated Methods
    public void deposit(Double amount) { accountState.deposit(this, amount); }
    public void withdraw(Double amount) { accountState.withdraw(this, amount); }
    public void activate() { accountState.activate(this); }
    public void suspend() { accountState.suspend(this); }
    public void close() { accountState.close(this); }

    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
}

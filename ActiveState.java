public class ActiveState implements AccountState {
  public void deposit(Account account, Double depositAmount) {
    account.setBalance(account.getBalance() + depositAmount);
    System.out.println(account.toString());
  }
  public void withdraw (Account account, Double withdrawAmount) {
    account.setBalance(account.getBalance() - withdrawAmount);
    System.out.println(account.toString());
  }
  public void suspend (Account account) {
    account.setAccountState(new SuspendedState());
    System.out.println("Account is suspended!");
  }
  public void activate(Account account) {
    System.out.println("Account is already activated!");
  }
  public void close(Account account) {
    account.setAccountState(new ClosedState());
    System.out.println("Account is closed!");
  }
}

public class ClosedState implements AccountState {
  public void deposit(Account account, Double depositAmount) {
    System.out.println("You cannot deposit on a closed account!");
    System.out.println(account.toString());
  }
  public void withdraw (Account account, Double withdrawAmount) {
    System.out.println("You cannot withdraw on a closed account!");
    System.out.println(account.toString());
  }
  public void suspend (Account account) {
    System.out.println("You cannot suspend a closed account!");
  }
  public void activate(Account account) {
    account.setAccountState(new ActiveState());
    System.out.println("You cannot activate a closed account!");
  }
  public void close(Account account) {
    account.setAccountState(new ClosedState());
    System.out.println("Account is already closed!");
  }
}

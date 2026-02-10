public interface AccountState {
  public void deposit(Double depositAmount);
  public void withdraw(Double withdrawAmount);
  public void suspend();
  public void activate();
  public void close();
}

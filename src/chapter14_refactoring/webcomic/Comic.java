package chapter14_refactoring.webcomic;

public class Comic {
  public ComicId id;
  public PurchasePoint currentPurchasePoint;

  public boolean isEnabled() {
    return true;
  }

  public boolean isDisabled() {
    return false;
  }
}

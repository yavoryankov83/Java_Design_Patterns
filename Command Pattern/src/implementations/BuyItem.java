package implementations;

import interfaces.Command;

public class BuyItem implements Command {

  private Item item;

  public BuyItem(Item item) {
    this.item = item;
  }

  @Override
  public void execute() {
    item.buy();
  }
}

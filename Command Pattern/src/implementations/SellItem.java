package implementations;

import interfaces.Command;

public class SellItem implements Command {

  private Item item;

  public SellItem(Item item) {
    this.item = item;
  }

  @Override
  public void execute() {
    item.sell();
  }
}

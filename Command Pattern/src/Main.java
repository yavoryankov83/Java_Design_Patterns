import implementations.BuyItem;
import implementations.Dealer;
import implementations.Item;
import implementations.SellItem;

public class Main {

  public static void main(String[] args) {
    Item item = new Item("Audi car", 3);

    BuyItem buyItem = new BuyItem(item);
    SellItem sellItem = new SellItem(item);

    Dealer dealer = new Dealer();

    dealer.takeCommand(buyItem);
    dealer.takeCommand(sellItem);

    dealer.executeCommands();
  }
}

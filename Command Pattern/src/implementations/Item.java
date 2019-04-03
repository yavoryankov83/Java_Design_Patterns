package implementations;

public class Item {

  private String name;
  private int quantity;

  public Item(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public void buy() {
    System.out.println(String.format("%s %d bought", this.name, this.quantity));
  }

  public void sell() {
    System.out.println(String.format("%s %d sold", this.name, this.quantity));
  }
}

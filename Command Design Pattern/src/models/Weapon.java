package models;

public class Weapon {

  private String name;
  private int quantity;

  public Weapon(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public void sell() {
    System.out.println(String.format("Stock %s, sold %d quantity.", this.name, this.quantity));
  }

  public void buy() {
    System.out.println(String.format("Stock %s, bought %d quantity.", this.name, this.quantity));
  }
}

package models;

public class Beer extends Drink {
  @Override
  public String name() {
    return "It is BEER time";
  }

  @Override
  public double price() {
    return 5.5;
  }
}

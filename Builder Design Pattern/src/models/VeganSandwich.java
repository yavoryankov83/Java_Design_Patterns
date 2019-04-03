package models;

public class VeganSandwich extends Sandwich {

  @Override
  public String name() {
    return "This is vegan sandwich";
  }

  @Override
  public double price() {
    return 1.5;
  }
}

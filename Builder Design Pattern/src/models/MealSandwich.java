package models;

public class MealSandwich extends Sandwich {

  @Override
  public String name() {
    return "This is meal sandwich";
  }

  @Override
  public double price() {
    return 2.5;
  }
}

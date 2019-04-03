package models;

import interfaces.ItemForSale;
import interfaces.Packing;

public abstract class Drink implements ItemForSale {

  @Override
  public Packing packing() {
    return new Wrapper();
  }

  @Override
  public abstract double price();
}

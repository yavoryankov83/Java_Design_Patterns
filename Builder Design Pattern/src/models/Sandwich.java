package models;

import interfaces.ItemForSale;
import interfaces.Packing;

public abstract class Sandwich implements ItemForSale {

  @Override
  public Packing packing() {
    return new Can();
  }

  @Override
  public abstract double price();
}

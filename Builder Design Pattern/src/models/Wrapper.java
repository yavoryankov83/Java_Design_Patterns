package models;

import interfaces.Packing;

public class Wrapper implements Packing {

  @Override
  public String pack() {
    return "Packed in wrapper";
  }
}

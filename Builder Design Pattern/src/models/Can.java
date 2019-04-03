package models;

import interfaces.Packing;

public class Can implements Packing {

  @Override
  public String pack() {
    return "Packed in can";
  }
}

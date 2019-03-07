package model_types;

import interfaces.Car;

public class Audi implements Car {

  @Override
  public String startEngine() {
    return "AUDI is starting systems";
  }

  @Override
  public String travel() {
    return "Travelling with AUDI";
  }
}

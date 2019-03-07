package model_types;

import interfaces.Car;

public class Bmw implements Car {

  @Override
  public String startEngine() {
    return "BMW is starting systems";
  }

  @Override
  public String travel() {
    return "Travelling with BMW";
  }
}

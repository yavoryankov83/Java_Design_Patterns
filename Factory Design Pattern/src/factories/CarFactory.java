package factories;

import interfaces.Car;
import model_types.Audi;
import model_types.Bmw;

public final class CarFactory {

  public static Car createCar(String carType) {
    switch (carType.toLowerCase()) {
      case "bmw":
        return new Bmw();
      case "audi":
        return new Audi();
      default:
        return null;
    }
  }
}

import factories.CarFactory;
import interfaces.Car;

public class Main {
  public static void main(String[] args) {

    Car carAudi = CarFactory.createCar("Audi");
    System.out.println(carAudi.startEngine());
    System.out.println(carAudi.travel());

    Car carBmw = CarFactory.createCar("Bmw");
    System.out.println(carBmw.startEngine());
    System.out.println(carBmw.travel());
  }
}

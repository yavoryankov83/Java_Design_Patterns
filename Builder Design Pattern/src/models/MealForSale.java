package models;

import interfaces.ItemForSale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MealForSale {

  private List<ItemForSale> itemForSales;

  public MealForSale() {
    this.itemForSales = new ArrayList<>();
  }

  public void addItem(ItemForSale item) {
    this.itemForSales.add(item);
  }

  public double getItemsListCost() {
    return this.itemForSales
            .stream()
            .map(ItemForSale::price)
            .mapToDouble(Double::doubleValue)
            .sum();

//    return this.itemForSales
//            .stream()
//            .map(ItemForSale::price)
//            .collect(Collectors.summingDouble(n -> n));

//    return this.itemForSales
//            .stream()
//            .reduce(0.0, (output, e) -> output + e.price(), (a, b) -> a + b);
  }

  public void printItemInfo() {

    for (ItemForSale item : itemForSales) {
      System.out.print("Item: " + item.name());
      System.out.print(", Packing: " + item.packing().pack());
      System.out.println(", Price: " + item.price());
    }
  }
}

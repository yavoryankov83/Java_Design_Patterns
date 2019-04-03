import builders.MealBuilder;
import models.MealForSale;

public class Main {

  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    MealForSale mealMenu = mealBuilder.prepareMealMenu();
    mealMenu.printItemInfo();
    System.out.println(mealMenu.getItemsListCost());

    MealForSale veganMenu = mealBuilder.prepareVeganMenu();
    veganMenu.printItemInfo();
    System.out.println(veganMenu.getItemsListCost());

  }
}

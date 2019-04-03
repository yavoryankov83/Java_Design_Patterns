package builders;

import models.*;

public class MealBuilder {

  public MealForSale prepareMealMenu() {
    MealForSale mealForSale = new MealForSale();

    mealForSale.addItem(new MealSandwich());
    mealForSale.addItem(new Beer());

    return mealForSale;
  }

  public MealForSale prepareVeganMenu() {
    MealForSale mealForSale = new MealForSale();

    mealForSale.addItem(new VeganSandwich());
    mealForSale.addItem(new Fanta());

    return mealForSale;
  }
}

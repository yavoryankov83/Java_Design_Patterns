package models;

import interfaces.Commander;

public class WeaponBuyer implements Commander {

  private Weapon weapon;

  public WeaponBuyer(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void executeCommand() {
    this.weapon.buy();
  }
}

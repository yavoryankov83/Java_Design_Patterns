package models;

import interfaces.Commander;

public class WeaponSeller implements Commander {

  private Weapon weapon;

  public WeaponSeller(Weapon weapon) {
    this.weapon = weapon;
  }

  @Override
  public void executeCommand() {
    this.weapon.sell();
  }
}

import models.Agent;
import models.Weapon;
import models.WeaponBuyer;
import models.WeaponSeller;

public class Main {
  public static void main(String[] args) {

    Weapon weapon = new Weapon("Kalashnikov", 15);

    WeaponBuyer weaponBuyer = new WeaponBuyer(weapon);
    WeaponSeller weaponSeller = new WeaponSeller(weapon);

    Agent agent = new Agent();
    agent.takeCommand(weaponBuyer);
    agent.takeCommand(weaponSeller);

    agent.placeCommand();
  }
}

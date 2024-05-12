package main_templates;

import map.Coordinates;

/**
 * Класс, отвечающий за персонажей ближнего боя
 *
 * @param ability оотвечает за навыки владения оружием (если равен 50%, то
 *                персонаж попадет по противнику с такой вероятностью)
 */
public abstract class MeleeCharacter extends Character {

  protected Double ability;

  public MeleeCharacter(String name, int lvl, int power, int hp, int speed, int defense, Double ability,
      Coordinates position) {
    super(name, lvl, power, hp, speed, defense, position);
    this.ability = ability;
  }

  public MeleeCharacter(String name, Coordinates position) {
    this(null, 1, 2, 50, 1, 20, 0.1, position);
    this.name = name;
    this.ability = 0.7;
  }

  @Override
  public void printExtendedInfo() {

    System.out.println(String.format("power = %d | speed = %d | defense = %d | ability = %f",
        this.power, this.speed, this.defense, this.ability));

    System.out.println("-------".repeat(13));
  }
}

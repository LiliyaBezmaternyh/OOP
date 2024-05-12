package main_templates;

import map.Coordinates;

/**
 * Класс, отвечающий за персонажей дальнего боя
 *
 * @param accuracy отвечает за точность стрельбы
 * @param range    отвечает за дальность стрельбы
 */
public abstract class RangeCharacter extends Character {

  protected Double accuracy;
  protected int range;

  public RangeCharacter(String name, int lvl, int power, int hp, int speed, int defense, Double accuracy, int range,
      Coordinates position) {
    super(name, lvl, power, hp, speed, defense, position);
    this.accuracy = accuracy;
    this.range = range;
  }

  public RangeCharacter(String name, Coordinates position) {
    this(null, 1, 5, 40, 1, 3, 0.0, 0, position);
    this.name = name;
    this.accuracy = r.nextDouble();
    this.range = 10;
  }

  @Override
  public void printExtendedInfo() {

    System.out
        .println(String.format("power = %d | speed = %d | defense = %d | accuracy = %f | range = %d",
            this.power, this.speed, this.defense, this.accuracy, this.range));

    System.out.println("-------".repeat(13));
  }
}
// String name, int lvl, int power, int hp, int speed, int defense

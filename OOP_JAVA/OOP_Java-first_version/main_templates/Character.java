package main_templates;

import java.util.Random;

import map.Coordinates;

/**
 * Базовый класс, на котором основаны все другие персонажи
 */
public abstract class Character implements CharacterInterface {

  protected String name;
  private int level;
  protected int power;
  private int health;
  protected int speed;
  protected int defense;
  protected Random r = new Random();
  protected Coordinates position;

  public Character(String name, int lvl, int power, int hp, int speed, int defense, Coordinates position) {
    this.name = name;
    this.level = lvl;
    this.power = power;
    this.health = hp;
    this.speed = speed;
    this.defense = defense;
    this.position = position;
  }

  @Override
  public void printCharInfo() {
    System.out.println(
        String.format(
            "name-> %s  | lvl = %d | hp = %d | type: %s  | position--> %s",
            this.name, this.level, this.health, this.getClass().getSimpleName(), this.position));
  }

  @Override
  public String getCharInfo() {
    return String.format(
        "nm: %s, lvl: %d, hp: %d, sp: %s, df %d",
        this.name, this.level, this.health, this.speed, this.defense);
  }

  // public String getInfo() {
  // return String.format("nm: %s, cl: %s, st: %s, hp: %d/%d, dmg: %d, def: %d,
  // init: %d,", this.name.name(), this.toString(), this.state.name(), this.hp,
  // this.maxHp, this.damage, this.defense, this.initiative);
  // }

  public Coordinates getCoordinates() {
    return position;
  }

  public boolean isDead() {
    if (health <= 0)
      return true;
    return false;
  }

  public void attack(Character target) {
    target.health -= power * level * 0.5;
  }

  public void getDamage(Character currentCharacter) {
    currentCharacter.health -= power * level * 0.5;
  }

  public void healing(Character target) {
    target.health += power * level * 0.5;
  }

  public void getTreatment(Character currentCharacter) {
    currentCharacter.health += power * level * 0.5;
  }
}

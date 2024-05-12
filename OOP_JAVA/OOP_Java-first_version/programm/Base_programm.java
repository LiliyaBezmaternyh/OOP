package programm;

import characters.*;
import java.util.ArrayList;
import java.util.Random;

// import main_templates.*;
import main_templates.Character;
import map.Coordinates;
import views.*;

public class Base_programm {
  public static ArrayList<Character> team1 = new ArrayList<>();
  public static ArrayList<Character> team2 = new ArrayList<>();
  public static ArrayList<Character> allTeam = new ArrayList<>();

  public static void main(String[] args) {
    System.out.println();

    int teamslength = 11;
    fillArray(team1, teamslength, 1);
    fillArray(team2, teamslength, 10);
    allTeam.addAll(team1);
    allTeam.addAll(team2);
    printArray(team1);
    System.out.println("---".repeat(13));
    printArray(team2);
    View.view();

    // int minDistance = Coordinates.getMinDistance(team1, team2);
    // System.out.println(minDistance);

    // rangeCharacter hero1 = new Enchanter("buffer", 1, 1);
    // hero1.getCharInfo();
    // hero1.step();
    // hero1.getExtendedInfo();

    // character hero2 = new Marksman("shooter", 9, 9);
    // hero2.getCharInfo();
    // hero2.step();
    // hero2.getExtendedInfo();

    // System.out.println(coordinates.getDistance(hero1, hero2));
  }

  /**
   * Метод для заполнения армии существами
   *
   * @param array       армия с существами
   * @param arrayLenght кол-во существ в армии
   */
  public static void fillArray(ArrayList<Character> array, int arrayLenght, int posX) {
    int key;
    for (int i = 0; i < arrayLenght; i++) {
      key = new Random().nextInt(0, 6);
      switch (key) {

        case 0:
          array.add(new Enchanter(new Coordinates(posX, i)));
          break;

        case 1:
          array.add(new Marksman(new Coordinates(posX, i)));
          break;

        case 2:
          array.add(new Peasant(new Coordinates(posX, i)));
          break;

        case 3:
          array.add(new Pikeman(new Coordinates(posX, i)));
          break;

        case 4:
          array.add(new Priest(new Coordinates(posX, i)));
          break;

        case 5:
          array.add(new Rogue(new Coordinates(posX, i)));
          break;

        case 6:
          array.add(new Sniper(new Coordinates(posX, i)));
          break;
      }
    }
  }

  /**
   * Метод информирующий про существ в армии
   *
   * @param array     армия с существами
   * @param charCount подсчет кол-ва существ в армии
   */
  public static void printArray(ArrayList<Character> array) {
    int charCount = array.size();
    array.forEach(el -> el.getCharInfo());
    System.out.printf("Кол-во существ в команде равно %d", charCount);
    System.out.println();
  }

  // character hero2 = new Marksman("shooter");
  // hero2.getCharInfo();
  // hero2.step();
  // hero2.getExtendedInfo();

  // Priest hero3 = new Priest("healer");
  // hero3.getCharInfo();
  // hero3.step();
  // hero3.getExtendedInfo();

  // rangeCharacter hero4 = new Sniper("shooter");
  // hero4.getCharInfo();
  // hero4.step();
  // hero4.getExtendedInfo();

  // Peasant hero5 = new Peasant("support");
  // hero5.getCharInfo();
  // hero5.step();
  // hero5.getExtendedInfo();

  // meleeCharacter hero6 = new Pikeman("warrior");
  // hero6.getCharInfo();
  // hero6.step();
  // hero6.getExtendedInfo();

  // meleeCharacter hero7 = new Rogue("warrior");
  // hero7.getCharInfo();
  // hero7.step();
  // hero7.getExtendedInfo();
}

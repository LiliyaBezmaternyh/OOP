package characters;

import main_templates.RangeCharacter;
import map.Coordinates;

/**
 * Колдун
 */
public class Enchanter extends RangeCharacter {

  public Enchanter(Coordinates position) {
    super("Enchanter", 5, 8, 65, 1, 4, 0.0, 0, position);
    // this.name = name;
    this.accuracy = 0.9;
    this.range = 10;
  }

  @Override
  public void step() {
    System.out.println("Усиливает союзника");
  }
}

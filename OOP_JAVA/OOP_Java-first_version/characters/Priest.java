package characters;

import main_templates.RangeCharacter;
import map.Coordinates;

/**
 * Монах
 */
public class Priest extends RangeCharacter {

    public Priest(Coordinates position) {
        super("Priest", 4, 5, 35, 1, 2, 0.0, 0, position);
        // this.name = name;
        this.accuracy = 0.85;
        this.range = 8;
    }

    @Override
    public void step() {
        System.out.println("Лечит союзника");
    }
}

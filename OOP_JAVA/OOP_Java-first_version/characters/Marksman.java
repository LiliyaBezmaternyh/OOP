package characters;

import main_templates.RangeCharacter;
import map.Coordinates;

/**
 * Арбалетчик
 */
public class Marksman extends RangeCharacter {

    public Marksman(Coordinates position) {
        super("Marksman", 3, 4, 60, 2, 8, 0.0, 0, position);
        // this.name = name;
        this.accuracy = 0.6;
        this.range = 8;
    }

    @Override
    public void step() {
        System.out.println("Стреляет из арбалета");
    }
}

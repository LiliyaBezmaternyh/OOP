package characters;

import main_templates.MeleeCharacter;
import map.Coordinates;

/**
 * Копейщик
 */
public class Pikeman extends MeleeCharacter {

    public Pikeman(Coordinates position) {
        super("Pikeman", 3, 7, 80, 1, 10, 0.0, position);
        // this.name = name;
        this.ability = 0.8;
    }

    @Override
    public void step() {
        System.out.println("Наносит удар пикой");
    }
}

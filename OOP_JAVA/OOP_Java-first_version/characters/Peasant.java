package characters;

import main_templates.MeleeCharacter;
import map.Coordinates;

/**
 * Класс для крестьянина
 */
public class Peasant extends MeleeCharacter {

    public Peasant(Coordinates position) {
        super("Peasant", 1, 2, 35, 1, 2, 0.0, position);
        // this.name = name;
        this.ability = 0.5;
    }

    @Override
    public void step() {
        System.out.println("Приносит стрелу арбалетчику");
    }
}

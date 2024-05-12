package characters;

import main_templates.MeleeCharacter;
import map.Coordinates;

/**
 * Разбойник
 */
public class Rogue extends MeleeCharacter {

    public Rogue(Coordinates position) {
        super("Rogue", 4, 9, 70, 2, 5, 0.0, position);
        // this.name = name;
        this.ability = 0.95;
    }

    @Override
    public void step() {
        System.out.println("Отвлекает противника и заставляет пропускать ход");
    }
}

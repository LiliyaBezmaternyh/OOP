package characters;

import main_templates.RangeCharacter;
import map.Coordinates;

/**
 * Стрелок дальнего боя
 */
public class Sniper extends RangeCharacter {

    public Sniper(Coordinates position) {
        super("Sniper", 5, 7, 50, 2, 4, 0.0, 0, position);
        // this.name = name;
        this.accuracy = 0.9;
        this.range = 10;
    }

    @Override
    public void step() {
        System.out.println("Стреляет из лука");
    }
}

package org.ies.tierno.zoos.components.random;

import org.ies.tierno.zoos.components.readers.Reader;
import org.ies.tierno.zoos.models.Herbivorous;

import java.util.Random;

public class RandomHerbivorousReader implements Reader <Herbivorous> {
    private final Random random;
    private final static String[] SPECIE = {
            "Elefante", "Jirafa", "Vaca", "Cebra"
    };
    private final static String[] NAMES = {
            "Manolo", "Pepe", "Eulalio", "Rodolfo"
    };
    private final static String[] DIET = {
        "Plantas", "Semillas", "frutos", "Hierbas"
    };

    public RandomHerbivorousReader(Random random) {
        this.random = random;
    }

    @Override
    public Herbivorous read() {
        String specie = SPECIE[random.nextInt(SPECIE.length)];
        int age = random.nextInt(50);
        String name = NAMES[random.nextInt(NAMES.length)];
        String diet = DIET[random.nextInt(DIET.length)];

        return new Herbivorous(specie,age,name,diet);

    }
}

package org.ies.tierno.zoos.components.random;

import org.ies.tierno.zoos.components.Reader;
import org.ies.tierno.zoos.models.Carnivorous;

import java.util.Random;

public class RandomCarnivorousReader implements Reader<Carnivorous> {
    private final Random random;

    public RandomCarnivorousReader(Random random) {
        this.random = random;
    }
    private final static String[] SPECIE = {
            "Leon", "Tigre", "Gacela", "Perro"
    };
    private final static String[] NAMES = {
            "Manolo", "Pepe", "Eulalio", "Rodolfo"
    };
    private final static String[] DIET = {
            "Carne",
    };

    @Override
    public Carnivorous read() {
        String specie = SPECIE[random.nextInt(SPECIE.length)];
        int age = random.nextInt(50);
        String name = NAMES[random.nextInt(NAMES.length)];
        String diet = DIET[random.nextInt(DIET.length)];
        return new Carnivorous(specie,age,name,diet);
    }
}

package org.ies.tierno.zoos.components.random;

import org.ies.tierno.zoos.components.Reader;
import org.ies.tierno.zoos.models.Animal;
import org.ies.tierno.zoos.models.Carnivorous;
import org.ies.tierno.zoos.models.Herbivorous;

import java.util.Random;

public class RandomAnimalReader implements Reader<Animal> {
    private final Random random;
    private final Reader<Carnivorous> carnivorousReader;
    private final Reader<Herbivorous> herbivorousReader;

    public RandomAnimalReader(Random random, Reader<Carnivorous> carnivorousReader, Reader<Herbivorous> herbivorousReader) {
        this.random = random;
        this.carnivorousReader = carnivorousReader;
        this.herbivorousReader = herbivorousReader;
    }

    @Override
    public Animal read() {
        int type = random.nextInt(2);
        if (type == 0) {
            return carnivorousReader.read();
        } else {
            return herbivorousReader.read();
        }
    }
}


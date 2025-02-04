package org.ies.tierno.zoos.components.random;

import org.ies.tierno.zoos.models.Fanced;
import org.ies.tierno.zoos.models.Zoo;
import org.ies.tierno.zoos.components.readers.Reader;
import org.ies.tierno.zoos.models.Animal;
import org.ies.tierno.zoos.models.Carnivorous;
import org.ies.tierno.zoos.models.Herbivorous;

import java.util.Random;

public class RandomZooReader implements Reader<Zoo> {
    private final Random random;
    private final Reader<Fanced<Herbivorous>> herbivorousFancedReader;
    private final Reader<Fanced<Carnivorous>> carnivorousFancedReader;
    private final Reader<Fanced<Animal>> animalFancedReader;

    public RandomZooReader(Random random, Reader<Fanced<Herbivorous>> herbivorousFancedReader, Reader<Fanced<Carnivorous>> carnivorousFancedReader, Reader<Fanced<Animal>> animalFancedReader) {
        this.random = random;
        this.herbivorousFancedReader = herbivorousFancedReader;
        this.carnivorousFancedReader = carnivorousFancedReader;
        this.animalFancedReader = animalFancedReader;
    }

    private final static String[] NAMES = {"Zoo MAdrid", "Zoo Barcelona", "Zoo Sevilla"};

    @Override
    public Zoo read() {
        return new Zoo(NAMES[random.nextInt(NAMES.length)],
                carnivorousFancedReader.read(),
                herbivorousFancedReader.read(),
                animalFancedReader.read()
                );

    }
}

package org.ies.tierno.zoos.components.random;

import org.ies.tierno.zoos.models.Fanced;
import org.ies.tierno.zoos.components.readers.Reader;
import org.ies.tierno.zoos.models.Animal;

import java.util.Random;

public class RandomFancedReader<T extends Animal> implements Reader<Fanced<T>> {
    private final Random random;
    private final Reader<T> animalReader;

    public RandomFancedReader(Random random, Reader<T> animalReader) {
        this.random = random;
        this.animalReader = animalReader;
    }

    @Override
    public Fanced<T> read() {
        int numberFanced = random.nextInt(1000000);
        T[] animals = (T[])new Animal[random.nextInt(50)];
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalReader.read();
        }
        return new Fanced<>(numberFanced, animals);
    }
}

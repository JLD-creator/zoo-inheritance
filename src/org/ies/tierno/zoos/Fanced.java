package org.ies.tierno.zoos;

import org.ies.tierno.zoos.models.Animal;

import java.util.Arrays;
import java.util.Objects;

public class Fanced<T extends Animal> {
    public int fancedNumber;
    public T[] animal;

    public Fanced(int fancedNumber, T[] animal) {
        this.fancedNumber = fancedNumber;
        this.animal = animal;
    }

    public int getFancedNumber() {
        return fancedNumber;
    }

    public void setFancedNumber(int fancedNumber) {
        this.fancedNumber = fancedNumber;
    }

    public T[] getAnimal() {
        return animal;
    }

    public void setAnimal(T[] animal) {
        this.animal = animal;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fanced<?> fanced = (Fanced<?>) o;
        return fancedNumber == fanced.fancedNumber && Objects.deepEquals(animal, fanced.animal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fancedNumber, Arrays.hashCode(animal));
    }

    @Override
    public String toString() {
        return "Fanced{" +
                "fancedNumber=" + fancedNumber +
                ", animal=" + Arrays.toString(animal) +
                '}';
    }
}



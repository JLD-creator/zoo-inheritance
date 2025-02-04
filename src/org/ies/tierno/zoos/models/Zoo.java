package org.ies.tierno.zoos.models;

import java.util.Arrays;

public class Zoo {
    public String name;
    public Fanced<Carnivorous> carnivorousFanced;
    public Fanced<Herbivorous> herbivorousFanced;
    public Fanced<Animal> animalFanced;

    public Zoo(String name, Fanced<Carnivorous> carnivorousFanced, Fanced<Herbivorous> herbivorousFanced, Fanced<Animal> animalFanced) {
        this.name = name;
        this.carnivorousFanced = carnivorousFanced;
        this.herbivorousFanced = herbivorousFanced;
        this.animalFanced = animalFanced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fanced<Carnivorous> getCarnivorousFanced() {
        return carnivorousFanced;
    }

    public void setCarnivorousFanced(Fanced<Carnivorous> carnivorousFanced) {
        this.carnivorousFanced = carnivorousFanced;
    }

    public Fanced<Herbivorous> getHerbivorousFanced() {
        return herbivorousFanced;
    }

    public void setHerbivorousFanced(Fanced<Herbivorous> herbivorousFanced) {
        this.herbivorousFanced = herbivorousFanced;
    }

    public Fanced<Animal> getAnimalFanced() {
        return animalFanced;
    }

    public void setAnimalFanced(Fanced<Animal> animalFanced) {
        this.animalFanced = animalFanced;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "age='" + name + '\'' +
                ", carnivorousFanced=" + carnivorousFanced +
                ", herbivorousFanced=" + herbivorousFanced +
                ", animalFanced=" + animalFanced +
                '}';
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println("Area de herbívoros " + herbivorousFanced.getFancedNumber());
        System.out.println(Arrays.toString(herbivorousFanced.getAnimal()));

        System.out.println("Area de carnívoros " + carnivorousFanced.getFancedNumber());
        System.out.println(Arrays.toString(carnivorousFanced.getAnimal()));

        System.out.println("Area de animales " + animalFanced.getFancedNumber());
        System.out.println(Arrays.toString(animalFanced.getAnimal()));
    }
}



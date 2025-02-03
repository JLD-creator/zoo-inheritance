package org.ies.tierno.zoos;

import java.util.Objects;

public class Herbivorous extends Animal {
    public String plant;

    public Herbivorous(String specie, int age, String nanme, String diet) {
        super(specie, age, nanme);
        this.plant = diet;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivorous that = (Herbivorous) o;
        return Objects.equals(plant, that.plant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), plant);
    }

    @Override
    public String toString() {
        return "Herbivorous{" +
                "plant='" + plant + '\'' +
                ", specie='" + specie + '\'' +
                ", age=" + age +
                ", nanme='" + nanme + '\'' +
                '}';
    }
}


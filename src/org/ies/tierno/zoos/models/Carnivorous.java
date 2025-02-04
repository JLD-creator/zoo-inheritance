package org.ies.tierno.zoos.models;

import java.util.Objects;

public class Carnivorous extends Animal {
    public String diet;

    public Carnivorous(String specie, int age, String nanme, String diet) {
        super(specie, age, nanme);
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carnivorous that = (Carnivorous) o;
        return Objects.equals(diet, that.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), diet);
    }

    @Override
    public String toString() {
        return "Carnivorous{" +
                "diet='" + diet + '\'' +
                ", specie='" + specie + '\'' +
                ", age=" + age +
                ", nanme='" + name + '\'' +
                '}';
    }
}

package org.ies.tierno.zoos;

import java.util.Objects;

public abstract class Animal {
    protected String specie;
    protected int age;
    protected String nanme;

    public Animal(String specie, int age, String nanme) {
        this.specie = specie;
        this.age = age;
        this.nanme = nanme;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNanme() {
        return nanme;
    }

    public void setNanme(String nanme) {
        this.nanme = nanme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(specie, animal.specie) && Objects.equals(nanme, animal.nanme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specie, age, nanme);
    }
}


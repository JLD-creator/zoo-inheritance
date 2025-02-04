package org.ies.tierno.zoos.models;

import java.util.Objects;

public abstract class Animal {
    protected String specie;
    protected int age;
    protected String name;

    public Animal(String specie, int age, String name) {
        this.specie = specie;
        this.age = age;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(specie, animal.specie) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specie, age, name);
    }
}


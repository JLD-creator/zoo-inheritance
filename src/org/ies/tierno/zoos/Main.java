package org.ies.tierno.zoos;

import org.ies.tierno.zoos.components.random.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RandomCarnivorousReader randomCarnivorousReader = new RandomCarnivorousReader(random);
        RandomHerbivorousReader randomHerbivorousReader = new RandomHerbivorousReader(random);
        RandomAnimalReader randomAnimalReader = new RandomAnimalReader(random, randomCarnivorousReader,randomHerbivorousReader);
        var randomFancedReader = new RandomFancedReader<>(random,randomAnimalReader);
        var herbivorousAreaReader = new RandomFancedReader<>(random,randomHerbivorousReader);
        var carnivorousAreaReader = new RandomFancedReader<>(random,randomCarnivorousReader);
        var zooReader = new RandomZooReader(random,herbivorousAreaReader,carnivorousAreaReader,randomFancedReader);
        var zoo  = zooReader.read();
        zoo.showInfo();
    }
}
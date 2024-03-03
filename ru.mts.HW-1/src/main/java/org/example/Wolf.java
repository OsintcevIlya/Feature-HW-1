package org.example;

public class Wolf extends Predator{
    public Wolf(String breed, String name, Double cost, String character) {
        //super(breed, name, cost, character);
        super(breed, cost, character);
        name= name + " - Волк";
    }
}

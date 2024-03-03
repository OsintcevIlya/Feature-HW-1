package org.example;

public class Predator extends AbstractAnimal{
    public Predator(String breed, String name, Double cost, String character) {
        //super(breed, name, cost, character);
        super(breed, "Хищник", cost, character);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Predator{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
}

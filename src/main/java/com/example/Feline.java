package com.example;

import java.util.List;

import java.util.List;

interface IFeline {
    public int getKittens();
    List<String> getFood(String animalKind) throws Exception;
};

public class Feline extends Animal implements Predator, IFeline {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}

package org.velezreyes.quiz.question6.drinks;

import org.velezreyes.quiz.question6.Drink;

public class ScottCola implements Drink {

    @Override
    public String getName() {
        return "ScottCola";
    }

    @Override
    public boolean isFizzy() {
        return true;
    }
}
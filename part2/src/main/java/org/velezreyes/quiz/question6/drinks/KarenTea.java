package org.velezreyes.quiz.question6.drinks;

import org.velezreyes.quiz.question6.Drink;

public class KarenTea implements Drink {

    @Override
    public String getName() {
        return "KarenTea";
    }

    @Override
    public boolean isFizzy() {
        return false;
    }
}
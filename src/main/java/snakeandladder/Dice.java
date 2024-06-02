package snakeandladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private int diceStart;

    private int diceEnd;

    public Dice(){
        diceStart=1;
        diceEnd=6;
    }

    public int rollDice(){
        return ThreadLocalRandom.current().nextInt(diceStart,diceEnd+1);
    }

}

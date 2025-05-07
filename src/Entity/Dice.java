package Entity;

import java.util.Random;

public class Dice {
    int faces;
    Random random = new Random();
    public Dice() {
    }

    public int throwDice(){
        return 3;
    }
}

package Entity;

import java.util.Random;

public class Dice {
    int faces;
    Random random;
    public Dice(int faces) {
        this.faces = faces;
        random = new Random();
    }

    public int throwDice(){
        return random.nextInt(faces)+1;
    }
}

package Entity;

public class Player {
    String color;
    Box currentPosition;
    Integer currVal;

    public Player(String color, Integer currVal) {
        this.color = color;
        this.currVal = currVal;
    }

    public String getColor() {
        return color;
    }

    public Box getCurrentPosition() {
        return currentPosition;
    }
}

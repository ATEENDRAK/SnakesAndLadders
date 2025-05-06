package Entity;

public class Player {
    String color;
    Box currentPosition;

    public String getColor() {
        return color;
    }

    public Box getCurrentPosition() {
        return currentPosition;
    }

    public Player(String color) {
        this.color = color;
    }
}

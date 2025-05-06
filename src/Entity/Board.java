package Entity;

import java.util.List;

public class Board {
    List<Box> boxes;
    List<Snake> snakes;
    List<Ladder> ladders;

    public Board(List<Box> boxes, List<Snake> snakes, List<Ladder> ladders) {
        this.boxes = boxes;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }



    void applySnakeAndLadder(Player player){
        for(Snake snake : snakes){
            if(player.currentPosition.num.equals(snake.mouth))
                player.currentPosition = boxes.get(snake.tail);
        }
        for(Ladder ladder : ladders){
            if(player.currentPosition.num.equals(ladder.bottom))
                player.currentPosition = boxes.get(ladder.top);
        }
    }
}

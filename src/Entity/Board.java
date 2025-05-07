package Entity;

import java.util.List;

public class Board {
    List<Box> boxes;

    List<IBoardEntity> iBoardEntities;

    public Board(List<Box> boxes, List<IBoardEntity> iBoardEntities) {
        this.boxes = boxes;
        this.iBoardEntities = iBoardEntities;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }

    public List<IBoardEntity> getiBoardEntities() {
        return iBoardEntities;
    }

    public void setiBoardEntities(List<IBoardEntity> iBoardEntities) {
        this.iBoardEntities = iBoardEntities;
    }

    void apply(Player player){
        for(IBoardEntity entity : iBoardEntities){
            entity.apply(player, this);
        }
    }
}

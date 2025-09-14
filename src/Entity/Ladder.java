package Entity;

public class Ladder implements IBoardEntity {
    Box bottom;
    Box top;

    public Ladder(Box bottom, Box top) {
        this.bottom = bottom;
        this.top = top;
    }


    @Override
    public void apply(Player player, Board board) {
        if(player.currentPosition.equals(bottom)){
            player.currentPosition = board.getBoxes().get(top.num);
        }
    }
}

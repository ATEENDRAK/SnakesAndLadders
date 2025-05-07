package Entity;

public class Snake implements IBoardEntity{
    Box mouth;
    Box tail;

    public Snake(Box mouth, Box tail) {
        this.mouth = mouth;
        this.tail = tail;
    }

    @Override
    public void apply(Player player, Board board) {
        if(player.currentPosition.equals(mouth)){
            player.currentPosition = board.getBoxes().get(tail.num);
        }
    }
}

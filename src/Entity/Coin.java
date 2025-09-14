package Entity;

public class Coin implements IBoardEntity{
    Box applicablePosition;
    Integer rewardValue;

    public Coin(Box applicablePosition, Integer rewardValue) {
        this.applicablePosition = applicablePosition;
        this.rewardValue = rewardValue;
    }

    @Override
    public void apply(Player player, Board board) {
        if(player.currentPosition.equals(applicablePosition)){
            player.currVal = player.currVal+rewardValue;
        }
    }
}

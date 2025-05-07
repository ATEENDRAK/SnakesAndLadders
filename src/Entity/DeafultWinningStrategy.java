package Entity;

public class DeafultWinningStrategy implements IWinningStrategy{

    @Override
    public boolean isWinner(Player player) {
        if(player.currentPosition.num >= 100)
            return true;
        return false;
    }
}
